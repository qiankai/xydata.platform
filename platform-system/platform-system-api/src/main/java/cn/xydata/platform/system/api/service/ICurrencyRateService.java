package cn.xydata.platform.system.api.service;

import java.util.Map;

/**
 *
 * 汇率接口
 *
 * Created by kaiqian on 2017/4/26.
 */
public interface ICurrencyRateService {
    /**
     * 获得当前USD->币种汇率
     *
     * @return Map rate
     */
    Map<String, String> getRate();
}
