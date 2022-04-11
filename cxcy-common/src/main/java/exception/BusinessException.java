package exception;

import io.miya.cxcy.common.result.ResponseEnum;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Miyam
 */
@Data
@NoArgsConstructor
public class BusinessException extends RuntimeException {
    private Integer code;
    private String message;

    public BusinessException(String message) {
        this.setMessage(message);
    }

    public BusinessException(Integer code) {
        this.setCode(code);
    }

    public BusinessException(Integer code, String message) {
        this.setCode(code);
        this.setMessage(message);
    }

    public BusinessException(Integer code, String message, Throwable cause) {
        super(cause);
        this.setMessage(message);
        this.setCode(code);
    }

    public BusinessException(ResponseEnum responseEnum) {
        this.setCode(responseEnum.getCode());
        this.setMessage(responseEnum.getMessage());
    }

    public BusinessException(ResponseEnum responseEnum, Throwable cause) {
        super(cause);
        this.setCode(responseEnum.getCode());
        this.setMessage(responseEnum.getMessage());
    }
}
