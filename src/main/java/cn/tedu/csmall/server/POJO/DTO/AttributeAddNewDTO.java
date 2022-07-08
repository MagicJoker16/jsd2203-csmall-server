package cn.tedu.csmall.server.POJO.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class AttributeAddNewDTO implements Serializable {

    @ApiModelProperty(value = "属性id",required = true)
    private Long templateId;
    @ApiModelProperty(value = "属性名称",required = true)
    private String name;
    @ApiModelProperty(value = "属性简介",required = true)
    private String description;
    @ApiModelProperty(value = "type",required = true)
    private Integer type;
    @ApiModelProperty(value = "input_type",required = true)
    private Integer inputType;
    @ApiModelProperty(value = "value清单",required = true)
    private String valueList;
    @ApiModelProperty(value = "unit",required = true)
    private String unit;
    @ApiModelProperty(value = "排序",required = true)
    private Integer sort;
    @ApiModelProperty(value = "是否允许customize",required = true)
    private Integer isAllowCustomize;



}
