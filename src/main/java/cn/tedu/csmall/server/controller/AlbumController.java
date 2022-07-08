package cn.tedu.csmall.server.controller;

import cn.tedu.csmall.server.POJO.DTO.AlbumAddNewDTO;
import cn.tedu.csmall.server.service.IAlbumService;
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


@Api(tags="1.相册管理器")
@Slf4j
@RequestMapping("/albums")
@RestController
public class AlbumController {
    @Autowired
    public IAlbumService albumService;
//    public AlbumController() {
//        System.out.println("AlbumController.AlbumController");
//    }

    public AlbumController() {
        log.debug("创建控制器对象：AlbumController");
    }

    //http://localhost:8080/brands/add-new?name=xiaomi&pinyin=xiaomi&logo=xxx&categoryId=123456&description=hahaha&keywords=mi&fort=66
    @ApiOperation("增加相册")
    @ApiOperationSupport(order=100)
    @PostMapping("/add-new")
    public JsonResult addNew(@RequestBody AlbumAddNewDTO albumAddNewDTO) {
        log.debug("输出添加相册的日志");
        albumService.addNew(albumAddNewDTO);
        return JsonResult.ok();
    }

}
