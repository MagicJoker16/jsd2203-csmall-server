package cn.tedu.csmall.server.mapper;


import cn.tedu.csmall.server.POJO.entity.Picture;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PictureMapperTests {

    @Autowired
    PictureMapper mapper;

    @Test
    public void testInsert() {
        Picture picture =new Picture();
        picture.setAlbumId(1L);
        System.out.println("插入之前的picture" + picture);
        int rows = mapper.insert(picture);
        System.out.println("row=" + rows);
        System.out.println("插入之后的picture" + picture);

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

