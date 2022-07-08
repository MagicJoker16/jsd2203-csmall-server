package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.POJO.VO.CategoryDetailVO;
import cn.tedu.csmall.server.POJO.entity.Category;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryMapper {
    int insert(Category category);

    int deleteById(Long id);

    int deleteByIds(Long... id);

    int updateById(Category category);

    int updateNameById(@Param("id") Long id, @Param("name") String name);

    int count();

    int countByName(String name);

    CategoryDetailVO getById(Long id);

    List<CategoryDetailVO>list();



}
