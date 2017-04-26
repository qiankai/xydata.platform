package cn.xydata.platform.system.provider.mapper;

import cn.xydata.platform.common.service.dao.CrudDao;
import cn.xydata.platform.system.api.entity.SysRole;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 接口:角色DAO
 * Created by kaiqian on 2017/4/26.
 */
@Mapper
public interface SysRoleMapper extends CrudDao<SysRole> {
    /**
     * 查询用户角色列表
     *
     * @param userId the user id
     * @return the list
     */
    List<SysRole> findListByUserId(String userId);

    /**
     * 删除角色菜单
     *
     * @param role the role
     * @return the int
     */
    int deleteRoleMenu(SysRole role);

    /**
     * 插入角色菜单
     *
     * @param role the role
     * @return the int
     */
    int insertRoleMenu(SysRole role);
}
