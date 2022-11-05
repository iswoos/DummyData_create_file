package com.example.orderinformation.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
public enum ErrorCode {

    //하단 : 에러코드 작성예시

    // 400 BAD_REQUEST 잘못된 요청
    BAD_PARAMETER(400, HttpStatus.BAD_REQUEST, "비밀번호가 일치하지 않습니다."),

    //500 INTERNAL SERVER ERROR
    INTERNAL_SERVER_ERROR(500, HttpStatus.INTERNAL_SERVER_ERROR, "서버 에러입니다.");

    private final int status;
    private final HttpStatus httpStatus;
    private final String message;
}
