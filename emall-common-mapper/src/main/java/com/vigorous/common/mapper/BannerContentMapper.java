package com.vigorous.common.mapper;

import com.vigorous.common.model.BannerContent;
import com.vigorous.common.model.BannerContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BannerContentMapper {
    long countByExample(BannerContentExample example);

    int deleteByExample(BannerContentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BannerContent record);

    int insertSelective(BannerContent record);

    List<BannerContent> selectByExampleWithBLOBs(BannerContentExample example);

    List<BannerContent> selectByExample(BannerContentExample example);

    BannerContent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BannerContent record, @Param("example") BannerContentExample example);

    int updateByExampleWithBLOBs(@Param("record") BannerContent record, @Param("example") BannerContentExample example);

    int updateByExample(@Param("record") BannerContent record, @Param("example") BannerContentExample example);

    int updateByPrimaryKeySelective(BannerContent record);

    int updateByPrimaryKeyWithBLOBs(BannerContent record);

    int updateByPrimaryKey(BannerContent record);
}