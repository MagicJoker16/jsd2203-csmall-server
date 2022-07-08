package cn.tedu.csmall.server.ex.handler;

import cn.tedu.csmall.server.ex.ServiceException;
import cn.tedu.csmall.server.web.JsonResult;
import cn.tedu.csmall.server.web.ServiceCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandLer {


    @ExceptionHandler
    public JsonResult handleServiceException(ServiceException e) {
        log.error("统一ServiceException处理异常，将向客户端响应：{}", e.getMessage());
       return JsonResult.fail(e);
    }

    @ExceptionHandler
    public JsonResult handleThrowable(Throwable e) {
        log.error("统一处理未明确处理的异常【{}】，将向客户端响应：{}", e.getClass().getName(), e.getMessage());
        String message = "服务器忙，请联系管理员！";
        return JsonResult.fail(ServiceCode.ERR_UNKNOWN, message);
    }
}