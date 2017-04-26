package cn.xydata.platform.system.provider.serviceimpl;

import cn.xydata.platform.common.service.service.CrudService;
import cn.xydata.platform.system.api.entity.TripUser;
import cn.xydata.platform.system.api.service.ITripUserService;
import cn.xydata.platform.system.provider.mapper.TripUserMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by kaiqian on 2017/4/26.
 */
@Service
@Transactional(readOnly = true)
public class TripUserService extends CrudService<TripUserMapper,TripUser> implements ITripUserService{

    @Override
    public TripUser getByMobile(String mobile) {
        return getDao().getByMobile(mobile);
    }

    @Override
    @Transactional(readOnly = false)
    public void updateInfo(TripUser tripUser) {
        tripUser.preUpdate();
        getDao().updateInfo(tripUser);
    }

    @Override
    @Transactional(readOnly = false)
    public void registryUser(String mobile, String password) {
        // 用户已存在不做处理，防止客户端重复提交
        TripUser oldUser = getByMobile(mobile);
        if (oldUser != null) {
            return;
        }

        //插入用户信息
        TripUser user = new TripUser();
        user.preInsert();
        user.setMobile(mobile);
        user.setPassword(password);
        getDao().insert(user);
    }

    @Override
    @Transactional(readOnly = false)
    public void updatePasswordByMobile(String mobile, String password) {
        getDao().updatePasswordByMobile(mobile, password);
    }

    @Override
    @Transactional(readOnly = false)
    public void updatePhotoByUserId(String userId, String photo) {
        getDao().updatePhotoByUser(userId, photo);
    }




}
