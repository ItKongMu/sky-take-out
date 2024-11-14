package com.sky.service;

import com.sky.vo.TurnoverReportVO;

import java.time.LocalDate;

public interface ReportService {

    /**
     * 获取营业额统计数据
     * @return
     */
    TurnoverReportVO getTurnoverStatistics(LocalDate begin, LocalDate end);

    TurnoverReportVO getTurnoverStatisticsDemo(LocalDate begin, LocalDate end);

}
