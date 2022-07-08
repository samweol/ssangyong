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

select * from tblGoodBad;
delete from tblGoodBad where seq = 5;
commit;
select 
    tblBoard.*, (select name from tblUser where id = tblBoard.id) as name,
    nvl((select sum(good) from tblGoodBad where bseq = tblBoard.seq), 0) as good,
    nvl((select sum(bad) from tblGoodBad where bseq = tblBoard.seq), 0) as bad,
    (select 
    case
        when good = 1 then 1
        when bad = 1 then 2
        else 3
    end
    from tblGoodBad where bseq = tblBoard.seq and id = 'hello') as goodbad
from tblBoard where seq = 295;

create table tblFood(
    seq number primary key,
    name varchar2(100) not null,
    lat number not null,
    lng number not null,
    star number(3) not null,
    category number not null references tblCategory(seq)
);

create sequence seqFood;

create table tblCategory(
    seq number primary key,
    name varchar2(100) not null,
    marker varchar2(100) not null,
    icon varchar2(100) not null
);

insert into tblCategory values (1, '한식', 'm1', 'fa-solid fa-bowl-food');
insert into tblCategory values (2, '양식', 'm2', 'fa-solid fa-utensils');
insert into tblCategory values (3, '카페', 'm3', 'fa-solid fa-mug-hot');

commit;

drop table tblFood;
drop table tblCategory;

-- Ajax
-- 설문 테이블(질문) <-> 설문 (항목)
-- 설문 조사
create table tblResearch (
    seq number primary key,
    question varchar2(500) not null,
    item1 varchar2(300) not null, --항목
    item2 varchar2(300) not null,
    item3 varchar2(300) not null,
    item4 varchar2(300) not null,
    cnt1 number default 0 not null, --선택
    cnt2 number default 0 not null, --선택
    cnt3 number default 0 not null, --선택
    cnt4 number default 0 not null --선택
);

insert into tblResearch values (1, '가장 잘 사용하는 프로그래밍 언어는?', 'Java', 'Python', 'Visual C++', 'Node.js', default, default, default, default);

select * from tblResearch;

update tblResearch set cnt1 = 10, cnt2 = 17, cnt3 = 5, cnt4 = 11 where seq = 1;

commit;

select * from tblInsa;

select tblComment.*, (select name from tblUser where id = tblComment.id) as name from tblComment where seq = (select max(seq) from tblComment);

-- Ajax + Draggable
create table tblDraggable (
    id varchar2(30) primary key,
    left number not null,
    top number not null
);

insert into tblDraggable (id, left, top) values ('cat01', 0, 0);
insert into tblDraggable (id, left, top) values ('cat02', 0, 0);
insert into tblDraggable (id, left, top) values ('cat03', 0, 0);

commit;

-- 크롤링, 네이버 영화
create table tblMovie(
    seq number primary key,
    title varchar2(200) not null,
    category varchar2(200) not null,
    time number not null,
    rdate varchar2(10) not null,
    director varchar2(100) not null,
    actor varchar2(200) null,
    poster varchar2(300) not null
);