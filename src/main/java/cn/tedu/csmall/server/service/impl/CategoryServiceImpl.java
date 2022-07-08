package cn.tedu.csmall.server.service.impl;

import cn.tedu.csmall.server.POJO.DTO.CategoryAddNewDTO;

import cn.tedu.csmall.server.POJO.entity.Category;
import cn.tedu.csmall.server.ex.ServiceException;
import cn.tedu.csmall.server.mapper.CategoryMapper;
import cn.tedu.csmall.server.repo.ICategoryRepository;
import cn.tedu.csmall.server.service.ICategoryService;
import cn.tedu.csmall.server.web.ServiceCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class CategoryServiceImpl  implements ICategoryService
{
    @Autowired
    public ICategoryRepository cateRepository;

    @Autowired
    public CategoryMapper categoryMapper;


    public CategoryServiceImpl() {
        System.out.println("CategoryService");
    }

    @Override
    public void addNew(CategoryAddNewDTO categoryAddNewDTO) {
        log.debug("准备开始处理增加SKu的业务,参数{}", categoryAddNewDTO);

        String name = categoryAddNewDTO.getName();
        int count = categoryMapper.countByName(name);
        if (count > 0) {
            String message = "增加类别失败，类别名称【" + name + "】已经被占用！";
            log.error(message);
            throw new ServiceException(ServiceCode.ERR_CONFLICT, message);
        }
        Category category = new Category();

        BeanUtils.copyProperties(categoryAddNewDTO,category);

        log.debug("即将向表中写入数据",category);
        int rows = categoryMapper.insert(category);
        if(rows !=1){
            String message = "创建品牌失败,服务器忙,请稍后再试";
            log.error(message);
            throw new ServiceException(ServiceCode.ERR_INSERT,message);
        }
    }
}
