package com.springblog.sportblog.rest;

import com.springblog.sportblog.model.Article;
import com.springblog.sportblog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RestController
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @GetMapping("/")
    public ResponseEntity<List<Article>> getAllArticles(){
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<Article>> getArticleById(@PathVariable String id){
        return null;
    }
}
