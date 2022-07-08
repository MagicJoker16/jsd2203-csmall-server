package cn.tedu.csmall.server.controller;

import cn.tedu.csmall.server.POJO.DTO.CategoryAddNewDTO;
import cn.tedu.csmall.server.web.JsonResult;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//需要被Spring创建对象的类型，必须：
//1.添加组件注解
//基础的组件注解有：@Component(通用)/@Controller(控制器注解)/@Service(业务)/@Repository(存储)
//在Spring框架的作用范围内，以上4个注解是等效的
//2.必须在"组件扫描"的包下
//Spring框架会执行"组件扫描"操作,会在某个包下查找所有的类,如果类上添加了组件注解,就会创建此类的对象
//Spring Boot项目默认执行了组件扫描,且扫描的包就是创建项目时已经生成的包
//组件扫描的包都是指的"根包"组件类放在此根包下的各层级子孙包也都是有效的
@Slf4j
@Api(tags = "5.类别管理器")
@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryController categoryService;

    public CategoryController() {
        log.debug("创建控制器对象：CategoryController");
    }

    //在Spring MVC中，当需要接收请求时，只需要在控制器中：
    //自定义处理请求的方法
    //在方法上使用@RequestMapping系列注解配置请求路径
    //关于处理请求的方法：
    //访问权限：应该是pub1ic
    //返回值是 String时 表示返回"视图"的名称
    //方法名称 自定义


    //关于响应正文
    //当处理请求的方法是响应正文的，则方法的返回值会响应到客户端。
    //在处理请求的方法上添加`@ResponseBody`，则此方法响应的方式就是响应正文的。


    //关于RequestMapping

    //只允许使用Post方式提交请求 如果使用其他请求方式 将初夏405错误
    //http://localhost:8080/categories/add-new?categoryId=1123&name=xiaomi&sort=12&enable=false&display=false&logo=xiaomi&keywords=1
    @ApiOperation("增加类别")
    @ApiOperationSupport(order = 100)
    @PostMapping("/add-new")
    public JsonResult addNew(@RequestBody CategoryAddNewDTO categoryAddNewDTO) {
        log.debug("接收到的请求参数：{}", categoryAddNewDTO);
        categoryService.addNew(categoryAddNewDTO);
        return JsonResult.ok();
    }

    //假设接卸来时"删除类别"的处理
    //                                           对应
    //此注解的主要作用是配置“请求路径”与"处理请求的方法”的映射关系。
    //http://localhost:8080/categories/1/delete
    @ApiOperation("删除类别")
    @PostMapping("/{id:[0-9]+}/delete")
    public String delete(@PathVariable Long id) {
        System.out.println("CategoryController.delete()");
        System.out.println("接收到的参数" + id);
        return "del";
    }


    //http://localhost:8080/categories/1/update?categoryId=1123&name=xiaomi&sort=12&enable=false&display=false&logo=xiaomi&keywords=1
    @ApiOperation("修改类别")
    @PostMapping("/{id:[0-9]+}/update")
    public String updateById(@PathVariable Long id, CategoryAddNewDTO categoryAddNewDTO) {
        System.out.println("CategoryController.updateById()");
        System.out.println("接收到的参数" + categoryAddNewDTO);
        System.out.println("接收到的id" + id);
        return "即将根据id修改类别信息(尚未完成)";
    }

    @ApiOperation("查询类别")
    @GetMapping("/list")
    public String xx() {
        System.out.println("CategoryController.xx");
        return "";
    }

}
