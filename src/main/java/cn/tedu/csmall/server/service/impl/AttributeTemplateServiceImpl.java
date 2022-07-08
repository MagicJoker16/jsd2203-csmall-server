package cn.tedu.csmall.server.service.impl;

import cn.tedu.csmall.server.POJO.DTO.AttributeTemplateAddNewDTO;
import cn.tedu.csmall.server.POJO.entity.AttributeTemplate;
import cn.tedu.csmall.server.ex.ServiceException;
import cn.tedu.csmall.server.mapper.AttributeTemplateMapper;
import cn.tedu.csmall.server.repo.IAttributeTemplateRepository;
import cn.tedu.csmall.server.service.IAttributeTemplateService;
import cn.tedu.csmall.server.web.ServiceCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AttributeTemplateServiceImpl implements IAttributeTemplateService {
    @Autowired
    public IAttributeTemplateRepository attributeTemplateRepository;

    @Autowired
    AttributeTemplateMapper attributeTemplateMapper;

    @Override
    public void addNew(AttributeTemplateAddNewDTO attributeTemplateAddNewDTO) {
        log.debug("准备开始处理增加属性模板名称的业务，参数：{}", attributeTemplateAddNewDTO);

        String name = attributeTemplateAddNewDTO.getName();

        int count = attributeTemplateMapper.countByName(name);

        if (count > 0) {
            String message = "增加属性模板失败，属性模板名称【" + name + "】已经被占用！";
            log.debug(message);
            throw new ServiceException(ServiceCode.ERR_CONFLICT,message);
        }

        AttributeTemplate attributeTemplate = new AttributeTemplate();

        //将当前方法参数的值复制到attributetemp实体类型的对象中
        BeanUtils.copyProperties(attributeTemplateAddNewDTO,attributeTemplate);

        int rows = attributeTemplateMapper.insert(attributeTemplate);

        if(rows != 1){
            String message = "创建类别失败,服务器忙,请稍后再试";
            log.error(message);
            throw new ServiceException(ServiceCode.ERR_INSERT,message);
        }
    }



}

