package com.example.firstproject.dto;

import com.example.firstproject.entity.Member;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class MemberForm {

    private String email ;
    private String password ;

    //MemberForm 객체의 생성 및 초기화를 위해 생성자 추가

    public Member toEntity(){
        return new Member(null,email,password);
    }

}
