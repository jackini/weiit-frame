package com.weiit.core.service;

import java.util.List;

import com.weiit.core.entity.E;
import com.weiit.core.entity.FormMap;

/**
 * 公共接口定义
 *
 * @author 半个鼠标
 * @version 1.0
 * @date 2017年2月5日 上午3:57:00
 * @company http://www.wei-it.com
 */
public interface BaseService {
    /**
     * 插入对象
     *
     * @param Map对象
     */
    int insert(FormMap param);

    /**
     * 更新对象
     *
     * @param Map对象
     */
    int edit(FormMap param);

    /**
     * 通过条件删除, 删除对象
     *
     * @param Map对象
     */
    int remove(FormMap param);

    /**
     * 通过条件批量删除
     *
     * @param Map对象
     */
    int removeBatch(FormMap param);

    /**
     * 查询单个对象
     *
     * @param Map对象
     * @return Map对象
     */
    E selectOne(FormMap param);

    /**
     * 根据id查询单个对象
     *
     * @param Map对象
     * @return Map对象
     */
    E selectById(FormMap param);

    /**
     * 查询多个对象
     *
     * @param Map对象
     * @return Map对象的List集合
     */
    List<E> selectList(FormMap param);
}
