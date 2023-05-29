package com.gnb.MyWasteFree.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter

public class Member {

    @Id
    @GeneratedValue
    private Long member_id;

    private String id;
    private String pwd;
    private String name;
    private String email;
    private String phone;
    private String address;
    private Long point;

    @OneToMany(mappedBy = "member",cascade = CascadeType.ALL)
    private List<Recycle> recycles = new ArrayList<>();

    @OneToMany(mappedBy = "member",cascade = CascadeType.ALL)
    private List<Bank> bankList = new ArrayList<>();

}
