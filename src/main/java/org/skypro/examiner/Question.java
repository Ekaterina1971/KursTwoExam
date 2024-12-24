package org.skypro.examiner;

import java.util.Objects;

public class Question {
    private final String question;
    private final String answer;

    public Question(String question, String answer){
        this.question = question;
        this.answer = answer;
    }
    public String getQuestion(){
        return question;
    }
    public String getAnswer(){
        return answer;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Question question)) return false;
        return Objects.equals(question, question.question)&&
               Objects.equals(answer, question.answer);

    }
    @Override
    public int hashCode(){
        return Objects.hash(question, answer);
    }
}
