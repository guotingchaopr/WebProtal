package com.webProtal.org.dao;

import java.util.List;

import com.webProtal.org.model.Columns;

public interface ColumnsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Columns record);

    int insertSelective(Columns record);

    Columns selectByPrimaryKey(Integer id);
    
    List<Columns> queryAll();

    int updateByPrimaryKeySelective(Columns record);

    int updateByPrimaryKey(Columns record);
}