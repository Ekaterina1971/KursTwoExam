package org.skypro.examiner.controller;

import org.skypro.examiner.model.Question;
import org.skypro.examiner.service.QuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/exam/java")
public class JavaQuestionController {
    QuestionService service;
    public JavaQuestionController(QuestionService service){
        this.service = service;
    }
    @GetMapping("/add")
    public void addQuestion(@RequestParam String question, @RequestParam String answer){
        service.add(question, answer);
    }
    @GetMapping()
    public Collection<Question> getQuestion(){
        return service.getAll();
    }
    @GetMapping("/remove")
    public void removeQuestion(@RequestParam String question, @RequestParam String answer){
        service.remove(question, answer);
    }

}
