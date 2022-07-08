package cn.tedu.csmall.server.web;

import cn.tedu.csmall.server.ex.ServiceException;
import lombok.Data;
import springfox.documentation.spring.web.json.Json;

@Data
public class JsonResult {
    private Integer code;
    private String message;

    public static JsonResult ok() {
        JsonResult jsonResult = new JsonResult();
        jsonResult.code = ServiceCode.OK;
        return jsonResult;
    }

    public static JsonResult fail(ServiceException e) {
       return fail (e.getServiceCode(), e.getMessage());
    }

    public static JsonResult fail(Integer code, String message) {
        JsonResult jsonResult = new JsonResult();
        jsonResult.code = code;
        jsonResult.message = message;
        return jsonResult;
    }
}
