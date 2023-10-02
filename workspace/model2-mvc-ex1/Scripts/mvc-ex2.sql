create database mvc_member;

use mvc_member;

CREATE TABLE tbl_mvc_member(
    member_id VARCHAR(1000),
    member_password1 VARCHAR(1000) NOT NULL,
    member_password2 VARCHAR(1000) NOT NULL,
    member_phone_number VARCHAR(1000) NOT NULL,
    member_email VARCHAR(1000) NOT NULL,
    member_hobby VARCHAR(1000),
    member_job VARCHAR(1000),
    member_age VARCHAR(1000),
    member_info VARCHAR(1000),
    PRIMARY KEY(MEMBER_ID(200))
);

