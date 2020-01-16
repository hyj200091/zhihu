package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.entity.Section;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author hyj
 * 2020/1/25
 */
public interface SectionMapper   {
    /**
     * 根据专题id来查询标签列表
     * @param specialId
     * @return list<Section></>
     */
    @Select("SELECT * FROM t_section WHERE special_id = #{specialId} ")
    List<Section> getSectionsBySpecialId(String specialId);
}
