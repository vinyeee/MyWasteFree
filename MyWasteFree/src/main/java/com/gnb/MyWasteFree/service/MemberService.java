package com.gnb.MyWasteFree.service;

import com.gnb.MyWasteFree.domain.Member;
import com.gnb.MyWasteFree.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public Long join(Member member){
        memberRepository.save(member);
        return member.getMember_id();
    }

}
