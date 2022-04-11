package io.miya.cxcy.core.controller;


import io.miya.cxcy.common.result.R;
import io.miya.cxcy.core.pojo.entity.Meme;
import io.miya.cxcy.core.service.MemeService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author miya
 * @since 2022-03-23
 */
@RestController
@RequestMapping("api/core/meme")
public class MemeController {
    @Resource
    public MemeService service;

    @GetMapping("/get/rand")
    public R getByRand() {
        Meme meme = service.selectByRand();
        return R.ok().data("record", meme);
    }
}

