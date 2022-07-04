package cn.tedu.csmall.server.POJO.DTO.Category;

import java.util.Objects;

public class CategoryAddNewDTO {
    private long categoryId;
    private String name;
    private Integer sort;
    private Boolean enable;
    private Boolean display;
    private String logo;
    private String keywords;


    @Override
    public String toString() {
        return "CommodityAddNewDTO{" +
                "categoryId=" + categoryId +
                ", name='" + name + '\'' +
                ", sort=" + sort +
                ", enable=" + enable +
                ", display=" + display +
                ", logo='" + logo + '\'' +
                ", keywords='" + keywords + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryAddNewDTO that = (CategoryAddNewDTO) o;
        return categoryId == that.categoryId && Objects.equals(name, that.name) && Objects.equals(sort, that.sort) && Objects.equals(enable, that.enable) && Objects.equals(display, that.display) && Objects.equals(logo, that.logo) && Objects.equals(keywords, that.keywords);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryId, name, sort, enable, display, logo, keywords);
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public Boolean getDisplay() {
        return display;
    }

    public void setDisplay(Boolean display) {
        this.display = display;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }
}
