package cn.xydata.platform.system.api.exception;

import cn.xydata.platform.system.api.exception.base.BusinessException;

/**
 *
 * 异常： 用户已存在
 *
 * Created by kaiqian on 2017/4/26.
 */
public class UserExistException extends BusinessException {

    public UserExistException(String message) {
        super(message);
    }
}
