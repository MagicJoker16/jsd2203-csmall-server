package cn.tedu.csmall.server.POJO.entity;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Objects;
@Data
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

}
