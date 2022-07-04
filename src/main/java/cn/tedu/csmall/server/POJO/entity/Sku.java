package cn.tedu.csmall.server.POJO.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class Sku {
    private Long id;
    private Long spuId;
    private String title;
    private String barCode;
    private Long attributeTemplateId;
    private String specifications;
    private Long albumId;
    private String pictures;
    private BigDecimal price;
    private Integer stock;
    private Integer stockThreshold;
    private Integer sales;
    private Integer commentCount;
    private Integer positiveCommentCount;
    private Integer sort;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;

    @Override
    public String toString() {
        return "Sku{" +
                "id=" + id +
                ", spuId=" + spuId +
                ", title='" + title + '\'' +
                ", barCode='" + barCode + '\'' +
                ", attributeTemplateId=" + attributeTemplateId +
                ", specifications='" + specifications + '\'' +
                ", albumId=" + albumId +
                ", pictures='" + pictures + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", stockThreshold=" + stockThreshold +
                ", sales=" + sales +
                ", commentCount=" + commentCount +
                ", positiveCommentCount=" + positiveCommentCount +
                ", sort=" + sort +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sku sku = (Sku) o;
        return Objects.equals(id, sku.id) && Objects.equals(spuId, sku.spuId) && Objects.equals(title, sku.title) && Objects.equals(barCode, sku.barCode) && Objects.equals(attributeTemplateId, sku.attributeTemplateId) && Objects.equals(specifications, sku.specifications) && Objects.equals(albumId, sku.albumId) && Objects.equals(pictures, sku.pictures) && Objects.equals(price, sku.price) && Objects.equals(stock, sku.stock) && Objects.equals(stockThreshold, sku.stockThreshold) && Objects.equals(sales, sku.sales) && Objects.equals(commentCount, sku.commentCount) && Objects.equals(positiveCommentCount, sku.positiveCommentCount) && Objects.equals(sort, sku.sort) && Objects.equals(gmtCreate, sku.gmtCreate) && Objects.equals(gmtModified, sku.gmtModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, spuId, title, barCode, attributeTemplateId, specifications, albumId, pictures, price, stock, stockThreshold, sales, commentCount, positiveCommentCount, sort, gmtCreate, gmtModified);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSpuId() {
        return spuId;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public Long getAttributeTemplateId() {
        return attributeTemplateId;
    }

    public void setAttributeTemplateId(Long attributeTemplateId) {
        this.attributeTemplateId = attributeTemplateId;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
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
