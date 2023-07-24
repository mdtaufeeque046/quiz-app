package com.taufeeque.quizapp.entity;

import lombok.Data;

@Data
public class QuestionWrapper {

    private Integer id;
    private String questionTitle;
    private String options1;
    private String options2;
    private String options3;
    private String options4;

    public QuestionWrapper(Integer id, String questionTitle, String options1, String options2, String options3, String options4) {
        this.id = id;
        this.questionTitle = questionTitle;
        this.options1 = options1;
        this.options2 = options2;
        this.options3 = options3;
        this.options4 = options4;
    }
}
