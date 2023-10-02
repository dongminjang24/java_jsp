/*
 * SUB QUERY
 * 
 * FROM 절 : IN LINE VIEW
 * SELECT절: SCALAR
 * WHERE절: SUB QUERY
 * 
 */
 
/*PLAYER 테이블에서 전체 평균 키와 포지션별 평균 키 구하기*/
SELECT "POSITION" AVG(HEIGHT) "그룹 별 평균",(SELECT AVG(HEIGHT) FROM PLAYER) "전체 평균 키" FROM PLAYER
WHERE "POSITION" IS NOT NULL
GROUP BY "POSITION";

/*PLAYER 테이블에서 TEAM_ID가 "K01"인 선수 중에서 "POSITION"이 'GK'인 선수*/

SELECT *  FROM (SELECT * FROM PLAYER WHERE TEAM_ID = 'K01') WHERE "POSITION" = 'GK';

/*PLAYER 테이블에서 평균 몸무게보다 더 많이 나가는 선수들 검색*/

SELECT MIN(WEIGHT)  FROM player  WHERE WEIGHT>(SELECT AVG(WEIGHT) FROM PLAYER);
SELECT * FROM player  WHERE WEIGHT>(SELECT AVG(WEIGHT) FROM PLAYER);

/*
 * sql실행순서
 * from > where > group by > having > select > order by
 * 
 */

/*PLAYER 테이블에서 정남일 선수가 소속된 팀의 선수들 조회*/

SELECT * FROM PLAYER WHERE TEAM_ID=(SELECT TEAM_ID FROM PLAYER WHERE NAME = '정남일');
/*PLAYER 테이블에서 평균 키보다 작은 선수 검색*/
SELECT * FROM player  WHERE HEIGHT<(SELECT AVG(HEIGHT) FROM PLAYER);

/*SCHEDULE 테이블에서 경기 일정이 20120501~20120502 사이에 있는 경기장 전체 정보 조회*/
SELECT * FROM STADIUM WHERE STADIUM_ID IN (SELECT STADIUM_ID FROM SCHEDULE WHERE SCHE_DATE >= 20120501 AND SCHE_DATE =< 20120502);

/*TCL버튼 클릭하여 Auto에서 None으로 변경,아래 실습 후 반드시 ROLLBACK진행*/
/*PLAYER테이블에서 NICKNAME이 NULL인 선수들을 정태민 선수의 닉네임으로 바꾸기*/
SELECT * FROM player  WHERE nickname IS NULL
SELECT nickname FROM player WHERE name = '정태민'

UPDATE player  SET nickname = (SELECT nickname FROM player WHERE name = '정태민')  WHERE nickname IS NULL

/*EMPLOYEES 테이블에서 평균 급여보다 낮은 사원들의 급여를 20% 인상*/
UPDATE EMPLOYEES   SET money=money*1.2   WHERE money<(SELECT AVG(money) FROM PLAYER); 

/*PLAYER테이블에서 평균 키보다 큰선수드을 삭제*/
DELETE FROM player WHERE  height>(SELECT AVG(height) FROM PLAYER);

/*ROWNUM 
 * 결과 행 앞에 1부터 1씩 증가하는 시퀀스를 붙여준다.
 * */
SELECT ROWNUM,E.* FROM employee e;

/*EMP테이블에서 SAL을 내림차순으로 정렬한 후 ROWNUM을 붙여서 조회한다.*/
SELECT ROWNUM,* FROM (SELECT ROWNUM,e.* FROM EMP e ORDER BY SAL DESC;)



/*
 *JOIN
 *EMP 테이블에서 사원번호 DEPT테이블의 지역 검
 * */

SELECT * FROM EMP;
SELECT * FROM DEPT;

SELECT E.ENAME ,LOC FROM DEPT D JOIN EMP E
ON D.DEPTNO = E.DEPTNO;

/*player 테이블에서 송종국 선수가 속한 팀의 전화번호 검색하기*/
SELECT Team_PHONE_NUMN FROM player WHERE player_name='송종국'


SELECT * FROM team t JOIN player p ON t.team_id= p.team_id AND p.player_name='송종국';


/*
 * JOBS테이블에서 JOB_ID로 직원들의 JOB_TITLE,EMAIL,성,이름 검
 * */


SELECT JOB_TITLE,EMAIL,성,이 FROM JOBS j JOIN  p ON j.JOB_ID =  AND p.player_name='송종국';




/*
 * EMPLOYEES 테이블에서 HIREDATE가 2003~2005년까지만 사원의 정보와 부서명 검색
 * */

SELECT 사원의 정보와 부서명 FROM JOBS j JOIN  p ON j.JOB_ID =  AND  HIREDATE가 2003~2005;





























