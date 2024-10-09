package com.example.newswebsite.demo.repository;

import com.example.newswebsite.demo.entity.NewsWebEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsWebRepository extends JpaRepository<NewsWebEntity,Integer> {
    NewsWebEntity findByNewsCategoryName(String name);
}
