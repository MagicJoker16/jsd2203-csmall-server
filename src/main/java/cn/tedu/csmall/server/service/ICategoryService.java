package cn.tedu.csmall.server.service;

import cn.tedu.csmall.server.POJO.DTO.CategoryAddNewDTO;

/**
 * 类别业务接口
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
public interface ICategoryService {

    /**
     * 创建类别
     *
     * @param categoryAddNewDTO 需要创建的类别数据
     */
    void addNew(CategoryAddNewDTO categoryAddNewDTO);

}
