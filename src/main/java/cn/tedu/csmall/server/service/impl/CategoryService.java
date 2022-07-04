package cn.tedu.csmall.server.service.impl;

import cn.tedu.csmall.server.repo.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    public ICategoryRepository cateRepository;


    public CategoryService() {
        System.out.println("CategoryService");
    }
}
