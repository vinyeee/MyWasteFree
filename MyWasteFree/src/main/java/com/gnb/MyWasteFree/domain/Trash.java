package com.gnb.MyWasteFree.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Trash {
    @Id
    @GeneratedValue
    @Column(name="trash_id")
    private Long id;

    private String name;

    private String photo;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="category_id")
    private Category category;

}
