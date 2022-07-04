package cn.tedu.csmall.server.repo.impl;

import cn.tedu.csmall.server.repo.IAlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AlbumRepositoryImpl implements IAlbumRepository {
    public AlbumRepositoryImpl() {
        System.out.println("ARI构造运行了");
    }
}
