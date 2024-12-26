package org.skypro.examiner.service;

import org.skypro.examiner.model.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}

