//定义基础异常接口
package com.lihecen.framework.common.exception;

public interface BaseExceptionInterface {
    //获取异常码
    String getErrorCode();

    //获取异常信息
    String getErrorMessage();
}
