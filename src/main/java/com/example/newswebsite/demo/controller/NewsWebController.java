package com.example.newswebsite.demo.controller;

import com.example.newswebsite.demo.entity.NewsWebEntity;
import com.example.newswebsite.demo.service.NewsWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class NewsWebController {
    @Autowired
    private NewsWebService newsWebService;

    @PostMapping("/addComments")
    public NewsWebEntity addComment(@RequestBody NewsWebEntity newsWebEntity){
        return newsWebService.addComments(newsWebEntity);
    }

    @GetMapping("/addComments/{id}")
    public NewsWebEntity getNewsHeadlinesById(@PathVariable int id){
        return newsWebService.getNewsCategoriesById(id);
    }

    @GetMapping("/addComments/{name}")
    public NewsWebEntity getNewsHeadlinesByCategory(@PathVariable String name){
        return newsWebService.getNewsCategoriesByName(name);
    }
}
