package io.miya.cxcy.common.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

/**
 * @author Miyam
 */
@Getter
@ToString
@AllArgsConstructor
public enum ResponseEnum {
    SUCCESS(0, "成功"),
    BAD_SQL_GRAMMAR_ERROR(-101, "SQL 语法错误"),
    SERVLET_ERROR(-102, "Servlet 错误"),
    ERROR(-1, "服务器内错误");

    private Integer code;
    private String message;
}
