package cn.tedu.csmall.server.POJO.entity;

import java.time.LocalDateTime;
import java.util.Objects;

public class Picture {
    private Long id;
    private Long albumId;
    private String url;
    private String description;
    private Integer width;
    private Integer height;
    private Integer isCover;
    private Integer sort;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;

    @Override
    public String toString() {
        return "Picture{" +
                "id=" + id +
                ", albumId=" + albumId +
                ", url='" + url + '\'' +
                ", description='" + description + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", isCover=" + isCover +
                ", sort=" + sort +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Picture picture = (Picture) o;
        return Objects.equals(id, picture.id) && Objects.equals(albumId, picture.albumId) && Objects.equals(url, picture.url) && Objects.equals(description, picture.description) && Objects.equals(width, picture.width) && Objects.equals(height, picture.height) && Objects.equals(isCover, picture.isCover) && Objects.equals(sort, picture.sort) && Objects.equals(gmtCreate, picture.gmtCreate) && Objects.equals(gmtModified, picture.gmtModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, albumId, url, description, width, height, isCover, sort, gmtCreate, gmtModified);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Long albumId) {
        this.albumId = albumId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getIsCover() {
        return isCover;
    }

    public void setIsCover(Integer isCover) {
        this.isCover = isCover;
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
