package io.miya.cxcy.core.mapper;

import io.miya.cxcy.core.pojo.entity.Meme;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author miya
 * @since 2022-03-23
 */
public interface MemeMapper extends BaseMapper<Meme> {
    Meme getByRand();
}
