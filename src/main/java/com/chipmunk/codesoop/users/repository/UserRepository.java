package com.chipmunk.codesoop.users.repository;

import com.chipmunk.codesoop.users.dto.RegisterUserDTO;
import com.chipmunk.codesoop.users.dto.User;
import com.chipmunk.codesoop.users.mapper.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    @Autowired
    private UserMapper userMapper;

    public int save(RegisterUserDTO registerUserDTO) {
        try {
            return this.userMapper.save(registerUserDTO);
        } catch(Exception e) {
            throw e;
        }
    }

    public User findById(int userId) {
        try {
            return this.userMapper.findById(userId);
        } catch(Exception e) {
            throw e;
        }
    }
}
