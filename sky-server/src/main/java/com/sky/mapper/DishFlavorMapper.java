package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DishFlavorMapper {

    /**
     * 批量插入菜品配料信息
     * @param flavors
     */
    void insertBatch(List<DishFlavor> flavors);

    /**
     * 根据菜品id删除菜品配料信息
     * @param id
     */
    @Delete("DELETE FROM dish_flavor WHERE dish_id = #{id}")
    void deleteByDishId(Long id);

    /**
     * 根据菜品id删除菜品配料信息
     * @param DishIds
     */
    void deleteByDishIds(List<Long> DishIds);

    /**
     * 根据菜品id查询口味数据
     * @param id
     * @return
     */
    @Select("SELECT * FROM dish_flavor WHERE dish_id = #{id}")
    List<DishFlavor> getByDishId(Long id);


}
