package cn.tedu.csmall.server.service.impl;

import cn.tedu.csmall.server.service.IBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImpl implements IBrandService {
    @Autowired
    public IBrandService brandRepository;


}
