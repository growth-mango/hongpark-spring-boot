package com.example.firstproject.repository;

import com.example.firstproject.entity.Article;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

//리파지터리 구현 직접 하지 말고 JPA에서 제공하는 리파지터리 인터페이스를 활용해서 만들기
public interface ArticleRepository extends CrudRepository<Article,Long> {
    @Override
    ArrayList<Article> findAll();
}
