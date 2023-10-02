/*
 * 범위 주
 * 
 * */

CREATE TABLE TBL_MEMBER(
	MEMBER_NAME VARCHAR2(1000),
	MEMBER_AGE NUMBER
);

SELECT * FROM TBL_MEMBER;
INSERT INTO TBL_MEMBER (MEMBER_NAME,MEMBER_AGE) VALUES('길',30);
UPDATE TBL_MEMBER  SET MEMBER_NAME ='동동' WHERE MEMBER_NAME = '장동';
DROP TABLE TBL_MEMBER;
DELETE FROM TBL_MEMBER WHERE MEMBER_NAME ='동동';

/*
 * 범위 주
 * 
 * */

CREATE  TABLE TBL_CAR(
	CAR_NUMBER NUMBER CONSTRAINT PK_CAR PRIMARY KEY,
	CAR_BRAND VARCHAR2(1000),
	CAR_PUBLISHED_DATE DATE,
	CAR_COLOR VARCHAR2(1000),
	CAR_PRICE NUMBER
);

ALTER TABLE TBL_CAR ADD CONSTRAINT PK_CAR PRIMARY KEY(CAR_NUMBER);

ALTER TABLE TBL_CAR DROP CONSTRAINT SYS_C0026339;

DROP TABLE TBL_CAR;




CREATE TABLE TBL_ANIMAL(
	ANIMAL_ID NUMBER,
	ANIMAL_KIND VARCHAR2(1000),
	ANIMAL_AGE NUMBER,
	ANIMAL_FOOD VARCHAR2(1000)
);

ALTER TABLE  TBL_ANIMAL ADD CONSTRAINT PK_ANIMAL_ID PRIMARY KEY(ANIMAL_ID);

ALTER TABLE TBL_ANIMAL DROP CONSTRAINT PK_ANIMAL_ID;

ALTER TABLE TBL_ANIMAL ADD (SEX VARCHAR2(1000));

ALTER TABLE TBL_ANIMAL RENAME COLUMN ANIMAL_ID TO ANIMAL_PK;

ALTER TABLE TBL_ANIMAL DROP COLUMN ANIMAL_FOOD;

ALTER TABLE TBL_ANIMAL MODIFY (ANIMAL_KIND NUMBER);

DROP TABLE TBL_ANIMAL;

CREATE TABLE TBL_STUDENT(
	STUDENT_NUMBER NUMBER CONSTRAINT PK_STUDENT PRIMARY KEY,
	STUDENT_ID VARCHAR2(1000) CONSTRAINT UK_STUDENT UNIQUE,
	STUDENT_NAME VARCHAR2(1000),
	STUDENT_MAJOR VARCHAR2(1000),
	STUDENT_GENDER CHAR(1) DEFAULT 'W' NOT NULL CONSTRAINT BAN_CAHR CHECK(STUDENT_GENDER ='M' OR STUDENT_GENDER ='W'),
	STUDENT_BIRTH DATE CONSTRAINT BAN_DATE CHECK(STUDENT_BIRTH >= TO_DATE('1999-01-01','YYYY-MM-DD'))
);



