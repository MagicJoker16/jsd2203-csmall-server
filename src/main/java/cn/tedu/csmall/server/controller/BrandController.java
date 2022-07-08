package cn.tedu.csmall.server.controller;

import cn.tedu.csmall.server.POJO.DTO.BrandAddNewDTO;
import cn.tedu.csmall.server.POJO.DTO.BrandEditDTO;
import cn.tedu.csmall.server.ex.ServiceException;
import cn.tedu.csmall.server.service.IBrandService;
import cn.tedu.csmall.server.web.JsonResult;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Api(tags = "4.品牌管理器")
@RestController
@RequestMapping("/brands")
public class BrandController {

    @Autowired
    public IBrandService brandService;

    //http://localhost:8080/brands/add-new?name=xiaomi&pinyin=xiaomi&logo=xxx&categoryId=123456&description=hahaha&keywords=mi&fort=66
    @ApiOperation("创建品牌")
    @ApiOperationSupport(order = 100)
    @PostMapping("/add-new")
    public JsonResult addNew(@RequestBody BrandAddNewDTO brandAddNewDTO) {
        log.debug("接收到的请求参数：{}", brandAddNewDTO);
        brandService.addNew(brandAddNewDTO);
        return JsonResult.ok();
    }

    //http://localhost:8080/brands/65451/update?name=xiaomi&pinyin=xiaomi&logo=xxx&categoryId=123456&description=hahaha&keywords=mi&fort=66
    @ApiOperation("编辑品牌")
    @ApiOperationSupport(order = 300)
    @PostMapping("/{id:[0-9]+}/edit")
    public String updateById(@PathVariable Long id, BrandEditDTO brandEditDTO) {
        System.out.println("BrandController.updateById()");
        System.out.println("接收到的id" + id);
        System.out.println("接收到的请求参数" + brandEditDTO);
        return "根据ID修改品牌信息";
    }

    //    @RequestMapping("/{name:[a-zA-Z]+}/update-by-id")
//    public String updateById(@PathVariable String name, BrandEditDTO brandEditDTO) {
//        System.out.println("BrandController.updateById()");
//        System.out.println("接收到的name"+ name);
//        System.out.println("接收到的请求参数"+brandEditDTO);
//        return "根据ID修改品牌信息";
//    }

    //http://localhost:8080/brands/1/delete
    @ApiOperation("删除品牌")
    @ApiOperationSupport(order = 300)
    @PostMapping("/{id:[0-9]+}/delete")
    public String deleteById(@PathVariable Long id) {
        System.out.println("BrandController.deleteById()");
        System.out.println("接收到的请求参数" + id);
        return "根据id删除品牌信息";
    }

    @GetMapping("/list")
    @ApiOperationSupport(order = 400)
    @ApiOperation("查询品牌列表")
    public String list() {
        System.out.println("BrandController.list()");
        return "查看品牌列表";
    }
}
