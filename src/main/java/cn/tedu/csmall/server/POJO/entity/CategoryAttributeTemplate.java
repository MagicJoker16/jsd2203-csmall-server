package cn.tedu.csmall.server.POJO.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class CategoryAttributeTemplate implements Serializable {
    private Long id;
    private Long categoryId;
    private Long attributeTemplateId;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;

    @Override
    public String toString() {
        return "CategoryAttributeTemplate{" +
                "id=" + id +
                ", categoryId=" + categoryId +
                ", attributeTemplateId=" + attributeTemplateId +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryAttributeTemplate that = (CategoryAttributeTemplate) o;
        return Objects.equals(id, that.id) && Objects.equals(categoryId, that.categoryId) && Objects.equals(attributeTemplateId, that.attributeTemplateId) && Objects.equals(gmtCreate, that.gmtCreate) && Objects.equals(gmtModified, that.gmtModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, categoryId, attributeTemplateId, gmtCreate, gmtModified);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getAttributeTemplateId() {
        return attributeTemplateId;
    }

    public void setAttributeTemplateId(Long attributeTemplateId) {
        this.attributeTemplateId = attributeTemplateId;
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
