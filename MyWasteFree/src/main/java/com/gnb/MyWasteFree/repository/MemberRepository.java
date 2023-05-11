package com.gnb.MyWasteFree.repository;


import com.gnb.MyWasteFree.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); //save
    Optional<Member> findByEmail(String email);
    Optional<Member> findByMnum(Long mnum);
    //Optional<Member> findByName(String name);
    Optional<Member> findById(String id);

    void delete(String id);
}
