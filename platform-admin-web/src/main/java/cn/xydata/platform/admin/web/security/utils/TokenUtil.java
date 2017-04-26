package cn.xydata.platform.admin.web.security.utils;

import cn.xydata.platform.admin.web.security.model.AuthUser;
import cn.xydata.platform.common.web.security.AbstractTokenUtil;
import com.google.gson.Gson;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

/**
 *
 * The type Token util.
 *
 * Created by doodle on 17-4-26.
 */
@Component
@ConfigurationProperties("security.jwt")
public class TokenUtil extends AbstractTokenUtil {
    @Override
    public UserDetails getUserDetails(String token) {
        String userDetailsString = getUserDetailsString(token);
        if (userDetailsString != null) {
            return new Gson().fromJson(userDetailsString, AuthUser.class);
        }
        return null;
    }
}
