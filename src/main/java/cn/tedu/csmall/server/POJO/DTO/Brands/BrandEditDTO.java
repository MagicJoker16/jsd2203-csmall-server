package cn.tedu.csmall.server.POJO.DTO.Brands;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;
@Data
public class BrandEditDTO implements Serializable {

    private String name;
    private String pinyin;
    private String logo;
    private long categoryId;
    private String description;
    private String keywords;
    private Integer sort;


}


