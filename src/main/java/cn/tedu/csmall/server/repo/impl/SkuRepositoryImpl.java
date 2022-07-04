package cn.tedu.csmall.server.repo.impl;

import cn.tedu.csmall.server.repo.ISkuRepository;
import org.springframework.stereotype.Repository;

@Repository
public class SkuRepositoryImpl implements ISkuRepository {
    public void SkuRepositoryImpl() {
        System.out.println("SkuRepositoryImpl构造方法");
    }
}
