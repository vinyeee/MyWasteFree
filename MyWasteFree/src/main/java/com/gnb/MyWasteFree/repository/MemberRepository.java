package com.gnb.MyWasteFree.repository;

import com.gnb.MyWasteFree.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member,Long> {

    // 아이디 중복 확인용
    @Query("select m from Member m where m.id = :id")
    public Member findById(String id);
}
