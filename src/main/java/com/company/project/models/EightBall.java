package com.company.project.models;

import java.util.Objects;

public class EightBall {

    private int id;
    private String answer;
    private String question;

    
    public EightBall(){

    }


    public EightBall(int id, String answer, String question) {
        this.id = id;
        this.answer = answer;
        this.question = question;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EightBall eightBall = (EightBall) o;
        return id == eightBall.id && Objects.equals(answer, eightBall.answer) && Objects.equals(question, eightBall.question);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, answer, question);
    }
}
