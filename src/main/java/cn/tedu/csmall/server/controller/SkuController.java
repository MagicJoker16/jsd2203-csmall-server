package cn.tedu.csmall.server.controller;

import cn.tedu.csmall.server.service.ISkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SkuController {
@Autowired
    public ISkuService skuService;
}