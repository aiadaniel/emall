package com.vigorous.common.mapper;

import com.vigorous.common.model.ItemContent;
import com.vigorous.common.model.ItemContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemContentMapper {
    long countByExample(ItemContentExample example);

    int deleteByExample(ItemContentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ItemContent record);

    int insertSelective(ItemContent record);

    List<ItemContent> selectByExampleWithBLOBs(ItemContentExample example);

    List<ItemContent> selectByExample(ItemContentExample example);

    ItemContent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ItemContent record, @Param("example") ItemContentExample example);

    int updateByExampleWithBLOBs(@Param("record") ItemContent record, @Param("example") ItemContentExample example);

    int updateByExample(@Param("record") ItemContent record, @Param("example") ItemContentExample example);

    int updateByPrimaryKeySelective(ItemContent record);

    int updateByPrimaryKeyWithBLOBs(ItemContent record);

    int updateByPrimaryKey(ItemContent record);
}