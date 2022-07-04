package cn.tedu.csmall.server.service.impl;

import cn.tedu.csmall.server.repo.IAttributeTemplateRepository;
import cn.tedu.csmall.server.repo.impl.AttributeTemplateRepositoryImpl;
import cn.tedu.csmall.server.service.IAttributeTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttributeTemplateServiceImpl  implements IAttributeTemplateService {
    @Autowired
    public IAttributeTemplateRepository attributeTemplateRepository;

    public void AttributeTemplateServiceImpl() {
        System.out.println("AttributeTemplateServiceImpl构造方法");
    }
}
