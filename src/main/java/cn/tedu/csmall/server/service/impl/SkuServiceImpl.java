package cn.tedu.csmall.server.service.impl;

import cn.tedu.csmall.server.repo.ISkuRepository;
import cn.tedu.csmall.server.repo.impl.SkuRepositoryImpl;
import cn.tedu.csmall.server.service.ISkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkuServiceImpl implements ISkuService {
    @Autowired
    public ISkuRepository skuRepository;

    public void SkuServiceImpl() {
        System.out.println("SkuServiceImpl构造");
    }
}
