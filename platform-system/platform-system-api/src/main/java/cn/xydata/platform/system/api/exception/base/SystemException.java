package cn.xydata.platform.system.api.exception.base;

/**
 *
 * 系统业务异常
 *
 * Created by kaiqian on 2017/4/26.
 */
public class SystemException extends RuntimeException {

    public SystemException() {
        super();
    }

    public SystemException(String message) {
        super(message);
    }

    public SystemException(Throwable cause) {
        super(cause);
    }

    public SystemException(String message, Throwable cause) {
        super(message, cause);
    }

}
