package com.sb.mapper;

import com.sb.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from user_login where id=#{id}")
    public User findIdInfo(Integer id);

    @Insert("insert into user_login (uname,upsd) values(#{user.uname},#{user.upsd})")
    public int addInfo(@Param("user") User user);

    @Select("select * from user_login")
    public List<User> allSelect();

}
