package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.POJO.entity.Picture;
import org.springframework.stereotype.Repository;

@Repository
public interface PictureMapper {
    int insert(Picture picture);

    int deleteById(Long id);

    int deleteByIds(Long... id);


}
