SELECT * FROM PLAYER WHERE TEAM_ID = 'K01';

SELECT min(WEIGHT) FROM PLAYER WHERE WEIGHT BETWEEN 70 AND 80  ORDER BY WEIGHT ;


SELECT max(HEIGHT) FROM PLAYER WHERE TEAM_ID ='K03' AND HEIGHT <180;

SELECT * FROM PLAYER WHERE TEAM_ID ='K06' AND NICKNAME ='제리';

SELECT MIN(HEIGHT)  FROM PLAYER WHERE HEIGHT >=170 AND WEIGHT >=80;

SELECT max(SEAT_COUNT)  FROM STADIUM WHERE SEAT_COUNT >30000 AND SEAT_COUNT <= 41000;

SELECT * FROM PLAYER WHERE (TEAM_ID = 'K02'OR TEAM_ID = 'K07') AND "POSITION" = 'MF';
SELECT * FROM PLAYER WHERE TEAM_ID IN('K02','K07') AND   "POSITION" = 'MF';

UPDATE PLAYER 
SET PLAYER_NAME ='장동민'
WHERE TEAM_ID = 'K01';
(SELECT * FROM PLAYER WHERE TEAM_ID = 'K01')

SELECT * FROM PLAYER WHERE TEAM_ID = 'K01';

SELECT PLAYER_NAME ,NVL2(NATION,'등록','미등록') AS 등록여부 FROM PLAYER ;

SELECT BACK_NO "등 번호",NICKNAME "선수 별명" FROM PLAYER;

SELECT PLAYER_NAME ||'의 별명은 ' || NICKNAME || '이다' "자기 소개" FROM PLAYER;

SELECT PLAYER_NAME ||'의 영어이름은 ' || E_PLAYER_NAME || '입니다.' FROM PLAYER;

SELECT PLAYER_NAME ||'의 포지션은 ' || NVL("POSITION",'미정') || '입니다.' FROM PLAYER;

SELECT * FROM team WHERE TEAM_NAME  LIKE  '%천마';
SELECT * FROM TEAM t  ;
SELECT * FROM PLAYER p ;
SELECT * FROM PLAYER WHERE PLAYER_NAME LIKE '김%';

SELECT * FROM PLAYER WHERE PLAYER_NAME LIKE '김_';
SELECT * FROM PLAYER WHERE PLAYER_NAME LIKE '김%' OR PLAYER_NAME LIKE'이%';

SELECT * FROM PLAYER WHERE NOT PLAYER_NAME LIKE '이%';

SELECT count(NVL(HEIGHT,0)) FROM PLAYER p 


SELECT "POSITION",avg(HEIGHT) FROM PLAYER GROUP BY "POSITION";



SELECT "POSITION",avg(HEIGHT) FROM PLAYER WHERE WEIGHT>=80 GROUP BY "POSITION" HAVING avg(HEIGHT) >= 180;


SELECT * FROM 	EMP ;

SELECT * FROM EMPLOYEES GROUP BY JOB_ID HAVING AVG(SALARY)<10000 ORDER BY job_id;



SELECT avg(HEIGHT),"POSITION",(SELECT avg(HEIGHT)  FROM PLAYER )  FROM PLAYER GROUP BY "POSITION" HAVING "POSITION" is NOT NULL;

SELECT * FROM (SELECT * FROM PLAYER WHERE TEAM_ID = 'K01') WHERE "POSITION" = 'GK'

SELECT avg(weight) FROM	PLAYER;

SELECT * FROM PLAYER WHERE WEIGHT >(SELECT avg(weight) FROM	PLAYER);




SELECT * FROM PLAYER  WHERE TEAM_ID = (SELECT TEAM_ID  FROM PLAYER WHERE PLAYER_NAME ='정남일');

SELECT avg(HEIGHT) FROM PLAYER;
 

SELECT * FROM PLAYER WHERE HEIGHT <(SELECT avg(HEIGHT) FROM PLAYER);


SELECT * FROM SCHEDULE WHERE (SCHE_DATE BETWEEN '20120501' AND '20120502');

STADIUM_ID IN (SELECT STADIUM_ID FROM STADIUM );

SELECT * FROM STADIUM WHERE STADIUM_ID IN(SELECT STADIUM_ID  FROM SCHEDULE WHERE (SCHE_DATE BETWEEN '20120501' AND '20120502')) ;

SELECT count(*) FROM PLAYER  WHERE NICKNAME IS NULL;

SELECT nickname FROM PLAYER WHERE PLAYER_NAME ='정태민';


UPDATE PLAYER 
SET NICKNAME = (SELECT nickname FROM PLAYER WHERE PLAYER_NAME ='정태민')
 WHERE NICKNAME IS NULL; 

DELETE FROM PLAYER WHERE HEIGHT > (SELECT avg(HEIGHT) FROM	PLAYER);


UPDATE EMPLOYEES 
SET salary =salary*1.2
WHERE salary<(SELECT avg(salary) FROM	EMPLOYEES);




SELECT * FROM DEPT;
SELECT * FROM emp;

SELECT * FROM EMP e JOIN dept d ON e.DEPTNO = d.DEPTNO ;

SELECT TEAM_ID  FROM PLAYER WHERE PLAYER_NAME ='송종국';

SELECT tel FROM TEAM t JOIN PLAYER p ON t.TEAM_ID = p.TEAM_ID WHERE PLAYER_NAME ='송종국'; ;

SELECT * FROM JOBS j JOIN EMPLOYEES e ON j.job_id = e.job_id

SELECT DNAME,LOC FROM emp e JOIN dept d ON e.DEPTNO = d.DEPTNO  AND e.ENAME LIKE '%L%';


SELECT * FROM PLAYER;
SELECT * FROM TEAM;

SELECT max(HEIGHT),TEAM_ID FROM PLAYER GROUP BY TEAM_ID 

SELECT * FROM PLAYER;

SELECT max(HEIGHT),TEAM_ID  FROM PLAYER GROUP BY TEAM_ID ORDER BY TEAM_ID ;

SELECT *  FROM 
(
SELECT max(HEIGHT) AS  max_height,TEAM_ID  FROM PLAYER GROUP BY TEAM_ID
) pingpong  JOIN PLAYER p ON pingpong.team_id = p.TEAM_ID AND pingpong.max_height = p.HEIGHT;


SELECT * FROM PLAYER p;
SELECT max(height),TEAM_ID  FROM PLAYER p GROUP BY TEAM_ID ;
SELECT TEAM_ID  FROM PLAYER  GROUP BY TEAM_ID;

SELECT * FROM PLAYER  WHERE HEIGHT = (SELECT max(height) FROM PLAYER p GROUP BY TEAM_ID)  AND TEAM_ID  = (SELECT TEAM_ID  FROM PLAYER  GROUP BY TEAM_ID); 

SELECT * FROM PLAYER 
WHERE (TEAM_ID,HEIGHT) IN
(
SELECT TEAM_ID,max(HEIGHT) max_height FROM PLAYER 
GROUP BY TEAM_ID
);

SELECT E.ENAME , SAL, S.GRADE FROM EMP E JOIN SALGRADE S
ON E.SAL BETWEEN S.LOSAL AND S.HISAL;

SELECT * FROM EMP JOIN (SELECT MGR,ENAME FROM EMP) M ON EMP.MGR  =M.MGR  ;






/* 브론즈 */
/* PLAYER 테이블에서 키가 NULL인 선수들은 키를 170으로 변경하여 평균 구하기 (NULL포함) */
SELECT * FROM PLAYER p WHERE HEIGHT IS null;
UPDATE PLAYER 
SET HEIGHT = 170
WHERE HEIGHT IS NULL;
/* 실버 */
/* PLAYER 테이블에서 팀별 최대 몸무게 */
SELECT * FROM TEAM ;
SELECT TEAM_ID,max(HEIGHT) FROM PLAYER p GROUP BY TEAM_ID;

SELECT * FROM TEAM p JOIN (SELECT TEAM_ID,max(HEIGHT) mh  FROM PLAYER GROUP BY TEAM_ID) abc
ON abc.team_id = p.TEAM_ID;

/* 골드 */
/* AVG 함수를 쓰지 않고 PLAYER 테이블에서 선수들의 평균 키 구하기(NULL 미포함) */


SELECT height FROM PLAYER ;
SELECT COUNT(*)  FROM PLAYER p ;

SELECT sum(HEIGHT)/count(*) FROM PLAYER WHERE HEIGHT IS NOT NULL;
 
/*플래티넘*/
/* DEPT 테이블의 LOC별 평균 급여를 반올림한 값과 각 LOC별 SAL 총 합을 조회 */

SELECT round(avg(sal))  "평균 급여", sum(sal),loc FROM emp e JOIN (SELECT * FROM DEPT) d ON e.DEPTNO = d.deptno GROUP BY loc;

/*다이아*/
/* PLAYER 테이블에서 팀별 최대 몸무게인 선수 전체 정보 검색*/
SELECT max(WEIGHT),TEAM_ID  FROM PLAYER p  GROUP BY TEAM_ID ;
SELECT * FROM PLAYER p1 JOIN (SELECT max(WEIGHT),TEAM_ID  FROM PLAYER   GROUP BY TEAM_ID ) p2 ON p1.TEAM_ID = p2.TEAM_ID ;

SELECT max(WEIGHT),TEAM_ID  FROM PLAYER p  GROUP BY TEAM_ID;
SELECT * FROM PLAYER p1 JOIN (SELECT max(WEIGHT) mw,TEAM_ID  FROM PLAYER p  GROUP BY TEAM_ID) p2
ON p1.TEAM_ID = p2.team_id AND p1.weight = p2.mw

SELECT * FROM PLAYER WHERE (WEIGHT,TEAM_ID) IN	(SELECT max(WEIGHT),TEAM_ID  FROM PLAYER p  GROUP BY TEAM_ID )
/*마스터*/
/* EMP 테이블에서 HIREDATE가 FORD의 입사년도와 같은 사원 전체 정보 조회 */

SELECT EXTRACT ( YEAR FROM HIREDATE) FROM EMP WHERE ENAME = 'FORD';

SELECT * FROM emp WHERE  EXTRACT ( YEAR FROM HIREDATE)  = (SELECT EXTRACT ( YEAR FROM HIREDATE) FROM EMP WHERE ENAME = 'FORD');








