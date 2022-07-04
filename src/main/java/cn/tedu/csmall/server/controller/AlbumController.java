package cn.tedu.csmall.server.controller;

import cn.tedu.csmall.server.service.IAlbumService;
import cn.tedu.csmall.server.service.impl.AlbumServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlbumController {
    @Autowired
    public IAlbumService albumService;

    public AlbumController() {
        System.out.println("AlbumController.AlbumController");
    }
}
