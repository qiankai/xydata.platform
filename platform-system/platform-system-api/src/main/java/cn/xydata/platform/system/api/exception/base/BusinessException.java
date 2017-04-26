package cn.xydata.platform.system.api.exception.base;

/**
 *
 * 业务异常
 *
 * Created by kaiqian on 2017/4/26.
 */
public class BusinessException extends Exception {

    public BusinessException() {
        super();
    }

    public BusinessException(String message) {
        super(message);
    }
}
