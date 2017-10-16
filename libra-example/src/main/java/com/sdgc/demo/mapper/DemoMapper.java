package com.sdgc.demo.mapper;

import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by titengjiang on 2017/9/8.
 */
public interface DemoMapper {
    @Select("select * from prd_bom")
    List<Object> getAll();

}
