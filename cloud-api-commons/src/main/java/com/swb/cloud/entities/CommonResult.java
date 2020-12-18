package com.swb.cloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 72774
 * @Description
 * @create 2020-12-18 11:02
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    public static final int CODE_OK =200;
    public static final String MSG_BUS_SUCCESS ="success";

    public static final int CODE_ERROR =-100;
    public static final String MSG_BUS_ERROR ="未知错误！";





    private int code;
    private String msg;
    private T   data;

    public CommonResult(int code,String msg){
        this(code,msg,null);
    }
    /**
     * 通用无数据返回
     * @return
     */
    public static CommonResult ok(){
        return  new CommonResult(CODE_OK, MSG_BUS_SUCCESS);
    }

    /**
     * 通用有数据返回
     * @return
     */
    public static<T> CommonResult  data(T data){
        return  new CommonResult(CODE_OK, MSG_BUS_SUCCESS,data);
    }

    /**
     * 通用错误返回
     * @return
     */
    public static CommonResult failed(){
        return  new CommonResult(CODE_ERROR, MSG_BUS_ERROR);
    }


}
