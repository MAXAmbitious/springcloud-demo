package com.ben.common.mapper;

import tk.mybatis.mapper.additional.idlist.IdListMapper;
import tk.mybatis.mapper.additional.insert.InsertListMapper;
import tk.mybatis.mapper.common.Mapper;

@tk.mybatis.mapper.annotation.RegisterMapper
public interface CommonMapper<T, Number> extends IdListMapper<T, Number>, InsertListMapper<T> {
}
