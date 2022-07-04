package cn.tedu.csmall.server.POJO.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class Attribute implements Serializable {
    private Long id;
    private Long templateId;
    private String name;
    private String description;
    private Integer type;
    private Integer inputType;
    private String valueList;
    private String unit;
    private Integer sort;
    private Integer isAllowCustomize;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;

    @Override
    public String toString() {
        return "Attribute{" +
                "id=" + id +
                ", templateId=" + templateId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", type=" + type +
                ", inputType=" + inputType +
                ", valueList='" + valueList + '\'' +
                ", unit='" + unit + '\'' +
                ", sort=" + sort +
                ", isAllowCustomize=" + isAllowCustomize +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Attribute attribute = (Attribute) o;
        return Objects.equals(id, attribute.id) && Objects.equals(templateId, attribute.templateId) && Objects.equals(name, attribute.name) && Objects.equals(description, attribute.description) && Objects.equals(type, attribute.type) && Objects.equals(inputType, attribute.inputType) && Objects.equals(valueList, attribute.valueList) && Objects.equals(unit, attribute.unit) && Objects.equals(sort, attribute.sort) && Objects.equals(isAllowCustomize, attribute.isAllowCustomize) && Objects.equals(gmtCreate, attribute.gmtCreate) && Objects.equals(gmtModified, attribute.gmtModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, templateId, name, description, type, inputType, valueList, unit, sort, isAllowCustomize, gmtCreate, gmtModified);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getInputType() {
        return inputType;
    }

    public void setInputType(Integer inputType) {
        this.inputType = inputType;
    }

    public String getValueList() {
        return valueList;
    }

    public void setValueList(String valueList) {
        this.valueList = valueList;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getIsAllowCustomize() {
        return isAllowCustomize;
    }

    public void setIsAllowCustomize(Integer isAllowCustomize) {
        this.isAllowCustomize = isAllowCustomize;
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
