CREATE database mybatis;

use mybatis;

create table tbl_info(
	info_number int unsigned auto_increment primary key,
	info_name varchar(255),
	info_age tinyint unsigned,
	info_gender varchar(255)
);

select * from tbl_info WHERE info_number = LAST_INSERT_ID() ;

SELECT * from tbl_info;


DELETE FROM  tbl_info WHERE info_number = 1;