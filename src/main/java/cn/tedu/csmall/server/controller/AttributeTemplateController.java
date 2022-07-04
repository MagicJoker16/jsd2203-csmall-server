package cn.tedu.csmall.server.controller;

import cn.tedu.csmall.server.repo.impl.AttributeTemplateRepositoryImpl;
import cn.tedu.csmall.server.service.IAttributeTemplateService;
import cn.tedu.csmall.server.service.impl.AttributeTemplateServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AttributeTemplateController {
    @Autowired
    public IAttributeTemplateService attributeTemplateService;
}
