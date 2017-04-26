package cn.xydata.platform.system.api.exception;

import cn.xydata.platform.system.api.exception.base.BusinessException;

/**
 *
 * 异常：短信发送频繁
 *
 * Created by kaiqian on 2017/4/26.
 */
public class SmsTooMuchException extends BusinessException {

    public SmsTooMuchException(String message) {
        super(message);
    }
}
