package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.entity.Round;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * 查询发现页中的圆桌效果
 * 2020/1/18
 */
public interface RoundMapper {
    /**
     * 查询发现页中的圆桌效果
     * @return list<Round></>
     */
    @Select("SELECT * FROM  t_round_table LIMIT 0,4")
    List<Round> selectRound();

    /**
     * 查询发现页所有数据
     * @return list
     */
    @Select("SELECT * FROM t_round_table")
    List<Map> selectRoundAll();
}
