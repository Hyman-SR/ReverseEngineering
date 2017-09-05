package com.hyman.mapper;

import com.hyman.pojo.HymanUser;
import com.hyman.pojo.HymanUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HymanUserMapper {
    long countByExample(HymanUserExample example);

    int deleteByExample(HymanUserExample example);

    int insert(HymanUser record);

    int insertSelective(HymanUser record);

    List<HymanUser> selectByExample(HymanUserExample example);

    int updateByExampleSelective(@Param("record") HymanUser record, @Param("example") HymanUserExample example);

    int updateByExample(@Param("record") HymanUser record, @Param("example") HymanUserExample example);
}