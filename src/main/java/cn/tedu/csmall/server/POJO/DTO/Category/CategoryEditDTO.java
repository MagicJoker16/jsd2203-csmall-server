package cn.tedu.csmall.server.POJO.DTO.Category;

import lombok.Data;

import java.util.Objects;
@Data
public class CategoryEditDTO {
    private Long id;
    private Long categoryId;
    private String name;
    private Integer sort;
    private Boolean enable;
    private Boolean display;
    private String logo;
    private String keywords;

}
