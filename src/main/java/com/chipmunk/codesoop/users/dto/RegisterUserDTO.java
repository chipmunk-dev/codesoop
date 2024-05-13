package com.chipmunk.codesoop.users.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RegisterUserDTO {
    private int id;
    private String username;
    private String password;
    private String nickname;
}
