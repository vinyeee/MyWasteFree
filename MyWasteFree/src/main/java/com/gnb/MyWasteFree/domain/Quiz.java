package com.gnb.MyWasteFree.domain;

public class Quiz {

    private Long qnum; // 퀴즈 pk
    private String quiz_content; // 퀴즈 문제
    private String answer; // 퀴즈 정답 부연 설명
    private int quiz_point; // 퀴즈 당 포인트
    private String quiz_photo; // 퀴즈 사진
    private int ox; // 퀴즈 정답 ox

    public Long getQnum() {
        return qnum;
    }

    public void setQnum(Long qnum) {
        this.qnum = qnum;
    }

    public String getQuiz_content() {
        return quiz_content;
    }

    public void setQuiz_content(String quiz_content) {
        this.quiz_content = quiz_content;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getQuiz_point() {
        return quiz_point;
    }

    public void setQuiz_point(int quiz_point) {
        this.quiz_point = quiz_point;
    }

    public String getQuiz_photo() {
        return quiz_photo;
    }

    public void setQuiz_photo(String quiz_photo) {
        this.quiz_photo = quiz_photo;
    }

    public int getOx() {
        return ox;
    }

    public void setOx(int ox) {
        this.ox = ox;
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "qnum=" + qnum +
                ", quiz_content='" + quiz_content + '\'' +
                ", answer='" + answer + '\'' +
                ", quiz_point=" + quiz_point +
                ", quiz_photo='" + quiz_photo + '\'' +
                ", ox=" + ox +
                '}';
    }
}
