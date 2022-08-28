package com.wen.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.wen.pojo.Score;
import com.wen.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ScoreController {
    @Autowired
    private ScoreService scoreService;
    @ResponseBody
    @RequestMapping("/findAsQuery.do")
    public List<Score> findAsQuery(Integer year,String major) {
        return scoreService.findAsQuery(year,major) ;
    }

    @ResponseBody
    @RequestMapping("/findAll.do")
    public List<Score> findAll() {
        return scoreService.findAll() ;
    }
}
