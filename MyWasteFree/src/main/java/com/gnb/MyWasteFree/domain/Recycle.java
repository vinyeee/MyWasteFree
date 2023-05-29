package com.gnb.MyWasteFree.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Recycle {
    @Id
    @GeneratedValue
    @Column(name="recycle_id")
    private Long id;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    private LocalDateTime recycleDate;

    private String realImage;

    //CascadeType.ALL => recycle 객체가 사라지면 해당 분리수거의 trashItem 들도 사라진다
    @OneToOne(fetch = FetchType.LAZY)
    private Trash trashItems;

}
