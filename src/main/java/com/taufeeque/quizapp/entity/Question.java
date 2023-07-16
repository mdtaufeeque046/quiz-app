package com.taufeeque.quizapp.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "questions_table")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String questionTitle;
    private String options1;
    private String options2;
    private String options3;
    private String options4;
    private String rightAnswer;
    private String difficultyLevel;
    private String category;
}
