package io.miya.cxcy.core.service.impl;

import io.miya.cxcy.core.pojo.entity.Meme;
import io.miya.cxcy.core.mapper.MemeMapper;
import io.miya.cxcy.core.service.MemeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author miya
 * @since 2022-03-23
 */
@Service
public class MemeServiceImpl extends ServiceImpl<MemeMapper, Meme> implements MemeService {
    @Resource
    private MemeMapper memeMapper;

    @Override
    public Meme selectByRand() {
        return memeMapper.getByRand();
    }
}
