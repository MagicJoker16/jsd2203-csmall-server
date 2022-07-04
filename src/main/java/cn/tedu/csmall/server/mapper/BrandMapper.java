package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.POJO.entity.Brand;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Repository//让测试类不报错
public interface BrandMapper {
    /**
     * 插入品牌数据
     *
     * @param brand 品牌数据
     * @return 受影响行数, 成功插入数据时, 将返回1
     */
    int insert(Brand brand);

    /**
     * 根据品牌id 删除品牌数据
     *
     * @param id 期望删除的品牌数据的id
     * @return 受影响的行数, 当删除成功时 将返回1 如果无此id对应的数据 将返回0
     */
    int deleteById(Long id);

    int deleteByIds(Long... id);

    int updateNameById(@Param("name") String name, @Param("id") Long id);

    int updateById(Brand brand);

    int count();




}
