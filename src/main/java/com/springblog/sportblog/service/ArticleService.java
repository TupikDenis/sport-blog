package com.springblog.sportblog.service;

import com.springblog.sportblog.entity.ArticleEntity;
import com.springblog.sportblog.model.Article;
import com.springblog.sportblog.repository.ArticleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {
    @Autowired
    private ArticleRepo articleRepo;

    public Article createArticle(ArticleEntity article){
        return null;
    }

    public List<Article> getAllArticles(){
        return null;
    }

    public List<Article> getArticleById(Long id){
        return null;
    }

    public Article updateArticle(ArticleEntity article, Long id){
        return null;
    }

    public Article deleteArticle(Long id){
        return null;
    }
}
