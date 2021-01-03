package com.weiit.web.admin.system.mapper;


import com.weiit.core.entity.FormMap;
import com.weiit.core.mapper.BaseMapper;


/**
 * 资源管理mapper
 *
 * @author 半个鼠标
 * @version 1.0
 * @date：2017年2月14日 上午2:35:53
 * @company http://www.wei-it.com
 */
public interface ResourceMapper extends BaseMapper {

    /**
     * 修改资源状态
     *
     * @param formMap
     */
    public void updateState(FormMap formMap);
}
