package com.hyman.mapper;

import com.hyman.pojo.HymanArticleCategory;
import com.hyman.pojo.HymanArticleCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HymanArticleCategoryMapper {
    long countByExample(HymanArticleCategoryExample example);

    int deleteByExample(HymanArticleCategoryExample example);

    int insert(HymanArticleCategory record);

    int insertSelective(HymanArticleCategory record);

    List<HymanArticleCategory> selectByExample(HymanArticleCategoryExample example);

    int updateByExampleSelective(@Param("record") HymanArticleCategory record, @Param("example") HymanArticleCategoryExample example);

    int updateByExample(@Param("record") HymanArticleCategory record, @Param("example") HymanArticleCategoryExample example);
}