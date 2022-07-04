package cn.tedu.csmall.server.mapper;


import cn.tedu.csmall.server.POJO.entity.Sku;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class SkuMapperTests {

    @Autowired
    SkuMapper mapper;

    @Test
    public void testInsert() {
        Sku sku = new Sku();
        sku.setSpuId(1L);
        sku.setId(1L);
        BigDecimal setPrice = new BigDecimal(Double.toString(66.66));
        sku.setPrice(setPrice);
        System.out.println("插入之前的sku" + sku);
        int rows = mapper.insert(sku);
        System.out.println("row=" + rows);
        System.out.println("插入之后的sku" + sku);

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

