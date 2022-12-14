package com.springblog.sportblog.entity;

import javax.persistence.*;

@Entity
@Table(name="articles")
public class ArticleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String htmlText;
    private Boolean isPublish;

    public ArticleEntity(){}

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
