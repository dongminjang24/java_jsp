create database coco_market;

use coco_market;



create table tbl_user(
 user_number int unsigned auto_increment primary key,
 user_email varchar(255),
 user_password varchar(255),
 user_nickname varchar(255),
 user_address varchar(255),
 user_phone_number varchar(255)
);


select * from tbl_user;


