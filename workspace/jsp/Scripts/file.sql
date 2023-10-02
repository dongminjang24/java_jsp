create table tbl_file(
	file_system_name varchar(255) primary key,
	file_original_name varchar(255),
	board_number int unsigned,
	CONSTRAINT fk_file FOREIGN key(board_number)
	REFERENCES tbl_board(board_number)
);

SELECT * from tbl_file;





