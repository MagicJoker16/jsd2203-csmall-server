package cn.tedu.csmall.server.POJO.DTO;

import lombok.Data;

import java.util.Objects;
@Data
public class CategoryAddNewDTO {

    /**
     * 类别名称
     */
    private String name;

    /**
     * 父级类别id，如果无父级，则为0
     */
    private Long parentId;

    /**
     * 关键词列表，各关键词使用英文的逗号分隔
     */
    private String keywords;

    /**
     * 自定义排序序号
     */
    private Integer sort;

    /**
     * 图标图片的URL
     */
    private String icon;

    /**
     * 是否启用，1=启用，0=未启用
     */
    private Integer enable;

    /**
     * 是否显示在导航栏中，1=启用，0=未启用
     */
    private Integer isDisplay;

}
