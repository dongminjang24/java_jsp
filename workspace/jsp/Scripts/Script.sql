create table tbl_reply(
 	reply_number int unsigned auto_increment primary key,
 	reply_content varchar(500),
 	reply_date datetime default now(),
 	board_number int unsigned,
 	member_number int unsigned,
 	constraint fk_reply_board foreign key(board_number) references tbl_board(board_number),
 	constraint fk_reply_c foreign key(member_number) references tbl_member(member_number)
);

SELECT * FROM tbl_reply;

select * from tbl_board order by board_number desc;

insert into tbl_reply(reply_content,board_number,member_number)
value('댓글 테스트5',894,13);

select * from tbl_member; 