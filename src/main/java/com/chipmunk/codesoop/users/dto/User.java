package com.chipmunk.codesoop.users.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Getter
@Setter
@ToString
public class User {
    private int id;
    private String username;
    private String password;
    private String nickname;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
