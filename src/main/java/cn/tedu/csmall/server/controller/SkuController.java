package cn.tedu.csmall.server.controller;

import cn.tedu.csmall.server.POJO.DTO.BrandAddNewDTO;
import cn.tedu.csmall.server.POJO.DTO.SkuAddNewDTO;
import cn.tedu.csmall.server.mapper.SkuMapper;
import cn.tedu.csmall.server.service.ISkuService;
import cn.tedu.csmall.server.web.JsonResult;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@Api(tags = "7.SKU管理器")
@RestController
public class SkuController {
    @Autowired
    public ISkuService skuService;

    @ApiOperation("创建品牌")
    @ApiOperationSupport(order = 100)
    @PostMapping("/add-new")
    public JsonResult addNew(@RequestBody SkuAddNewDTO skuAddNewDTO) {
        log.debug("接收到的请求参数：{}", skuAddNewDTO);
        skuService.addNew(skuAddNewDTO);
        return JsonResult.ok();
    }



}
