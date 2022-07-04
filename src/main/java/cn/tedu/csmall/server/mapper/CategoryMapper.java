package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.POJO.entity.Category;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryMapper {
    int insert(Category category);

    int deleteById(Long id);

    int deleteByIds(Long... id);


}
