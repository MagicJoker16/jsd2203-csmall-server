package cn.tedu.csmall.server.controller;

import cn.tedu.csmall.server.POJO.DTO.Brands.BrandAddNewDTO;
import cn.tedu.csmall.server.POJO.DTO.Brands.BrandEditDTO;
import cn.tedu.csmall.server.service.IBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/brands")
public class BrandController {
    @Autowired
    public IBrandService brandService;

    //http://localhost:8080/brands/add-new?name=xiaomi&pinyin=xiaomi&logo=xxx&categoryId=123456&description=hahaha&keywords=mi&fort=66
    @RequestMapping("/add-new")
    public String addNew(BrandAddNewDTO brandAddNewDTO) {
        System.out.println("BrandController.addNew()");
        System.out.println("接收到的请求参数"+brandAddNewDTO);
        return "增加品牌";
    }
    //http://localhost:8080/brands/65451/update?name=xiaomi&pinyin=xiaomi&logo=xxx&categoryId=123456&description=hahaha&keywords=mi&fort=66
    @RequestMapping("/{id:[0-9]+}/update")
    public String updateById(@PathVariable Long id, BrandEditDTO brandEditDTO) {
        System.out.println("BrandController.updateById()");
        System.out.println("接收到的id"+ id);
        System.out.println("接收到的请求参数"+brandEditDTO);
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
    @RequestMapping("/{id:[0-9]+}/delete")
    public String deleteById(@PathVariable Long id) {
        System.out.println("BrandController.deleteById()");
        System.out.println("接收到的请求参数"+id);
        return "根据id删除品牌信息";
    }

    @RequestMapping("/list")
    public String list() {
        System.out.println("BrandController.list()");
        return "查看品牌列表";
    }
}
