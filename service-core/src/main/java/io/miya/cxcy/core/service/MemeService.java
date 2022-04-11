package io.miya.cxcy.core.service;

import io.miya.cxcy.core.pojo.entity.Meme;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author miya
 * @since 2022-03-23
 */
public interface MemeService extends IService<Meme> {
    Meme selectByRand();
}
