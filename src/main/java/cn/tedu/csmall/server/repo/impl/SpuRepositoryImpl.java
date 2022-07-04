package cn.tedu.csmall.server.repo.impl;

import cn.tedu.csmall.server.repo.ISpuRepository;
import org.springframework.stereotype.Repository;

@Repository
public class SpuRepositoryImpl implements ISpuRepository {
    public void SpuRepositoryImpl() {
        System.out.println("SpuRepositoryImpl构造方法");
    }
}
