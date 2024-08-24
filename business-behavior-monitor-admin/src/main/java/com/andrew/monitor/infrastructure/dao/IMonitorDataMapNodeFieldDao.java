package com.andrew.monitor.infrastructure.dao;

import com.andrew.monitor.infrastructure.po.MonitorDataMapNodeField;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IMonitorDataMapNodeFieldDao {
    List<MonitorDataMapNodeField> queryMonitorDataMapNodeList(MonitorDataMapNodeField monitorDataMapNodeFieldReq);

}
