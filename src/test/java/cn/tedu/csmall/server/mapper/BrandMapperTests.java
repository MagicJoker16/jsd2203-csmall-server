package cn.tedu.csmall.server.mapper;


import cn.tedu.csmall.server.POJO.VO.BrandVO.BrandDetailVO;
import cn.tedu.csmall.server.POJO.entity.Brand;
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
public class BrandMapperTests {

    @Autowired
    BrandMapper mapper;

    @Test
    public void testInsert() {
        Brand brand = new Brand();
        brand.setName("摩托罗拉拉拉");
        brand.setPinyin("motuoluolalala");
        System.out.println("插入之前的brand" + brand);
        int rows = mapper.insert(brand);
        System.out.println("row=" + rows);
        System.out.println("插入之后的brand" + brand);

    }

    @Test
    public void testDeleteById() {
        Long id = 1L;
        int rows = mapper.deleteById(id);
        System.out.println("删除成功 受影响的行数" + rows);
    }

    @Test
    public void testDeleteByIds() {
        int rows = mapper.deleteByIds(1L, 3L, 5L, 7L, 9L);
        System.out.println("批量删除完成，受影响的行数=" + rows);
    }

    @Test
    public void testUpdateById() {
        Long id = 3L;
        String name = "大白菜";
        Brand brand=new Brand();
        brand.setName(name);
        brand.setId(id);
        int rows = mapper.updateNameById(name, id);
        System.out.println("修改品牌信息完成 受影响的行数" + rows);
    }

    @Test
    public void testUpdateNameById(){
        Long id = 3L;
        String name = "大白菜";
        Brand brand=new Brand();
        brand.setName(name);
        brand.setId(id);

        int rows = mapper.updateById(brand);
        System.out.println("修改品牌名完成 受影响的行数="+ rows);
    }

    @Test
    public void testCount(){
       int count = mapper.count();
        System.out.println("查询商品"+count);
    }
    @Test
    public void testGetById() {
        Long id = 8L;
        BrandDetailVO brandDetailVO = mapper.getById(id);
        System.out.println("根据id=" + id + "查询完成，结果=" + brandDetailVO);
    }



}
