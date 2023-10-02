
use jsp;
drop table tbl_board ;
create table tbl_board(
	board_number int unsigned auto_increment primary key,
	board_title varchar(255),
	board_content varchar(500),
	board_date datetime default now(),
	board_read_count int unsigned default 0,
	member_number int unsigned,
	constraint fk_board foreign key(member_number)
	references tbl_member(member_number) on delete cascade
);

select * from tbl_member;
select * from tbl_board;

insert into tbl_board(board_title,board_content,member_number)
values("테스트 제목1","테스트 내용1",12);

insert into tbl_board(board_title,board_content,member_number)
values("테스트 제목2","테스트 내용2",12);

insert into tbl_board(board_title,board_content,member_number)
values("테스트 제목3","테스트 내용3",12);

insert into tbl_board (board_title, board_content, member_number)
(select board_title, board_content, member_number from tbl_board);