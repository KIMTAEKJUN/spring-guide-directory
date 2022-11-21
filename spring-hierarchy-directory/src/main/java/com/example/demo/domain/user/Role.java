package com.example.demo.domain.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {
    USER1("ROLE_USER", "일반 유저"),
    USER2("ROLE_ADMIN", "관리자");

    private final String key;
    private final String title;
}
