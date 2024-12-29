package org.skypro.examiner.service;

import org.skypro.examiner.model.Question;

import java.util.Collection;
import java.util.Random;

public interface QuestionService {
    boolean add(String question, String answer);
    // создание нового вопроса
    int getSize();
    void setRandom(Random random);
   // Question add(Question question);
    // добавить вопрос в список вопросов

    //boolean remove(Question question);
    // удалить вопрос из списка вопросов

    boolean remove(String question, String answer);

    Collection<Question> getAll();
    // получить все вопросы

    Question getRandomQuestion();

}
