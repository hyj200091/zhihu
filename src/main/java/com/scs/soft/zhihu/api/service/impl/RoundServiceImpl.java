package com.scs.soft.zhihu.api.service.impl;

import com.scs.soft.zhihu.api.entity.Round;
import com.scs.soft.zhihu.api.mapper.RoundMapper;
import com.scs.soft.zhihu.api.service.RoundService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author hyj
 * 2020/1/18
 */
@Service
public class RoundServiceImpl implements RoundService {
    @Resource
    private RoundMapper roundMapper;
    @Override
    public List<Round> selectRound() {
        return roundMapper.selectRound();
    }

    @Override
    public List<Map> selectRoundAll() {
        return roundMapper.selectRoundAll();
    }
}
