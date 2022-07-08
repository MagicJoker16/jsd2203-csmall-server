package cn.tedu.csmall.server.service.impl;

import cn.tedu.csmall.server.POJO.DTO.AttributeAddNewDTO;
import cn.tedu.csmall.server.ex.ServiceException;
import cn.tedu.csmall.server.mapper.AttributeMapper;
import cn.tedu.csmall.server.repo.IAttributeRepository;
import cn.tedu.csmall.server.repo.impl.AttributeRepositoryImpl;
import cn.tedu.csmall.server.service.IAttributeService;
import cn.tedu.csmall.server.web.ServiceCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class AttributeServiceImpl implements IAttributeService {
    @Autowired
    public IAttributeRepository attributeRepository;

    @Autowired
    public AttributeMapper attributeMapper;

    public void AttributeServiceImpl() {
        System.out.println("AttributeServiceImpl构造方法");
    }

    @Override
    public void addNew(AttributeAddNewDTO attributeAddNewDTO) {
        log.debug("准备开始处理增加品牌的业务,参数{}", attributeAddNewDTO);

        String name = attributeAddNewDTO.getName();
        int count = attributeMapper.countByName(name);
        if (count > 0) {
            String message = "增加类别失败,类别名称{" + name + "}已经被占用";
            log.error(message);
            throw new ServiceException(ServiceCode.ERR_CONFLICT, message);
        }
    }
}