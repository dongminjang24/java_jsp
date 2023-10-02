package com.example.app.board.vo;

//
//board_number int unsigned auto_increment primary key,
//board_title varchar(255),
//board_content varchar(500),
//board_date datetime,
//board_read_count int unsigned,
//member_number int unsigned,
//constraint fk_board foreign key(board_number)
//references tbl_board(board_number)

public class BoardVO {
	
	private int boardNumber;
	private String boardTitle;
	private String boardContent;
	private String boardDate;
	private int boardReadCount;
	private int memberNumber;	

	
	public BoardVO() {;}


	public int getBoardNumber() {
		return boardNumber;
	}

	public void setBoardNumber(int boardNumber) {
		this.boardNumber = boardNumber;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public String getBoardDate() {
		return boardDate;
	}

	public void setBoardDate(String boardDate) {
		this.boardDate = boardDate;
	}

	public int getBoardReadCount() {
		return boardReadCount;
	}

	public void setBoardReadCount(int boardReadCount) {
		this.boardReadCount = boardReadCount;
	}

	public int getMemberNumber() {
		return memberNumber;
	}

	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}

	
	

	@Override
	public String toString() {
		return "BoardVO [boardNumber=" + boardNumber + ", boardTitle=" + boardTitle + ", boardContent=" + boardContent
				+ ", boardDate=" + boardDate + ", boardReadCount=" + boardReadCount + ", memberNumber=" + memberNumber
				+ "]";
	}
}
