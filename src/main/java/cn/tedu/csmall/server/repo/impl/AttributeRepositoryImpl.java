package cn.tedu.csmall.server.repo.impl;

import cn.tedu.csmall.server.repo.IAttributeRepository;
import org.springframework.stereotype.Repository;

@Repository
public class AttributeRepositoryImpl implements IAttributeRepository {
    public void AttributeRepositoryImpl() {
        System.out.println("AttributeRepositoryImpl构造方法");
    }

}
