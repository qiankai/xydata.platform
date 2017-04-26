package cn.xydata.platform.system.api.exception;

import cn.xydata.platform.system.api.exception.base.BusinessException;

/**
 *
 * 异常: 手机号码不合法
 *
 * Created by kaiqian on 2017/4/26.
 */
public class IllegalMobileException extends BusinessException {

    public IllegalMobileException(String message) {
        super(message);
    }

}
