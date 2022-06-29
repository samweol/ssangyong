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
drop table tblBoard;
create table tblBoard (
    seq number primary key, --글번호
    subject varchar2(300) not null, -- 제목
    content varchar2(4000) not null, -- 내용
    id varchar2(30) not null references tblUser(id), --아이디(FK)
    regdate date default sysdate not null, -- 작성시간
    readcount number default 0 not null -- 조회수
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

