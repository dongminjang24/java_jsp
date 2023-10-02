create database test;

use test;

create table tbl_guest(
	guest_number int unsigned auto_increment primary key,
	guest_id varchar(1000),
	guesr_password varchar(1000),
	guest_age tinyint unsigned /*int중에 작은 int 0~255 unsigned가 음수영역의 메모리를 양수영역으로 끌어다쓰는 것.*/
);

SELECT * from tbl_guest;
ALTER table tbl_guest add column(guest_birth date);

insert into tbl_guest
(guest_id, guesr_password, guest_age, guest_birth)
VALUES('hgd', '5555', 15, '2008-01-04');

select `AUTO_INCREMENT`  from information_schema.TABLES
where TABLE_SCHEMA = 'test' and TABLE_NAME ='tbl_guest';

/*
 * date는 년월일
 * time은 시,분,초
 * datetime은 년월일,시분초 다 나옴
 */

select concat(guest_id,'의 나이는 ',guest_age,'살') 자기소개 from tbl_guest;

select now() from dual;

select date_format(now(),'%Y년 %m월 %d일 %H:%i:%s') 현재시간 from dual;

select ifnull(guest_birth,'미정') from tbl_guest;


update tbl_guest 
set guest_birth =null
where guest_number =2;

alter table tbl_guest change guest_birth guest_birth datetime;












/*
 * 회원테이블
 * 
 *회원번호
 *아이디
 *비밀번호
 *이름
 *나이
 *핸드폰 번호
 *상태
 * 
 * */

/*customer 데이터 베이스 생성후 작업*/
create database customer;

use customer;
create table tbl_customer(
	customer_number int unsigned auto_increment primary key,
	customer_id varchar(1000),
	customer_password varchar(1000),
	customer_name varchar(1000),
	customer_age tinyint unsigned, /*int중에 작은 int 0~255 unsigned가 음수영역의 메모리를 양수영역으로 끌어다쓰는 것.*/
	customer_phone_number varchar(1000),
	customer_status customer_status char(2) default 0
	);

alter table tbl_customer change customer_status customer_status char(1) default 0;
alter table tbl_customer change customer_status customer_status char(2) default 0;

SELECT * from tbl_customer tc ;

insert into tbl_customer 
(customer_id,customer_password,customer_name,customer_age,customer_phone_number)
values('yesoryes','0224','김예',29,'01079211388');


select count(customer_number) from tbl_customer WHERE customer_number = 1;

select customer_number from tbl_customer where customer_id ='yesoryes' AND customer_password ='0113';


UPDATE tbl_customer
SET customer_id='', customer_password='', customer_name='', customer_age=0, customer_phone_number='', customer_status='0'
WHERE customer_number=0;


















