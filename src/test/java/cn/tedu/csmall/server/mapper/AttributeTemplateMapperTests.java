package cn.tedu.csmall.server.mapper;


import cn.tedu.csmall.server.POJO.entity.AttributeTemplate;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@Slf4j
@SpringBootTest
public class AttributeTemplateMapperTests {

    @Autowired
    AttributeTemplateMapper mapper;

    @Test
    public void testInsert() {
        AttributeTemplate attributeTemplate =new AttributeTemplate();
        attributeTemplate.setName("huaweihahaha");
        System.out.println("插入之前的attributeTemplate" + attributeTemplate);
        int rows = mapper.insert(attributeTemplate);
        System.out.println("row=" + rows);
        System.out.println("插入之后的attributeTemplate" + attributeTemplate);

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

    @Test
    public void testCountByName(){
        String name = "智能手机";
        int count = mapper.countByName(name);
        log.debug("根据name={}查询完成,结果={}",name,count);
    }

    }

