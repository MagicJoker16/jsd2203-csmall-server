package cn.tedu.csmall.server.service.impl;

import cn.tedu.csmall.server.POJO.DTO.SpuAddNewDTO;
import cn.tedu.csmall.server.POJO.entity.Brand;
import cn.tedu.csmall.server.POJO.entity.Spu;
import cn.tedu.csmall.server.ex.ServiceException;
import cn.tedu.csmall.server.mapper.SpuMapper;
import cn.tedu.csmall.server.repo.ISpuRepository;
import cn.tedu.csmall.server.repo.impl.SpuRepositoryImpl;
import cn.tedu.csmall.server.service.ISpuService;
import cn.tedu.csmall.server.web.ServiceCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class SpuServiceImpl implements ISpuService {
    @Autowired
    public ISpuRepository spuRepository;

    @Autowired
    private SpuMapper spuMapper;

    public void SpuServiceImpl() {
        System.out.println("SpuServiceImpl构造");
    }


    @Override
    public void addNew(SpuAddNewDTO spuAddNewDTO) {
        log.debug("准备开始处理增加品牌的业务，参数：{}", spuAddNewDTO);
        // 检查此品牌（尝试增加的品牌）的名称有没有被使用
        // 如果已经被使用，则不允许增加
        String name = spuAddNewDTO.getName();
        int count = spuMapper.countByName(name);
        if (count > 0) {
            String message = "增加类别失败，类别名称【" + name + "】已经被占用！";
            log.error(message);
            throw new ServiceException(ServiceCode.ERR_CONFLICT,message);
        }

        Spu spu =new Spu();
        BeanUtils.copyProperties(spuAddNewDTO, spu);

        log.debug("即将向表中写入数据",spu);
        int rows =spuMapper.insert(spu);

        if(rows !=1){
            String message = "创建品牌失败,服务器忙,请稍后再试";
            log.error(message);
            throw new ServiceException(ServiceCode.ERR_INSERT,message);
        }
    }
}
