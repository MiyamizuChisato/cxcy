package exception;

import io.miya.cxcy.common.result.ResponseEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

/**
 * @author Miyam
 */
@Slf4j
public class Assert {
    /**
     * 断言对象不为空
     *
     * @param object       为空抛出异常
     * @param responseEnum 返回枚举对象
     */
    public static void notNull(Object object, ResponseEnum responseEnum) {
        if (object == null) {
            log.info("object is null -----------");
            throw new BusinessException(responseEnum);
        }
    }

    public static void isNull(Object object, ResponseEnum responseEnum) {
        if (object != null) {
            log.info("object is not null -----------");
            throw new BusinessException(responseEnum);
        }
    }

    public static void isTrue(boolean expression, ResponseEnum responseEnum) {
        if (expression) {
            log.info("fail -----------");
            throw new BusinessException(responseEnum);
        }
    }

    public static void notEquals(Object o1, Object o2, ResponseEnum responseEnum) {
        if (o1.equals(o2)) {
            log.info("equals -----------");
            throw new BusinessException(responseEnum);
        }
    }

    public static void equals(Object o1, Object o2, ResponseEnum responseEnum) {
        if (o1.equals(o2)) {
            log.info("equals -----------");
            throw new BusinessException(responseEnum);
        }
    }

    public static void notEmpty(String str, ResponseEnum responseEnum) {
        if (StringUtils.isEmpty(str)) {
            log.info("is empty -----------");
            throw new BusinessException(responseEnum);
        }
    }

}
