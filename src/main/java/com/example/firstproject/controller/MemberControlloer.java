package com.example.firstproject.controller;

import com.example.firstproject.dto.MemberForm;
import com.example.firstproject.entity.Member;
import com.example.firstproject.repository.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class MemberControlloer {

    @Autowired //스프링 부트가 미리 성생해놓은 객체를 가져다가 자동으로 연결해줌!
    private MemberRepository memberRepository;

    @GetMapping("join")
    public String newMemberForm(){
        return "join";
    }

    //DTO 매개변수로 받기
    @PostMapping("create")
    public String createMember(MemberForm form){
        log.info(form.toString());

        //1. dto entity로 변환
        //Member는 Entity 클래스
        // DTO인 form 에서 Entity로 변환하는 메서드 정의하기
        // 따라서, toEntity 메서드는 DTO 클래스에 정의하기
        Member member = form.toEntity();
        log.info(member.toString());

        //2. repository에게 entity를 DB안에 저장하게 함
        // save는 리파지토리에서 상속받은 CRUDRepository에서 기본 제공하는 메소드임
        Member saved = memberRepository.save(member);
        log.info(saved.toString());

        return "";

    }
}
