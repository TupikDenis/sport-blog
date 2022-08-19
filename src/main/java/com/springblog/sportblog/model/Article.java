package com.springblog.sportblog.model;

import com.springblog.sportblog.entity.ArticleEntity;

public class Article {
    private Long id;
    private String title;
    private String description;
    private String htmlText;
    private Boolean isPublish;

    public static Article toModel(ArticleEntity articleEntity){
        Article model = new Article();
        model.setId(articleEntity.getId());
        model.setTitle(articleEntity.getTitle());
        model.setDescription(articleEntity.getDescription());
        model.setHtmlText(articleEntity.getHtmlText());
        model.setPublish(articleEntity.getPublish());
        return model;
    }

    public Article(){}

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setHtmlText(String htmlText) {
        this.htmlText = htmlText;
    }

    public String getHtmlText() {
        return htmlText;
    }

    public void setPublish(Boolean publish) {
        isPublish = publish;
    }

    public Boolean getPublish() {
        return isPublish;
    }
}
