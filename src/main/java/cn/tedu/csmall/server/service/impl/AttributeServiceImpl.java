package cn.tedu.csmall.server.service.impl;

import cn.tedu.csmall.server.repo.IAttributeRepository;
import cn.tedu.csmall.server.repo.impl.AttributeRepositoryImpl;
import cn.tedu.csmall.server.service.IAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttributeServiceImpl implements IAttributeService {
    @Autowired
    public IAttributeRepository attributeRepository;

    public void AttributeServiceImpl() {
        System.out.println("AttributeServiceImpl构造方法");
    }
}
