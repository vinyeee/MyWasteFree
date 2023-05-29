package com.gnb.MyWasteFree.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Quiz {
    @Id
    @GeneratedValue
    @Column(name="quiz_id")
    private Long id;

    private String content;
    private String answer;
    private String photo;
    private char ox;
    private Long point;

}
