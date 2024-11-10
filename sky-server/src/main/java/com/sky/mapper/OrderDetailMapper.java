package com.sky.mapper;

import com.sky.entity.OrderDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OrderDetailMapper {

    /**
     * 批量新增订单详情
     * @param orderDetailList
     */
    void insertBatch(List<OrderDetail> orderDetailList);

    @Select("SELECT * FROM order_detail WHERE order_id = #{ordersId}")
    List<OrderDetail> getByOrderId(Long ordersId);
}
