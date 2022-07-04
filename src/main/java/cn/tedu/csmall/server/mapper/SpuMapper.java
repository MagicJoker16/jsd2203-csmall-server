package cn.tedu.csmall.server.mapper;


import cn.tedu.csmall.server.POJO.entity.Spu;
import org.springframework.stereotype.Repository;

@Repository
public interface SpuMapper {
    int insert(Spu spu);

    int deleteById(Long id);

    int deleteByIds(Long... id);


}
