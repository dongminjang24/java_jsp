create table tbl_file(
	file_system_name varchar(255) primary key,
	file_original_name varchar(255),
	item_number BIGINT UNSIGNED NOT NULL,
	CONSTRAINT fk_file FOREIGN key(item_number)
	REFERENCES tbl_item(item_number)
);

SELECT * from tbl_file;

drop table tbl_file;

SELECT * from tbl_file WHERE file_system_name = "1695309568696_다운로드.png";

SELECT file_system_name from tbl_file WHERE file_system_name = "1695309568696_다운로드.png";


select file_system_name from tbl_file where item_number = 1

