package cn.tedu.csmall.server.mapper;


import cn.tedu.csmall.server.POJO.entity.Attribute;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AttributeMapperTests {

    @Autowired
    AttributeMapper mapper;

    @Test
    public void testInsert() {
        Attribute attribute = new Attribute();
        attribute.setName("控制核心");
        System.out.println("插入之前的attribute" + attribute);
        int rows = mapper.insert(attribute);
        System.out.println("row=" + rows);
        System.out.println("插入之后的attribute" + attribute);

    }

    @Test
    public void testDeleteById(){
        Long id =1L;
        int rows = mapper.deleteById(id);
        System.out.println("删除成功受影响行数"+rows);
    }

    @Test
    public void testDeleteByIds() {
        int rows = mapper.deleteByIds(1L, 3L, 5L, 7L, 9L);
        System.out.println("批量删除完成 受影响的行数" + rows);
    }



    }

