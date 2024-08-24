package com.andrew.monitor.infrastructure.dao;

import com.andrew.monitor.infrastructure.po.MonitorDataMapNodeLink;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface IMonitorDataMapNodeLinkDao {

    List<MonitorDataMapNodeLink> queryMonitorNodeLinkConfigByMonitorId(String monitorId);

    void deleteLinkFromByMonitorId(String monitorId);

    void insert(MonitorDataMapNodeLink monitorDataMapNodeLinkReq);

}
