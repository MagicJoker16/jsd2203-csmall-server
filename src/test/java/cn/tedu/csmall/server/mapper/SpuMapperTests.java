package cn.tedu.csmall.server.mapper;


import cn.tedu.csmall.server.POJO.entity.Spu;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;


@SpringBootTest
public class SpuMapperTests {

    @Autowired
    SpuMapper mapper;

    @Test
    public void testInsert() {
     Spu spu=new Spu();
        spu.setName("华为");
        BigDecimal setPrice =new BigDecimal(Double.toString(1245.11));
        spu.setListPrice(setPrice);
        System.out.println("插入之前的album" + spu);
        int rows = mapper.insert(spu);
        System.out.println("row=" + rows);
        System.out.println("插入之后的album" + spu);

    }

    @Test
    public void testDeleteById() {
        Long id = 1L;
        int rows = mapper.deleteById(id);
        System.out.println("删除成功受影响行数" + rows);
    }

    @Test
    public void testDeleteByIds() {
        int rows = mapper.deleteByIds(1L, 3L, 5L, 7L, 9L);
        System.out.println("批量删除完成 受影响的行数" + rows);
    }


}

