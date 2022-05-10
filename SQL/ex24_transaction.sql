-- ex24_transaction.sql

/*

    트랜잭션, Transaction
    - 데이터를 조직하는 업무의 물리적(시간적) 단위
    - 1개 이상의 명령어(행동, SQL)로 구성된 작업 단위(기간)
    - 1개 이상의 명령어를 하나의 목적(논리 집합)으로 묶어 놓은 단위
    
    트랜잭션 명령어, DCL(TCL)
    1. COMMIT
    2. ROLLBACK
    3. SAVEPOINT

*/

create table tblTrans
as
select name, buseo, jikwi from tblInsa where city = '서울';

select * from tblTrans;

-- 로그인(접속) > 트랜잭션이 시작됨.

-- INSERT, UPDATE, DELETE 명렁여는 실행 즉시 데이터베이스에 반영되지 않는다.
--> 임시 적용한다.
delete from tblTrans where name = '박문수';

select * from tblTrans;

commit; -- "현재 트랜잭션에서 했던 모든 행동"을 진짜 데이터베이스에 반영해라
rollback; -- "현재 트랜잭션에서 했던 모든 행동"을 진짜 데이터베이스에 반영하지말고 없었던 일로 취소해라(되돌려라, 타임머신)

select * from tblTrans; --rollback후 박문수가 살아남

commit; -- 박문수 지우고 승인

select * from tblTrans;

rollback; -- 롤백했도 박문수 안살아남

select * from tblTrans;

delete from tblTrans where name = '김인수';

select * from tblTrans;

update tblCountry set capital = '서울';
select * from tblCountry;

rollback;

update tblCountry set capital = '세종' where name = '대한민국';

select * from tblCountry;

commit;

-- 업무별로 묶기
-- 시간대 별로 묶기

/*

     트랜잭션이 언제 시작하고? 언제 끝나는 지?
     
     새로운 트랜잭션이 시작하는 경우
     1. 클라이언트 접속 직 후
     2. commit 실행 직 후
     3. rollback 실행 직 후
     
     현재 트랜잭션이 종료되는 경우
     1. commit 실행 > 현재 트랜잭션을 DB에 반영함
     2. rollback 실행 > 현재 트랜잭션을 DB에 반영 안함
     3. 클라이언트 접속 종료
        a. 정상 종료
            - 현재 트랜잭션에 아직 반영안된 명령어가 남아있으면 사용자에게 질문?
        b. 비정상 종료
            - 무조건 rollback 처리
    4. DDL 실행
        - CREATE, ALTER, DROP > 실행 > 그 즉시 commit 동반 > Auto Commit
        - DDL 성격 > 구조 변경 > 데이터 영향 O > 사전에 미리 저장(Comit)
        
    클라이언트 도구
    - SQL Developer
    _ AUto Commit 옵션

*/

select * from tblTrans;

commit; -- 지금부터 새로운 트랜잭션이 시작
select * from tblTrans where buseo = '영업부';

-- 자동 커밋 발생
create table tblTest(
    seq number primary key
);

rollback;

select * from tblTrans;

---------------------------------
comit;
select * from tblTrans;
insert into tblTrans values('가가가', '영업부', '부장');
insert into tblTrans values('나나나', '영업부', '과장');

savepoint a; -- 중간 저장

delete from tblTrans where name = '김말숙';

select * from tblTrans;

savepoint b;

delete from tblTrans where buseo = '개발부';

select * from tblTrans;

rollback to b;

select * from tblTrans;
