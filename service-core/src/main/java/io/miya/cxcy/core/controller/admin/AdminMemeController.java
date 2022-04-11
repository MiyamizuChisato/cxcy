package io.miya.cxcy.core.controller.admin;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.miya.cxcy.common.result.R;
import io.miya.cxcy.core.pojo.entity.Meme;
import io.miya.cxcy.core.service.MemeService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Miyam
 */
@RestController
@RequestMapping("admin/core/meme")
public class AdminMemeController {
    @Resource
    private MemeService memeService;
    @Value("${mybatis-plus.page.size}")
    private Integer size;

    @GetMapping("/list/{current}")
    public R listByPage(@PathVariable Long current) {
        Page<Meme> memePage = new Page<>(current, size);
        memeService.page(memePage);
        return R.ok().message("获取列表成功").data("page", memePage);
    }

    @DeleteMapping("/delete/{id}")
    public R deleteById(@PathVariable Long id) {
        boolean result = memeService.removeById(id);
        if (result) {
            return R.ok().message("删除成功");
        }
        return R.error().message("删除失败");
    }

    @PostMapping("/save")
    public R save(@RequestBody Meme meme) {
        boolean result = memeService.save(meme);
        if (result) {
            return R.ok().message("新增成功");
        }
        return R.error().message("新增失败");
    }

    @PutMapping("/save")
    public R Update(@RequestBody Meme meme) {
        boolean result = memeService.updateById(meme);
        if (result) {
            return R.ok().message("修改成功");
        }
        return R.error().message("修改失败");
    }

    @GetMapping("/get/{id}")
    public R getById(@PathVariable Long id) {
        Meme meme = memeService.getById(id);
        if (meme != null) {
            return R.ok().data("record", meme);
        }
        return R.error().message("数据获取失败");
    }
}
