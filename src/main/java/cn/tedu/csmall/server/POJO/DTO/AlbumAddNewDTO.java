package cn.tedu.csmall.server.POJO.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class AlbumAddNewDTO implements Serializable {

    @ApiModelProperty(value = "相册名称",required = true)
    private String name;
    @ApiModelProperty(value = "相册简介",required = true)
    private String description;



}