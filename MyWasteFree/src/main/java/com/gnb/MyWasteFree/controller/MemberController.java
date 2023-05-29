package com.gnb.MyWasteFree.controller;

import com.gnb.MyWasteFree.domain.Member;
import com.gnb.MyWasteFree.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    //== 로그인 및 회원가입 기능 ==//
    @GetMapping("/myWaste/login") // 미완성
    public String login(){
        return "/member/loginPage";
    }

    @GetMapping("/myWaste/join")
    public String CreateJoinForm(Model model){
        model.addAttribute("JoinForm",new JoinForm());
        return "/member/joinPage";
    }

    @PostMapping("/myWaste/join")
    public String create(JoinForm form){

        //멤버 객체 생성해서 바로 회원가입
        Member member = new Member();
        member.setName(form.getName());
        member.setId(form.getId());
        member.setPwd(form.getPwd());
        member.setEmail(form.getEmail());
        member.setPhone(form.getPhone());
        member.setAddress(form.getAddress());

        //회원가입
        memberService.join(member);

        return "redirect:/";
    }





}
