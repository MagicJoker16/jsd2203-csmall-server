package cn.tedu.csmall.server.controller;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
@Api(tags="6.图片管理器")
@RestController
public class PictureController {

    public PictureController(){
        System.out.println("PictureController.PictureController");
    }
}
