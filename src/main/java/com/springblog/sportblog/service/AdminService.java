package com.springblog.sportblog.service;

import com.springblog.sportblog.entity.AdminEntity;
import com.springblog.sportblog.model.Admin;
import com.springblog.sportblog.repository.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AdminService {
    @Autowired
    private AdminRepo adminRepo;

    public AdminService() {}

    public Admin createArticle(AdminEntity article){
        return null;
    }

    public List<Admin> getAllArticles(){
        return null;
    }

    public Admin getArticleById(Long id){
        return null;
    }

    public Admin updateArticle(AdminEntity article, Long id){
        return null;
    }

    public Long deleteArticle(Long id){
        return null;
    }
}
