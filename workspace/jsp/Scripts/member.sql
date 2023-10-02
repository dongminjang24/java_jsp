create database jsp;

use jsp;
/*bigint로 할경우 자바에서 long으로 받아야함.*/
create table tbl_member(
	member_number int unsigned auto_increment primary key,
	member_id varchar(255),
	member_pw varchar(255),
	member_name varchar(255),
	member_age tinyint unsigned,
	member_gender varchar(25),
	member_email varchar(255),
	member_zipcode char(5),
	member_address varchar(255),
	member_address_detail varchar(255)
);

select * from tbl_member;

INSERT into tbl_member (member_id) values('hds1234');