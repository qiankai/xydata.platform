package cn.xydata.platform.common.utils;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * HashMap对象的一个扩展.
 *
 * Created by doodle on 17-4-25.
 */
public class BaseDto extends HashMap<String,Object> implements Dto {

    private static final long serialVersionUID = 1L;

    public BaseDto() {
        super();
    }

    public BaseDto(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
    }

    public BaseDto(int initialCapacity) {
        super(initialCapacity);
    }

    public BaseDto(Map<String, Object> m) {
        super(m);
    }


    @Override
    public String getString(String key) {
        return null;
    }

    @Override
    public <E> List<E> getList(String key) {
        return null;
    }

    @Override
    public int getInt(String key) {
        return 0;
    }

    @Override
    public long getLong(String key) {
        return 0;
    }

    @Override
    public double getDouble(String key) {
        return 0;
    }

    @Override
    public BigDecimal getDecimal(String key) {
        return null;
    }

    @Override
    public Date getDate(String key) {
        return null;
    }
}
