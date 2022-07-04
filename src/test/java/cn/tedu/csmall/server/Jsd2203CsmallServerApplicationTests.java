package cn.tedu.csmall.server;

import cn.tedu.csmall.server.controller.*;
import cn.tedu.csmall.server.repo.impl.AttributeRepositoryImpl;
import cn.tedu.csmall.server.repo.impl.AttributeTemplateRepositoryImpl;
import cn.tedu.csmall.server.repo.impl.SkuRepositoryImpl;
import cn.tedu.csmall.server.repo.impl.SpuRepositoryImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class Jsd2203CsmallServerApplicationTests {

    @Test
    void contextLoads() {


        System.out.println("Jsd2203CsmallServerApplicationTests.contextLoads");
    }

    //Spring 容器
    @Autowired
    public ApplicationContext ac;
//    @Test
//    void testGetBean(){
//        CategoryController categoryController = ac.getBean(CategoryController.class);
//        System.out.println(categoryController);
//
//        CategoryService categoryService = ac.getBean(CategoryService.class);
//        System.out.println(categoryService);
//
//        Date date = ac.getBean(Date.class);
//        System.out.println(date);
//
//        Calendar calendar = ac.getBean(Calendar.class);
//        System.out.println(calendar);
//
//        LocalDateTime localDateTime = ac.getBean(LocalDateTime.class);
//        System.out.println(localDateTime);
//
//        PictureController pictureController = ac.getBean(PictureController.class);
//        System.out.println(pictureController);
//
//        AlbumController albumController = ac.getBean(AlbumController.class);
//        System.out.println(albumController);
//
//        BrandController brandController = ac.getBean(BrandController.class);
//        System.out.println(brandController);
//
//    }
//
//    @Test
//    public void testGetBeanSingleton(){
//        CategoryService categoryService1 = ac.getBean(CategoryService.class);
//        CategoryService categoryService2 = ac.getBean(CategoryService.class);
//        CategoryService categoryService3 = ac.getBean(CategoryService.class);
//        System.out.println(categoryService1);
//        System.out.println(categoryService2);
//        System.out.println(categoryService3);
//    }
//
//   @Autowired
//    CategoryService categoryService;
//    @Autowired
//    CategoryController categoryController;
//    @Autowired
//    CateRepositoryImpl cateRepository;
//    @Autowired
//    Date date;
//
//    @Test
//    public void testAutowired(){
//        System.out.println(categoryController);
//        System.out.println(cateRepository);
//        System.out.println(cateRepository);
//        System.out.println(date);
//    }
//
//
//
//    @Autowired
//    BrandServiceImpl brandService;
//
//    @Test
//    public void testBrandAutowired() {
//
//
//
//    }
//
//
// @Autowired
//    AlbumServiceImpl albumService;
//    @Test
//    public void testAlbum(){
//        System.out.println(albumService.albumRepository);
//    }

//@Autowired
//    AlbumController albumController;
//    @Test
//    public void test_Album(){
//        System.out.println(albumController.albumService);
//    }


//    @Autowired
//    public AttributeController attributeController;
//    @Autowired
//    public AttributeTemplateController attributeTemplateController;
//    @Autowired
//    public SkuController skuController;
//    @Autowired
//    public SpuController spuController;
//
//    @Test
//    public void testController(){
//        System.out.println(attributeController.attributeService);
//        System.out.println(attributeTemplateController.attributeTemplateService);
//        System.out.println(skuController.skuService);
//        System.out.println(spuController.spuService);
//    }
//
//    @Autowired
//    public AttributeRepositoryImpl attributeRepository;
//    @Autowired
//    public AttributeTemplateRepositoryImpl attributeTemplateRepository;
//    @Autowired
//    public SkuRepositoryImpl skuRepository;
//    @Autowired
//    public SpuRepositoryImpl spuRepository;
//
//    @Test
//    public void testRepositoryImpl() {
//        System.out.println(attributeRepository);
//        System.out.println(attributeTemplateRepository);
//        System.out.println(skuRepository);
//        System.out.println(spuRepository);
//    }



}
