package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.POJO.entity.BrandCategory;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandCategoryMapper {
    int insert(BrandCategory brandCategory);

    int deleteById(Long id);

    int deleteByIds(Long... id);


}
