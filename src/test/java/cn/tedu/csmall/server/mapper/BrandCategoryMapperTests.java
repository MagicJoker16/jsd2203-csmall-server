package cn.tedu.csmall.server.mapper;


import cn.tedu.csmall.server.POJO.entity.BrandCategory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BrandCategoryMapperTests {

    @Autowired
    BrandCategoryMapper mapper;

    @Test
    public void testInsert() {
        BrandCategory brandCategory =new BrandCategory();
        brandCategory.setBrandId(1L);
        System.out.println("插入之前的brandCategory" + brandCategory);
        int rows = mapper.insert(brandCategory);
        System.out.println("row=" + rows);
        System.out.println("插入之后的brandCategory" + brandCategory);

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

