package com.example.upload.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.upload.entity.Weather;

/**
 * @author 学无止境~冲
 */
@Component("WeatherMapper")
public interface WeatherMapper {

    //单行导入信息
    int insertweather(Weather weather);

    //批量导入信息
    int insertbatch(List<Weather> weatherList);
}
