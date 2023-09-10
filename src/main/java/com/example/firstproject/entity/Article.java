package com.example.firstproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Controller;

@Entity
@AllArgsConstructor
@NoArgsConstructor //디폴트 생성자를 추가해주는 어노테이션
@ToString
@Getter
public class Article {

    @Id // 대표값을 지정! like a 주민등록번호
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 1, 2, 3 . . . 자동 생성 어노테이션! // DB가 id를 자동 생성 어노테이션
    private Long id ;

    @Column
    private String title ;
    @Column
    protected String content;
}
