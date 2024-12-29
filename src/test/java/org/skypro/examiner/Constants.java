package org.skypro.examiner;

import org.skypro.examiner.model.Question;

import java.util.Set;

public class Constants {
    public static final String QUESTION_1 = "вопрос первый";
    public static final String QUESTION_2 = "вопрос второй";
    public static final String QUESTION_3 = "вопрос третий";
    public static final String QUESTION_4 = "вопрос четвертый";

    public static final String ANSWER_1 = " ответ первый";
    public static final String ANSWER_2 = " ответ второй";
    public static final String ANSWER_3 = " ответ третий";
    public static final String ANSWER_4 = " ответ четвертый";

    public static final Question FULL_QUESTION_1 = new Question(QUESTION_1, ANSWER_1);
    public static final Question FULL_QUESTION_2 = new Question(QUESTION_2, ANSWER_2);
    public static final Question FULL_QUESTION_3 = new Question(QUESTION_3, ANSWER_3);
    public static final Question FULL_QUESTION_4 = new Question(QUESTION_4, ANSWER_4);

    public static final Set<Question> TEST_QUESTION_SET1 = Set.of(FULL_QUESTION_1,FULL_QUESTION_2,FULL_QUESTION_3,FULL_QUESTION_4);
    public static final Set<Question> TEST_QUESTION_SET2 = Set.of(FULL_QUESTION_1);
    public static final String EMPTY_ANSWER = null;
}
