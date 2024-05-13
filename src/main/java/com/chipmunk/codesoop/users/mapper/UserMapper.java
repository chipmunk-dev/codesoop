package com.chipmunk.codesoop.users.mapper;

import com.chipmunk.codesoop.users.dto.RegisterUserDTO;
import com.chipmunk.codesoop.users.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Insert("INSERT INTO users(username, password, nickname) VALUES (#{username}, #{password}, #{nickname})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int save(RegisterUserDTO registerUserDTO);

    @Select("SELECT * FROM users WHERE id = #{userId}")
    User findById(int userId);
}