package org.skypro.examiner.controller;

import org.skypro.examiner.model.Question;
import org.skypro.examiner.service.ExaminerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class ExamController {
    private final ExaminerService service;
    public ExamController(ExaminerService service){
        this.service = service;
    }
    @GetMapping("/get/{amount}")
    public Collection<Question> getQuestions(@PathVariable int amount){
        return service.getQuestions(amount);
    }

}
