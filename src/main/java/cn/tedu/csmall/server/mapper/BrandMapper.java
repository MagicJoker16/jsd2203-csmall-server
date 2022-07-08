package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.POJO.VO.BrandDetailVO;
import cn.tedu.csmall.server.POJO.VO.BrandListItemVO;
import cn.tedu.csmall.server.POJO.entity.Brand;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 品牌Mapper接口
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
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

    /**
     * 根据若干个品牌id，批量删除品牌数据
     *
     * @param ids 期望删除的若干个品牌数据的id
     * @return 受影响的行数，将返回成功删除的数据量
     */
    int deleteByIds(Long... ids);

    /**
     * 根据id修改品牌信息，传入的参数应该封装了需要修改的字段值，保持为null的属性对应的字段将不会被修改，注意：必须封装id属性
     * @param brand 封装了新的值的对象
     * @return 受影响的行数，当修改成功时，将返回1，如果无此id对应的数据，将返回0
     */
    int updateById(Brand brand);

    /**
     * 根据id修改品牌的名称
     *
     * @param id   品牌id
     * @param name 新的品牌名称
     * @return 受影响的行数，当修改成功时，将返回1，如果无此id对应的数据，将返回0
     */
    int updateNameById(@Param("name") String name, @Param("id") Long id);

    /**
     * 统计当前表中品牌数据的数量
     *
     * @return 当前表中品牌数据的数量
     */
    int count();

    /**
     * 根据品牌名称统计此名称对应的品牌数据的数量
     *
     * @param name 品牌名称
     * @return 此名称对应的品牌数据的数量
     */
    int countByName(String name);

    /**
     * 根据id查询品牌详情
     * @param id 品牌数据的id
     * @return 匹配的品牌详情，如果没有匹配的数据，将返回null
     */
    BrandDetailVO getById(Long id);

    /**
     * 根据品牌名称查询品牌详情
     *
     * @param name 品牌名称
     * @return 匹配的品牌详情，如果没有匹配的数据，将返回null
     */
    BrandDetailVO getByName(String name);

    /**
     * 查询品牌列表
     *
     * @return 品牌列表的集合
     */
    List<BrandListItemVO> list();

    /**
     * 分页查询品牌列表
     *
     * @param offset 跳过多少条记录
     * @param count  查询多少条记录
     * @return 品牌列表的集合
     */
    List<BrandListItemVO> listPage(
            @Param("offset") Integer offset, @Param("count") Integer count);
}
