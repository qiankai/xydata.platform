package cn.xydata.platform.common.web.editor;

import cn.xydata.platform.common.utils.DateHelper;

import java.beans.PropertyEditorSupport;

/**
 * Created by doodle on 17-4-25.
 */
public class DateEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) {
        setValue(DateHelper.parseDate(text));
    }
}
