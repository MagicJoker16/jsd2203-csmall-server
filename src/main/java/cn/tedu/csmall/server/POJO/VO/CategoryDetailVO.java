package cn.tedu.csmall.server.POJO.VO;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class CategoryDetailVO implements Serializable {
    private Long id;
    private String name;
    private Long parentId;
    private Integer depth;
    private String keywords;
    private Integer sort;
    private String icon;
    private Integer enable;
    private Integer isParent;
    private Integer isDisplay;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;

}
