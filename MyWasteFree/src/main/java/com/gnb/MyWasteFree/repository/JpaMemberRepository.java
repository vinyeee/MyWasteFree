package com.gnb.MyWasteFree.repository;

import com.gnb.MyWasteFree.domain.Member;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Repository
public class JpaMemberRepository implements MemberRepository {

    private final EntityManager em;

    public JpaMemberRepository(EntityManager em) {
        this.em = em;
    } //생성자

    @Override
    public Member save(Member member) {
        em.persist(member);
        return null;
    }

    @Override
    public Optional<Member> findByEmail(String email) {
        List<Member> result = em.createQuery("select m from Member m where m.email = :email",Member.class)
                .setParameter("email",email)
                .getResultList();
        return result.stream().findAny();
    }

    @Override
    public Optional<Member> findByMnum(Long mnum) {
        Member member = em.find(Member.class,mnum);
        return Optional.ofNullable(member);
    } // mnum으로 찾기

    /*@Override
    public Optional<Member> findByName(String name) {
        List<Member> result = em.createQuery("select m from Member m where m.name = :name",Member.class)
                .setParameter("name",name)
                .getResultList();
        return result.stream().findAny();
    }*/

    @Override
    public Optional<Member> findById(String id) {
        Member member = em.find(Member.class,id);
        return Optional.ofNullable(member);
    } // 아이디로 찾기

    @Override
    public void delete(String id) {
        Member member = findById(id).orElseThrow(() -> new EntityNotFoundException("Member not found"));
        //optional 객체가 null 일 때, throw를 통해 예외 발생시킴
        em.remove(member);
    }// 회원 삭제


}
