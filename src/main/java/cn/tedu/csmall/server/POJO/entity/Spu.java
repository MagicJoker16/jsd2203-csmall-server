package cn.tedu.csmall.server.POJO.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class Spu {
    private Long id;
    private String name;
    private String typeNumber;
    private String title;
    private String description;
    private BigDecimal listPrice;
    private Integer stock;
    private Integer stockThreshold;
    private String unit;
    private Long brandId;
    private String brandName;
    private Long categoryId;
    private String categoryName;
    private Long attributeTemplateId;
    private Long albumId;
    private String pictures;
    private String keywords;
    private String tags;
    private Integer sales;
    private Integer commentCount;
    private Integer positiveCommentCount;
    private Integer sort;
    private Integer isDeleted;
    private Integer isPublished;
    private Integer isNewArrival;
    private Integer isRecommend;
    private Integer isChecked;
    private String checkUser;
    private LocalDateTime gmtCheck;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;

    @Override
    public String toString() {
        return "Spu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", typeNumber='" + typeNumber + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", listPrice=" + listPrice +
                ", stock=" + stock +
                ", stockThreshold=" + stockThreshold +
                ", unit='" + unit + '\'' +
                ", brandId=" + brandId +
                ", brandName='" + brandName + '\'' +
                ", categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", attributeTemplateId=" + attributeTemplateId +
                ", albumId=" + albumId +
                ", pictures='" + pictures + '\'' +
                ", keywords='" + keywords + '\'' +
                ", tags='" + tags + '\'' +
                ", sales=" + sales +
                ", commentCount=" + commentCount +
                ", positiveCommentCount=" + positiveCommentCount +
                ", sort=" + sort +
                ", isDeleted=" + isDeleted +
                ", isPublished=" + isPublished +
                ", isNewArrival=" + isNewArrival +
                ", isRecommend=" + isRecommend +
                ", isChecked=" + isChecked +
                ", checkUser='" + checkUser + '\'' +
                ", gmtCheck=" + gmtCheck +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spu spu = (Spu) o;
        return Objects.equals(id, spu.id) && Objects.equals(name, spu.name) && Objects.equals(typeNumber, spu.typeNumber) && Objects.equals(title, spu.title) && Objects.equals(description, spu.description) && Objects.equals(listPrice, spu.listPrice) && Objects.equals(stock, spu.stock) && Objects.equals(stockThreshold, spu.stockThreshold) && Objects.equals(unit, spu.unit) && Objects.equals(brandId, spu.brandId) && Objects.equals(brandName, spu.brandName) && Objects.equals(categoryId, spu.categoryId) && Objects.equals(categoryName, spu.categoryName) && Objects.equals(attributeTemplateId, spu.attributeTemplateId) && Objects.equals(albumId, spu.albumId) && Objects.equals(pictures, spu.pictures) && Objects.equals(keywords, spu.keywords) && Objects.equals(tags, spu.tags) && Objects.equals(sales, spu.sales) && Objects.equals(commentCount, spu.commentCount) && Objects.equals(positiveCommentCount, spu.positiveCommentCount) && Objects.equals(sort, spu.sort) && Objects.equals(isDeleted, spu.isDeleted) && Objects.equals(isPublished, spu.isPublished) && Objects.equals(isNewArrival, spu.isNewArrival) && Objects.equals(isRecommend, spu.isRecommend) && Objects.equals(isChecked, spu.isChecked) && Objects.equals(checkUser, spu.checkUser) && Objects.equals(gmtCheck, spu.gmtCheck) && Objects.equals(gmtCreate, spu.gmtCreate) && Objects.equals(gmtModified, spu.gmtModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, typeNumber, title, description, listPrice, stock, stockThreshold, unit, brandId, brandName, categoryId, categoryName, attributeTemplateId, albumId, pictures, keywords, tags, sales, commentCount, positiveCommentCount, sort, isDeleted, isPublished, isNewArrival, isRecommend, isChecked, checkUser, gmtCheck, gmtCreate, gmtModified);
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

    public String getTypeNumber() {
        return typeNumber;
    }

    public void setTypeNumber(String typeNumber) {
        this.typeNumber = typeNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getListPrice() {
        return listPrice;
    }

    public void setListPrice(BigDecimal listPrice) {
        this.listPrice = listPrice;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getStockThreshold() {
        return stockThreshold;
    }

    public void setStockThreshold(Integer stockThreshold) {
        this.stockThreshold = stockThreshold;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Long getAttributeTemplateId() {
        return attributeTemplateId;
    }

    public void setAttributeTemplateId(Long attributeTemplateId) {
        this.attributeTemplateId = attributeTemplateId;
    }

    public Long getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Long albumId) {
        this.albumId = albumId;
    }

    public String getPictures() {
        return pictures;
    }

    public void setPictures(String pictures) {
        this.pictures = pictures;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
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

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Integer getIsPublished() {
        return isPublished;
    }

    public void setIsPublished(Integer isPublished) {
        this.isPublished = isPublished;
    }

    public Integer getIsNewArrival() {
        return isNewArrival;
    }

    public void setIsNewArrival(Integer isNewArrival) {
        this.isNewArrival = isNewArrival;
    }

    public Integer getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(Integer isRecommend) {
        this.isRecommend = isRecommend;
    }

    public Integer getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(Integer isChecked) {
        this.isChecked = isChecked;
    }

    public String getCheckUser() {
        return checkUser;
    }

    public void setCheckUser(String checkUser) {
        this.checkUser = checkUser;
    }

    public LocalDateTime getGmtCheck() {
        return gmtCheck;
    }

    public void setGmtCheck(LocalDateTime gmtCheck) {
        this.gmtCheck = gmtCheck;
    }

    public LocalDateTime getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(LocalDateTime gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public LocalDateTime getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(LocalDateTime gmtModified) {
        this.gmtModified = gmtModified;
    }
}
