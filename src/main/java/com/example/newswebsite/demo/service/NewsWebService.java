package com.example.newswebsite.demo.service;

import com.example.newswebsite.demo.entity.NewsWebEntity;
import com.example.newswebsite.demo.repository.NewsWebRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsWebService {

    @Autowired
    private NewsWebRepository newsWebRepository;


    public NewsWebEntity addComments(NewsWebEntity newsWebEntity){
         return newsWebRepository.save(newsWebEntity);
    }

    public NewsWebEntity getNewsCategoriesById(int id){
        return newsWebRepository.findById(id).orElse(null);
    }

    public NewsWebEntity getNewsCategoriesByName(String name){
        return newsWebRepository.findByNewsCategoryName(name);
    }

}
