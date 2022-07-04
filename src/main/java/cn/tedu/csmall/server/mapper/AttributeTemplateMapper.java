package cn.tedu.csmall.server.mapper;



import cn.tedu.csmall.server.POJO.entity.AttributeTemplate;
import org.springframework.stereotype.Repository;

@Repository
public interface AttributeTemplateMapper {
    int insert(AttributeTemplate attributeTemplate);

    int deleteById(Long id);

    int deleteByIds(Long... id);


}
