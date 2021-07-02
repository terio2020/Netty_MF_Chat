package com.terio.utils;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by Terto_MY on 2021/6/22 18:27
 */

public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T>{
    // FIXME 特别注意，该接口不能被扫描到，否则会出错
}
