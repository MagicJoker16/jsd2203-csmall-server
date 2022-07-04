package cn.tedu.csmall.server.mapper;


import cn.tedu.csmall.server.POJO.entity.CategoryAttributeTemplate;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryAttributeTemplateMapper {
    int insert(CategoryAttributeTemplate attributeTemplate);

    int deleteById(Long id);

    int deleteByIds(Long... id);


}
