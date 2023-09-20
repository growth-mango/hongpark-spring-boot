package com.example.firstproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 생성 전략을 Identity로 해서 DB가 자동으로 하나씩 증가시킬 수 있도록 하기
    private Long id ;

    @ManyToOne // 다대일 관계 설정 // 해당 댓글 엔티티 여러개가 하나의 Article에 연관됨
    @JoinColumn(name = "article_id")
    private Article article;

    @Column
    private String nickname;

    @Column
    private String body;
}
