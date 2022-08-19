package com.springblog.sportblog.repository;

import com.springblog.sportblog.entity.ArticleEntity;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepo extends CrudRepository<ArticleEntity, Long> {
}
