package com.gnb.MyWasteFree.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Bank {
    @Id
    @GeneratedValue
    @Column(name="bank_id")
    private Long id;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;
    private String account;
    private Long pwd;
}
