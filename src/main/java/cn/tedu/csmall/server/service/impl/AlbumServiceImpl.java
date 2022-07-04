package cn.tedu.csmall.server.service.impl;

import cn.tedu.csmall.server.repo.IAlbumRepository;
import cn.tedu.csmall.server.repo.impl.AlbumRepositoryImpl;
import cn.tedu.csmall.server.service.IAlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlbumServiceImpl implements IAlbumService {
    @Autowired
    public AlbumRepositoryImpl albumRepository;

    public AlbumServiceImpl(){
        System.out.println("ASI构造运行了");
    }
}
