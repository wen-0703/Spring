package com.wen.service.impl;

import com.wen.mapper.ScoreMapper;
import com.wen.pojo.Score;
import com.wen.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ScoreServiceImpl implements ScoreService {
    @Autowired
    private ScoreMapper scoreMapper;

    @Override
    public List<Score> findAll() {
        return scoreMapper.findAll();
    }
    @Override
    public List<Score> findAsQuery(int year, String major) {
        return scoreMapper.findAsQuery(year,major);
    }
}
