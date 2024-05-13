package com.chipmunk.codesoop.users.mapper;

import com.chipmunk.codesoop.users.dto.ResponseUserDTO;
import com.chipmunk.codesoop.users.dto.User;
import org.springframework.stereotype.Component;

@Component
public class UserDtoMapper {
    public ResponseUserDTO userToResponseUserDto(User user) {
        ResponseUserDTO dto = new ResponseUserDTO();
        dto.setId(user.getId());
        dto.setUsername(user.getUsername());
        dto.setNickname(user.getNickname());
        dto.setCreatedAt(user.getCreatedAt());
        dto.setUpdatedAt(user.getUpdatedAt());

        return dto;
    }
}
