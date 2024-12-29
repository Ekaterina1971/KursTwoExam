package org.skypro.examiner.service;

import org.skypro.examiner.model.Question;

import java.util.Collection;
import java.util.Random;

public interface QuestionService {
    boolean add(String question, String answer);

    int getSize();
    void setRandom(Random random);

    boolean remove(String question, String answer);

    Collection<Question> getAll();

    Question getRandomQuestion();

}
