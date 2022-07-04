package cn.tedu.csmall.server.mapper;


import cn.tedu.csmall.server.POJO.entity.SkuSpecification;
import org.springframework.stereotype.Repository;

@Repository
public interface SkuSpecificationMapper {
    int insert(SkuSpecification skuSpecification);

    int deleteById(Long id);

    int deleteByIds(Long... id);


}
