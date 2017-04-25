package cn.xydata.platform.common.upload;

import cn.xydata.platform.common.utils.FileHelper;
import cn.xydata.platform.common.utils.StringHelper;

/**
 *
 * 文件处理器
 *
 * Created by doodle on 17-4-25.
 */
public abstract class AbstractFileOperator implements FileOperator{
    /**
     * 文件服务器地址
     */
    private String accessUrl;

    public AbstractFileOperator() {
    }

    public AbstractFileOperator(String accessUrl) {
        this.accessUrl = accessUrl;
    }

    @Override
    public String getFileUrl(String realPath) {
        if (StringHelper.isEmpty(accessUrl)) {
            throw new NullPointerException("文件服务器访问地址为空.");
        }
        return StringHelper.isEmpty(realPath) ? "" : FileHelper.addEndSlash(accessUrl) + realPath;
    }

    public String getAccessUrl() {
        return accessUrl;
    }

    public void setAccessUrl(String accessUrl) {
        this.accessUrl = accessUrl;
    }
}
