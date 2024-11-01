package com.sky.service;

import com.sky.dto.SetmealDTO;
import com.sky.dto.SetmealPageQueryDTO;
import com.sky.result.PageResult;
import com.sky.vo.SetmealVO;

import java.util.List;

public interface SetmealService {

    /**
     * 新增套餐及菜品信息
     * @param setmealDTO
     */
    void saveWithDish(SetmealDTO setmealDTO);

    /**
     * 根据id获取套餐及菜品信息
     * @param id
     * @return
     */
    SetmealVO getByIdWithDish(Long id);

    /**
     * 分页查询套餐及菜品信息
     * @param setmealPageQueryDTO
     * @return
     */
    PageResult pageQuery(SetmealPageQueryDTO setmealPageQueryDTO);

    /**
     * 批量删除套餐及菜品信息
     * @param ids
     */
    void deleteBatch(List<Long> ids);

    /**
     * 修改套餐及菜品信息
     * @param setmealDTO
     */
    void update(SetmealDTO setmealDTO);

    /**
     * 启用或停用套餐及菜品信息
     * @param status
     * @param id
     */
    void startOrStop(Integer status, Long id);
}
