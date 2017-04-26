package cn.xydata.platform.admin.web.controller;

import cn.xydata.platform.admin.web.common.controller.BaseController;
import cn.xydata.platform.common.api.Paging;
import cn.xydata.platform.common.upload.util.FileManager;
import cn.xydata.platform.system.api.entity.TripUser;
import cn.xydata.platform.system.api.service.ITripUserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by doodle on 17-4-26.
 */
@Validated
@RestController
@RequestMapping("/trip/user")
public class TripUserController extends BaseController{

    /**
     * 用户服务
     */
    @Autowired
    private ITripUserService tripUserService;
    /**
     * 文件管理
     */
    @Autowired
    private FileManager fileManager;

    /**
     * List page info.
     *
     * @param page  the page
     * @param query the query
     * @return the page info
     */
    @PreAuthorize("hasAuthority('trip:user:view')")
    @GetMapping(value = "/list")
    public PageInfo<TripUser> list(Paging page, @RequestParam Map<String, Object> query) {
        return tripUserService.queryPage(page, query);
    }

    /**
     * Get trip user.
     *
     * @param id the id
     * @return the trip user
     */
    @PreAuthorize("hasAuthority('trip:user:view')")
    @GetMapping(value = "/{id}")
    public TripUser get(@PathVariable("id") String id) {
        TripUser user = tripUserService.get(id);
        user.setPhoto(fileManager.getFileUrlByRealPath(user.getPhoto()));

        return user;
    }

}
