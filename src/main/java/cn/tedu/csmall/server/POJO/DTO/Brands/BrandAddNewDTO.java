package cn.tedu.csmall.server.POJO.DTO.Brands;

import java.io.Serializable;
import java.util.Objects;

public class BrandAddNewDTO implements Serializable {
    //所有的POJO类型都应该符合以下设计标准：简单的java对象 持久化保存的java对象
    //所有属性都是私有的(private)
    //每个属性都有对应的、命名规范的Setter&Getter
    //通过专业的开发工具生成即可
    //应该生成hashcode()和equals()方法，且保证：2个对象中所有属性值都相同时，返回相同的
    //hashcode(),且这2各对象的equals()对t比结果为true
    //通过专业的开发工具生成即可
    //通过Intelli可IDEA生成时，还有多种代码模版可选择，选择任何一个模版均可
    //实现序列化接口
    //可以不生成序列化版本id
    //

    private String name;
    private String pinyin;
    private Integer sort;
    private String logo;
    private long categoryId;
    private String description;
    private String keywords;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BrandAddNewDTO that = (BrandAddNewDTO) o;
        return categoryId == that.categoryId && Objects.equals(name, that.name) && Objects.equals(pinyin, that.pinyin) && Objects.equals(sort, that.sort) && Objects.equals(logo, that.logo) && Objects.equals(description, that.description) && Objects.equals(keywords, that.keywords);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pinyin, sort, logo, categoryId, description, keywords);
    }

    @Override
    public String toString() {
        return "BrandAddNewDTO{" +
                "name='" + name + '\'' +
                ", pinyin='" + pinyin + '\'' +
                ", sort=" + sort +
                ", logo='" + logo + '\'' +
                ", categoryId=" + categoryId +
                ", description='" + description + '\'' +
                ", keywords='" + keywords + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }



    //setters & getters
    //hashcode & equals()
    //toString()
}