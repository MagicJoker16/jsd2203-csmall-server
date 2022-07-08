package cn.tedu.csmall.server.controller;

import cn.tedu.csmall.server.service.ISpuService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
@Api(tags="8.SPU管理器")
@RestController
public class SpuController {
@Autowired
    public ISpuService spuService;
}
