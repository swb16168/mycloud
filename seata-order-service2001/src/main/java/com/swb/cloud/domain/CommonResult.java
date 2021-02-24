package com.swb.cloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 72774
 * @Description
 * @create 2021-02-23 15:35
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CommonResult<T> {

    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
