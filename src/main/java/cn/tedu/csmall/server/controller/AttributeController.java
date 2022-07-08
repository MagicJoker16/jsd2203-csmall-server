package cn.tedu.csmall.server.controller;

import cn.tedu.csmall.server.POJO.DTO.AttributeAddNewDTO;
import cn.tedu.csmall.server.repo.impl.AttributeRepositoryImpl;
import cn.tedu.csmall.server.service.IAttributeService;
import cn.tedu.csmall.server.web.JsonResult;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@Api(tags="2.属性管理器")
@RequestMapping("/attributes")
@RestController
public class AttributeController {
    @Autowired
    public IAttributeService attributeService;

    public AttributeController() {
        log.debug("创建控制器对象：AttributeController");
    }

    @ApiOperation("创建属性")
    @ApiOperationSupport(order =100)
    @PostMapping("/add-new")
    public JsonResult addNew(@RequestBody AttributeAddNewDTO attributeAddNewDTO){
        log.debug("接收到的请求参数:{}",attributeAddNewDTO);
        attributeService.addNew(attributeAddNewDTO);
        return JsonResult.ok();
    }

}
