package cn.xydata.platform.system.api.exception;

import cn.xydata.platform.system.api.exception.base.BusinessException;

/**
 *
 * 异常：无效验证码
 *
 * Created by kaiqian on 2017/4/26.
 */
public class InvalidCaptchaException extends BusinessException {

    public InvalidCaptchaException(String message) {
        super(message);
    }

}
