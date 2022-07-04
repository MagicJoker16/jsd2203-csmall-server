package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.POJO.entity.Album;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumMapper {
    int insert(Album album);

    int deleteById(Long id);

    int deleteByIds(@Param("name") String name,@Param("ids") Long... id);

    int updateNameById(@Param("id") Long id, @Param("name") String name);
}
