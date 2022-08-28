package com.wen.mapper;

import com.wen.pojo.Score;

import java.util.List;

public interface ScoreMapper {
    public List<Score> findAsQuery(int year,String major);

    public List<Score> findAll();
}
