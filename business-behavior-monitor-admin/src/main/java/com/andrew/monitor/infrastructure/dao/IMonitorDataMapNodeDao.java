package com.andrew.monitor.infrastructure.dao;

import com.andrew.monitor.infrastructure.po.MonitorDataMapNode;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface IMonitorDataMapNodeDao {
    List<MonitorDataMapNode> queryMonitoryDataMapNodeList(MonitorDataMapNode monitorDataMapNodeReq);

    List<MonitorDataMapNode> queryMonitorNodeConfigByMonitorId(String monitorId);

    void updateNodeConfig(MonitorDataMapNode monitorDataMapNodeReq);

}
