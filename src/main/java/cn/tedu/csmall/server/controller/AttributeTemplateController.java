package cn.tedu.csmall.server.controller;

import cn.tedu.csmall.server.POJO.DTO.AttributeTemplateAddNewDTO;
import cn.tedu.csmall.server.service.IAttributeTemplateService;
import cn.tedu.csmall.server.web.JsonResult;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RequestMapping("/attribute-templates")
@Api(tags="3.属性模板管理器")
@RestController
public class AttributeTemplateController {
    @Autowired
    public IAttributeTemplateService attributeTemplateService;

    public AttributeTemplateController() {
        log.debug("创建控制器对象：AttributeTemplateController");
    }

    @ApiOperation("创建属性模板")
    @ApiOperationSupport(order = 100)
    @PostMapping("/add-new")
    public JsonResult addNew(@RequestBody AttributeTemplateAddNewDTO attributeTemplateAddNewDTO){
        log.debug("接收到的请求参数:{}",attributeTemplateAddNewDTO);
        attributeTemplateService.addNew(attributeTemplateAddNewDTO);
        return JsonResult.ok();
    }
}
