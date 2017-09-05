package com.hyman.mapper;

import com.hyman.pojo.HymanArticle;
import com.hyman.pojo.HymanArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HymanArticleMapper {
    long countByExample(HymanArticleExample example);

    int deleteByExample(HymanArticleExample example);

    int insert(HymanArticle record);

    int insertSelective(HymanArticle record);

    List<HymanArticle> selectByExampleWithBLOBs(HymanArticleExample example);

    List<HymanArticle> selectByExample(HymanArticleExample example);

    int updateByExampleSelective(@Param("record") HymanArticle record, @Param("example") HymanArticleExample example);

    int updateByExampleWithBLOBs(@Param("record") HymanArticle record, @Param("example") HymanArticleExample example);

    int updateByExample(@Param("record") HymanArticle record, @Param("example") HymanArticleExample example);
}