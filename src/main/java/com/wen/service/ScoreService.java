package com.wen.service;


import com.wen.pojo.Score;

import java.util.List;

public interface ScoreService {
    public List<Score> findAsQuery(int year, String major);

    public List<Score> findAll();
}
