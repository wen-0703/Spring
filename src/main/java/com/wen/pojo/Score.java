package com.wen.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Score implements Serializable {
    private int year;
    private String object;
    private String major;
    private int EnrollNumber;
    private String high;
    private String low;
    private String average;
}
