package com.scs.soft.zhihu.api.controller;

import com.scs.soft.zhihu.api.common.Result;
import com.scs.soft.zhihu.api.service.RoundService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author hyj
 * 2020/1/18
 */
@RestController
@RequestMapping("/api/round")
public class RoundController {
    @Resource
    private RoundService roundService;
    @GetMapping
    public Result getRound(){
        return Result.success(roundService.selectRound());
    }
    @GetMapping(value = "/roundAll")
    public Result getRoundAll(){
        return Result.success(roundService.selectRoundAll());
    }

}
