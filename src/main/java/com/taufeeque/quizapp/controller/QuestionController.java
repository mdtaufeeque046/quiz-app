package com.taufeeque.quizapp.controller;

import com.taufeeque.quizapp.entity.Question;
import com.taufeeque.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category) {
        return questionService.getAllQuestionsByCategory(category);

    }

    @PostMapping("add")
    public ResponseEntity<String> addQuestions(@RequestBody Question question) {

        return questionService.addQuestion(question);

    }
}
