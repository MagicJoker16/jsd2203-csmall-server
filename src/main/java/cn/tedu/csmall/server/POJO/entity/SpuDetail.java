package cn.tedu.csmall.server.POJO.entity;

import java.time.LocalDateTime;
import java.util.Objects;

public class SpuDetail {
    private Long id;
    private Long spuId;
    private String detail;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;

    @Override
    public String toString() {
        return "SpuDetail{" +
                "id=" + id +
                ", spuId=" + spuId +
                ", detail='" + detail + '\'' +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpuDetail spuDetail = (SpuDetail) o;
        return Objects.equals(id, spuDetail.id) && Objects.equals(spuId, spuDetail.spuId) && Objects.equals(detail, spuDetail.detail) && Objects.equals(gmtCreate, spuDetail.gmtCreate) && Objects.equals(gmtModified, spuDetail.gmtModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, spuId, detail, gmtCreate, gmtModified);
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

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
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
