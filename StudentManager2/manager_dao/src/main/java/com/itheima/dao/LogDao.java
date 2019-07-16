package com.itheima.dao;

import com.itheima.domain.Log;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author weliu
 */
public interface LogDao {
    @Insert("insert into t_log values (null,#{name},#{time},#{url},#{cost})")
    void save(Log log);


    @Select({"<script>",
            "select * from t_log",
            "<where>",
                "<foreach item='id' collection='array' open='id in (' close=')' separator=','>",
                    "#{id}",
                "</foreach>",
            "</where>",
            "</script>"})

    List<Log> findById(Integer[] id);
}
