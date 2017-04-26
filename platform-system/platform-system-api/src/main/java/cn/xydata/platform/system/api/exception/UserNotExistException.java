package cn.xydata.platform.system.api.exception;

import cn.xydata.platform.system.api.exception.base.BusinessException;

/**
 *
 * 异常：用户不存在
 *
 * Created by kaiqian on 2017/4/26.
 */
public class UserNotExistException extends BusinessException {

    public UserNotExistException(String message) {
        super(message);
    }

}
