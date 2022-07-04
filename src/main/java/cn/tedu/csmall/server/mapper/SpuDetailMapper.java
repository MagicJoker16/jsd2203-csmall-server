package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.POJO.entity.SpuDetail;
import org.springframework.stereotype.Repository;

@Repository
public interface SpuDetailMapper {
    int insert(SpuDetail spuDetail);

    int deleteById(Long id);

    int deleteByIds(Long... id);


}
