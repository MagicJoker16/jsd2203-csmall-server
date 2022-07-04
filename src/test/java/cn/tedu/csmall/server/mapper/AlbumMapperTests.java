package cn.tedu.csmall.server.mapper;


import cn.tedu.csmall.server.POJO.entity.Album;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//bindingException异常
//org .apache.ibatis.binding.BindingException: Invalid bound statement (not found):
//cn.tedu.csmall.server .mapper .BrandMapper insert
/*
出现此异常是因为找不到与抽象方法对应的SQL语句，原因可能有:
在XML中配置的接口名有误
<mapper> 节点的 namespace 属性值有误
在XML中配置的抽象方法名称有误
<insert>或类似节点的 id 属性值有误
在配置文件中指定的XML路径，此项配置有误
application . properties 中配置的mybatis.mapper-locations 属性有误
如果十分确实以上代码都没有问题，则只可能是依赖项出错
先检查pom.xml中的依赖代码是否正确,如果无误,则删除本地仓库并重新下载
 */
@SpringBootTest
public class AlbumMapperTests {

    @Autowired
    AlbumMapper mapper;

    @Test
    public void testInsert() {
        Album album = new Album();
        album.setName("huaweihahaha");
        System.out.println("插入之前的album" + album);
        int rows = mapper.insert(album);
        System.out.println("row=" + rows);
        System.out.println("插入之后的album" + album);

    }

    @Test
    public void testDeleteById(){
        Long id =1L;
        int rows = mapper.deleteById(id);
        System.out.println("删除成功受影响行数"+rows);
    }

    @Test
    public void testDeleteByIds() {
        int rows = mapper.deleteByIds(null, 1L,3L, 5L, 7L, 9L);
        System.out.println("批量删除完成 受影响的行数" + rows);
    }

    @Test
    public void testUpdate() {
        Long id = 3L;
        String name = "白萝卜";
        int rows = mapper.updateNameById(id, name);
        System.out.println("修改品牌名完成 受影响的行数" + rows);
    }
}
