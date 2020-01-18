package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.ZhihuApiApplication;
import com.scs.soft.zhihu.api.entity.Round;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


@SpringBootTest(classes = ZhihuApiApplication.class)
class RoundMapperTest {
@Resource
private RoundMapper roundMapper;
    @Test
    void selectRound() {
        List<Round> selectRound = roundMapper.selectRound();
        selectRound.forEach(System.out::print);
    }

    @Test
    void selectRoundAll() {
        List<Map> selectRoundAll  = roundMapper.selectRoundAll();
        selectRoundAll.forEach(System.out::print);
    }
}