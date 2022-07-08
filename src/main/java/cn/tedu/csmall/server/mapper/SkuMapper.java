package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.POJO.entity.Sku;
import org.springframework.stereotype.Repository;

@Repository
public interface SkuMapper {
    int insert(Sku sku);

    int deleteById(Long id);

    int deleteByIds(Long... ids);

    int countByName(String name);


}
