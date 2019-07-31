package com.sb.mapper;

import com.sb.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from user_login where id=#{id}")
    public User findIdInfo(Integer id);
}
