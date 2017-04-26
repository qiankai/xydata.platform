package cn.xydata.platform.admin.web.common.config;

import cn.xydata.platform.common.web.config.AbstractWebSecurityConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

/**
 * Created by doodle on 17-4-26.
 */
@Configuration
public class WebSecurityConfig extends AbstractWebSecurityConfig {


    protected void configure(HttpSecurity security) throws Exception {
        security
                .authorizeRequests()
                .antMatchers(HttpMethod.POST, "/auth/token").permitAll();
        super.configure(security);
    }

}
