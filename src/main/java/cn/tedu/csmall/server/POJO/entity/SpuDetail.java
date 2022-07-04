package cn.tedu.csmall.server.POJO.entity;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Objects;
@Data
public class SpuDetail {
    private Long id;
    private Long spuId;
    private String detail;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;

}
