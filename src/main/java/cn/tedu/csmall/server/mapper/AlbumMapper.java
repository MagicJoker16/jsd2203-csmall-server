package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.POJO.VO.AlbumDetailVO;
import cn.tedu.csmall.server.POJO.VO.AlbumListItemVO;
import cn.tedu.csmall.server.POJO.entity.Album;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * 相册Mapper接口
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
@Repository
public interface AlbumMapper {

    /**
     * 新增相册
     *
     * @param album 新增的相册对象
     * @return 受影响的行数
     */
    int insert(Album album);

    /**
     * 根据id删除相册
     *
     * @param id 被删除的相册的id
     * @return 受影响的行数
     */
    int deleteById(Long id);

    /**
     * 根据若干个相册id，批量删除相册数据
     *
     * @param ids 期望删除的若干个相册数据的id
     * @return 受影响的行数，将返回成功删除的数据量
     */
    int deleteByIds(Long... ids);

    /**
     * 统计相册的数量
     *
     * @return 相册的数量
     */
    int count();

    /**
     * 根据相册名称查找此名称对应的相册
     *
     * @param name 相册名称
     * @return 此名称对应的相册数量
     */
    int countByName(String name);

    /**
     * 根据id查询相册详情
     *
     * @param id 相册的id
     * @return 匹配的相册详情，如果没有匹配的数据，则返回null
     */
    AlbumDetailVO getById(Long id);

    /**
     * 查询相册列表
     *
     * @return 相册列表
     */
    List<AlbumListItemVO> list();

}
