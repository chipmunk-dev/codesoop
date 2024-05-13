package com.chipmunk.codesoop.users.service;

import com.chipmunk.codesoop.users.dto.RegisterUserDTO;
import com.chipmunk.codesoop.users.dto.ResponseUserDTO;
import com.chipmunk.codesoop.users.dto.User;
import com.chipmunk.codesoop.users.mapper.UserDtoMapper;
import com.chipmunk.codesoop.users.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserDtoMapper userDtoMapper;

    public ResponseUserDTO register(RegisterUserDTO registerUserDTO) {
        try {
            this.userRepository.save(registerUserDTO);
            User user = this.userRepository.findById(registerUserDTO.getId());
            ResponseUserDTO dto = this.userDtoMapper.userToResponseUserDto(user);

            return dto;
        } catch(Exception e) {
            throw e;
        }
    }
}
