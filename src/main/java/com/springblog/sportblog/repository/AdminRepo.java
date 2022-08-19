package com.springblog.sportblog.repository;

import com.springblog.sportblog.entity.AdminEntity;
import org.springframework.data.repository.CrudRepository;

public interface AdminRepo extends CrudRepository<AdminEntity, Long> {
}
