package cn.tedu.csmall.server.mapper;


import cn.tedu.csmall.server.POJO.entity.Attribute;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AttributeMapper {
    int insert(Attribute attribute);

    int deleteById(Long id);

    int deleteByIds(Long... id);


}
