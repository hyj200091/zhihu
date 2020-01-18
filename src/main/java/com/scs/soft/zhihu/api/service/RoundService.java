package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.Round;

import java.util.List;
import java.util.Map;

/**
 * @author hyj
 * 2020/1/18
 */
public interface RoundService {
    /**
     * 查询发现页的圆桌效果
     * @return list
     */
    List<Round>selectRound();

    /**
     * 查询发现页中所有数据
     * @return list
     */
    List<Map> selectRoundAll();
}
