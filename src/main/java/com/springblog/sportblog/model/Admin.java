package com.springblog.sportblog.model;

import com.springblog.sportblog.entity.AdminEntity;

public class Admin {
    private Long id;
    private String username;

    public static Admin toModel(AdminEntity adminEntity){
        Admin model = new Admin();
        model.setId(adminEntity.getId());
        model.setUsername(adminEntity.getUsername());
        return model;
    }

    public Admin() {}

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
