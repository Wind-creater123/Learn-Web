package org.example.mapper;

import org.apache.ibatis.annotations.*;
import org.example.entity.User;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from emp")
    List<User> findAll();

    @Delete("DELETE FROM emp WHERE id=#{id}")
    int deleteById(Integer id);

//    @Insert("INSERT INTO emp (username,password,name) values (#{username},#{password},#{name})")
//    int insert(User user);

    @Update("UPDATE emp set username=#{username},password=#{password},name=#{name} WHERE id=#{id}")
    int update(User user);

    @Select("SELECT * FROM emp WHERE username='#{username}' AND password='#{password}'")
    List<User> findByUsernameAndPassword(@Param("username") String username,@Param("password") String password);

    List<User> findByUsername(@Param("username") String username);
}
