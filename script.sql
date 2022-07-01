-- script.sql

drop table tblUser;

-- 회원 테이블
create table tblUser (
    id varchar2(30) primary key, -- 아이디(PK)
    pw varchar2(30) not null, -- 암호
    name varchar2(30) not null, -- 이름
    lv char(1) not null, --등급(1. 일반회원 2. 관리자)
    pic varchar2(100) default 'pic.png' not null, -- 회원 사진
    regdate date default sysdate not null, -- 가입날짜
    active char(1) default 'y' not null -- 탈퇴유무(y. 활동중, n. 탈퇴)
);

insert into tblUser (id, pw, name, lv, pic, regdate) values ('hong', '1111', '홍길동', '1', default, default);
insert into tblUser (id, pw, name, lv, pic, regdate) values ('admin', '1111', '관리자', '2', default, default);

commit;

select * from tblUser;

alter table tblUser
    add (active char(1) default 'y' not null); 
    
delete from tblUser where active = 'n';
commit;

-- 게시판
drop table tblComment;
drop table tblBoard;
create table tblBoard (
    seq number primary key, --글번호
    subject varchar2(300) not null, -- 제목
    content varchar2(4000) not null, -- 내용
    id varchar2(30) not null references tblUser(id), --아이디(FK)
    regdate date default sysdate not null, -- 작성시간
    readcount number default 0 not null, -- 조회수
     thread number not null,
    depth number not null
);
drop sequence seqBoard;
create sequence seqBoard;

select * from tblBoard;

create or replace view vwBoard
as
select seq, subject, content, id, (select name from tblUser where id = tblBoard.id) as name, regdate, readcount
from tblBoard order by seq desc;

select * from vwBoard;

commit;

-- 댓글 테이블
create table tblComment (
    seq number primary key, --댓글번호
    content varchar2(1000) not null, --내용
    id varchar2(30) not null references tblUser(id), --아이디
    regdate date default sysdate not null --날짜
);

create sequence seqComment;

-- 게시판 뷰
create or replace view vwBoard
as
select seq, subject, content, id, (select name from tblUser where id = tblBoard.id) as name, regdate, readcount,
(select count(*) from tblComment where pseq = tblBoard.seq) as commentcount, depth, (sysdate - regdate) as isnew, filename 
from tblBoard order by thread desc;

select * from tblUser;

select * from tblBoard;

-- 페이징
select * from (select a.*, rownum as rnum from vwBoard a) where rnum between 1 and 10;
select * from (select a.*, rownum as rnum from vwBoard a) where rnum between 11 and 20;
select * from (select a.*, rownum as rnum from vwBoard a) where rnum between 21 and 30;

drop table tblComment;
drop table tblBoard;

commit;

select * from tblBoard;
select * from vwBoard;

-- 게시판
create table tblBoard (
    seq number primary key, --글번호
    subject varchar2(300) not null, -- 제목
    content varchar2(4000) not null, -- 내용
    id varchar2(30) not null references tblUser(id), --아이디(FK)
    regdate date default sysdate not null, -- 작성시간
    readcount number default 0 not null, -- 조회수
     thread number not null,
    depth number not null
);

drop table tblComment;
drop table tblBoard;

-- 게시판
create table tblBoard (
    seq number primary key, --글번호
    subject varchar2(300) not null, -- 제목
    content varchar2(4000) not null, -- 내용
    id varchar2(30) not null references tblUser(id), --아이디(FK)
    regdate date default sysdate not null, -- 작성시간
    readcount number default 0 not null, -- 조회수
     thread number not null, -- 답변형 게시판
    depth number not null, -- 답변형 게시판
    filename varchar2(100) null, -- 첨부파일
    orgfilename varchar2(100) null --첨부파일
);

create table tblComment (

    seq number primary key,                                     --댓글번호(PK)
    content varchar2(1000) not null,                            --내용
    id varchar2(30) not null references tblUser(id),            --아이디(FK)
    regdate date default sysdate not null,                      --날짜
    pseq number not null references tblBoard(seq)               --부모글번호(FK)

);

commit;

select * from tblBoard;
select * from tblComment;
select * from vwBoard;

commit;

-- 해시 태그 테이블
create table tblHashTag (
    seq number primary key, --번호
    tag varchar2(100) unique not null --해시태그
);

create sequence seqHashTag;

-- 게시판 < (연결) > 해시태그
create table tblTagging (
    seq number primary key, -- 번호
    bseq number not null references tblBoard(seq), --게시물
    hseq number not null references tblHashTag(seq) -- 해시태그
);

create sequence seqTagging;

select * from tblBoard;

select * from tblHashTag;

select * from tblTagging;

select max(seq) from tblBoard;

select * from tblHashTag h inner join tblTagging t on h.seq = t.hseq where bseq = 294;

select b.* from vwBoard b
    inner join tblTagging t
        on b.seq = t.bseq
            inner join tblHashTag h
                on h.seq = t.hseq where h.tag='JSON';
                
create table tblGoodBad (
    seq number primary key,
    id varchar2(30) not null references tblUser(id),
    bseq number not null references tblBoard(seq),
    good number default 0 not null,
    bad number default 0 not null
);

create sequence seqGoodBad;