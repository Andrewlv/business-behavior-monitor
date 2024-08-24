package com.andrew.monitor.infrastructure.dao;

import com.andrew.monitor.infrastructure.po.MonitorDataMap;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface IMonitorDataMapDao {
    String queryMonitorNameByMonitoryId(String monitorId);

    List<MonitorDataMap> queryMonitorDataMapEntityList();

}
