/*
 * 회원번호
 * 이름
 * 비밀번호
 * 핸드폰번호
 * 별명
 * 이메일
 * 주소
 * 생일
 * 성별
 * 추천인
 * 직업
 * 
 * 
 * 
 * 
 */

CREATE TABLE TBL_USER (
	USER_NUMBER number,
	USER_NAME VARCHAR2(1000),
	USER_PASSWORD VARCHAR2(1000),
	USER_PHONE_NUMBER VARCHAR2(1000),
	USER_NICKNAME VARCHAR2(1000),
	USER_EMAIL VARCHAR2(1000),
	USER_ADDRESS VARCHAR2(1000),
	USER_BIRTHDATE DATE,
	USER_GENDER CHAR(1) DEFAULT 'W' NOT NULL CONSTRAINT BAN_GENDER CHECK(USER_GENDER ='M' OR USER_GENDER ='W'),
	USER_RECOMMENDER VARCHAR2(1000),
	USER_JOB VARCHAR2(1000)
);
DROP TABLE TBL_USER;
ALTER TABLE TBL_USER ADD CONSTRAINT pk_user PRIMARY KEY (USER_number);
ALTER TABLE TBL_USER ADD (user_id VARCHAR2(1000));
CREATE sequence seq_user;

INSERT INTO ADMIN.TBL_USER
(USER_number, USER_NAME, USER_PASSWORD, USER_PHONE_NUMBER, USER_NICKNAME, USER_EMAIL, USER_ADDRESS, USER_BIRTHDATE, USER_RECOMMENDER, USER_JOB)
VALUES(seq_user.nextval, '한동석', '1234', '01012341234', 'zizon123', 'ted1234@gmail.com', '경기도 남양주시', '2000-12-04', NULL , '강사');


SELECT * FROM TBL_user;

UPDATE TBL_USER 
SET USER_ID  ='hds'
WHERE USER_number = 41;


SELECT SYS_CONTEXT('USERENV','NLS_DATE_FORMAT') FROM DUAL; 
ALTER SESSION SET NLS_DATE_FORMAT ='YYYY-MM-DD HH24:MI:SS';


