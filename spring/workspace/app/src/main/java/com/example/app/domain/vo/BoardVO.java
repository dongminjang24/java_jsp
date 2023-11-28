package com.example.app.domain.vo;


import lombok.Data;

@Data
public class BoardVO {
    private Long boardNumber;
    private String boardTitle;
    private String boardWriter;
    private String boardContent;
    private String boardRegisterDate;
    private String boardUpdateDate;


};
