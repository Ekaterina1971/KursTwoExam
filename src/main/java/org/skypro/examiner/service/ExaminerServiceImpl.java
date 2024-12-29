package org.skypro.examiner.service;

import org.skypro.examiner.exception.NotEnoughQuestionException;
import org.skypro.examiner.model.Question;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@Service
public class ExaminerServiceImpl implements ExaminerService{
    Random random;

    QuestionService questionService;

    ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }
    @Override
    public Collection<Question> getQuestions(int amount) {
        Collection<Question> allQuestions = questionService.getAll();
        if (amount > allQuestions.size()) {
            throw new NotEnoughQuestionException();
        }

        if (amount == allQuestions.size()) {
            return allQuestions;
        }

         //int size = questionService.getSize();
        //if(amount <= 0 || size < amount){
           // throw new NotEnoughQuestionException();
        //}

        Set<Question> questions = new HashSet<>();
        while (questions.size() < amount) {
            questions.add(questionService.getRandomQuestion());
        }
        return questions;
    }
}
