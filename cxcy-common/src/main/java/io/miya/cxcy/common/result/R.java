package io.miya.cxcy.common.result;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Miyam
 */
@Data
public class R {
    private Integer code;
    private String message;
    private Map<String, Object> data = new HashMap<>();

    private R() {

    }

    public static R setResult(ResponseEnum responseEnum) {
        R r = new R();
        r.setCode(responseEnum.getCode());
        r.setMessage(responseEnum.getMessage());
        return r;
    }

    public static R ok() {
        return R.setResult(ResponseEnum.SUCCESS);
    }

    public static R error() {
        return R.setResult(ResponseEnum.ERROR);
    }

    public R data(String key, Object value) {
        this.data.put(key, value);
        return this;
    }

    public R data(Map<String, Object> map) {
        this.setData(data);
        return this;
    }

    public R message(String message) {
        this.setMessage(message);
        return this;
    }

    public R code(Integer code) {
        this.setCode(code);
        return this;
    }
}
