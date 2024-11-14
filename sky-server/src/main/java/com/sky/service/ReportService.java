package com.sky.service;

import com.sky.vo.TurnoverReportVO;
import com.sky.vo.UserReportVO;

import java.time.LocalDate;

public interface ReportService {

    /**
     * 获取指定区间内的营业额统计数据
     * @return
     */
    TurnoverReportVO getTurnoverStatistics(LocalDate begin, LocalDate end);

    TurnoverReportVO getTurnoverStatisticsDemo(LocalDate begin, LocalDate end);

    /**
     * 获取指定区间内的用户统计数据
     * @return
     */
    UserReportVO getUserStatistics(LocalDate begin, LocalDate end);
}