package cn.tedu.csmall.server.service.impl;

import cn.tedu.csmall.server.POJO.DTO.SkuAddNewDTO;
import cn.tedu.csmall.server.POJO.entity.Sku;
import cn.tedu.csmall.server.ex.ServiceException;
import cn.tedu.csmall.server.mapper.SkuMapper;
import cn.tedu.csmall.server.repo.ISkuRepository;
import cn.tedu.csmall.server.repo.impl.SkuRepositoryImpl;
import cn.tedu.csmall.server.service.ISkuService;
import cn.tedu.csmall.server.web.ServiceCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SkuServiceImpl implements ISkuService {
    @Autowired
    public ISkuRepository skuRepository;

    @Autowired
    private SkuMapper skuMapper;

    public void SkuServiceImpl() {
        System.out.println("SkuServiceImpl构造");
    }

    @Override
    public void addNew(SkuAddNewDTO skuAddNewDTO) {
        log.debug("准备开始处理增加SKu的业务,参数{}", skuAddNewDTO);

        String name = skuAddNewDTO.getTitle();
        int count = skuMapper.countByName(name);
        if (count > 0) {
            String message = "增加类别失败，类别名称【" + name + "】已经被占用！";
            log.error(message);
            throw new ServiceException(ServiceCode.ERR_CONFLICT, message);
        }
        Sku sku = new Sku();

        BeanUtils.copyProperties(skuAddNewDTO,sku);

        log.debug("即将向表中写入数据",sku);
        int rows = skuMapper.insert(sku);
        if(rows !=1){
            String message = "创建品牌失败,服务器忙,请稍后再试";
            log.error(message);
            throw new ServiceException(ServiceCode.ERR_INSERT,message);
        }
    }
}
