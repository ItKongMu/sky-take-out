package com.sky.mapper;

import com.sky.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    /**
     * 根据openid查询用户信息
     * @param openid
     * @return
     */
    @Select("SELECT * FROM user WHERE openid = #{openid}")
    User getByOpenid(String openid);

    /**
     * 插入用户信息
     * 并返回获取用户id
     * @param user
     */
    void insert(User user);

    @Select("SELECT * FROM user WHERE id = #{userId}")
    User getById(Long userId);
}
