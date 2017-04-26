package cn.xydata.platform.system.provider.mapper;

import cn.xydata.platform.common.service.dao.CrudDao;
import cn.xydata.platform.system.api.entity.SysUser;

/**
 * 接口:用户DAO
 *
 * Created by kaiqian on 2017/4/26.
 */
public interface SysUserMapper extends CrudDao<SysUser> {
    /**
     * 根据登录名称查询用户
     *
     * @param loginName 登录名
     * @return SysUser by login name
     */
    SysUser getByLoginName(String loginName);

    /**
     * 更新用户密码
     *
     * @param user the user
     * @return the int
     */
    int updatePasswordById(SysUser user);

    /**
     * 删除用户角色关联数据
     *
     * @param user the user
     * @return the int
     */
    int deleteUserRole(SysUser user);

    /**
     * 插入用户角色关联数据
     *
     * @param user the user
     * @return the int
     */
    int insertUserRole(SysUser user);

    /**
     * 保存用户信息
     *
     * @param user the user
     */
    void updateInfo(SysUser user);
}
