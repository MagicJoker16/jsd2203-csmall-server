package cn.tedu.csmall.server.POJO.VO.BrandVO;

import java.util.Objects;

public class BrandDetailVO {

    private Long id;
    private String name;
    private String pinyin;
    private String logo;
    private String description;
    private String keywords;
    private Integer sort;
    private Integer sales;
    private Integer productCount;
    private Integer commentCount;
    private Integer positiveCommentCount;
    private Integer enable;

    @Override
    public String toString() {
        return "BrandDetailVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pinyin='" + pinyin + '\'' +
                ", logo='" + logo + '\'' +
                ", description='" + description + '\'' +
                ", keywords='" + keywords + '\'' +
                ", sort=" + sort +
                ", sales=" + sales +
                ", productCount=" + productCount +
                ", commentCount=" + commentCount +
                ", positiveCommentCount=" + positiveCommentCount +
                ", enable=" + enable +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BrandDetailVO that = (BrandDetailVO) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(pinyin, that.pinyin) && Objects.equals(logo, that.logo) && Objects.equals(description, that.description) && Objects.equals(keywords, that.keywords) && Objects.equals(sort, that.sort) && Objects.equals(sales, that.sales) && Objects.equals(productCount, that.productCount) && Objects.equals(commentCount, that.commentCount) && Objects.equals(positiveCommentCount, that.positiveCommentCount) && Objects.equals(enable, that.enable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, pinyin, logo, description, keywords, sort, sales, productCount, commentCount, positiveCommentCount, enable);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
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

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getPositiveCommentCount() {
        return positiveCommentCount;
    }

    public void setPositiveCommentCount(Integer positiveCommentCount) {
        this.positiveCommentCount = positiveCommentCount;
    }

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }
}
