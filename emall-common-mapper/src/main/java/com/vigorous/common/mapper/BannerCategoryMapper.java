package com.vigorous.common.mapper;

import com.vigorous.common.model.BannerCategory;
import com.vigorous.common.model.BannerCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BannerCategoryMapper {
    long countByExample(BannerCategoryExample example);

    int deleteByExample(BannerCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BannerCategory record);

    int insertSelective(BannerCategory record);

    List<BannerCategory> selectByExample(BannerCategoryExample example);

    BannerCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BannerCategory record, @Param("example") BannerCategoryExample example);

    int updateByExample(@Param("record") BannerCategory record, @Param("example") BannerCategoryExample example);

    int updateByPrimaryKeySelective(BannerCategory record);

    int updateByPrimaryKey(BannerCategory record);
}