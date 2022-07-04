package cn.tedu.csmall.server.controller;

import cn.tedu.csmall.server.repo.impl.AttributeRepositoryImpl;
import cn.tedu.csmall.server.service.IAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AttributeController {
    @Autowired
    public IAttributeService attributeService;

}
