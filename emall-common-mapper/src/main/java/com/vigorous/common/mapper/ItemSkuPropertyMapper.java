package com.vigorous.common.mapper;

import com.vigorous.common.model.ItemSkuProperty;
import com.vigorous.common.model.ItemSkuPropertyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemSkuPropertyMapper {
    long countByExample(ItemSkuPropertyExample example);

    int deleteByExample(ItemSkuPropertyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ItemSkuProperty record);

    int insertSelective(ItemSkuProperty record);

    List<ItemSkuProperty> selectByExample(ItemSkuPropertyExample example);

    ItemSkuProperty selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ItemSkuProperty record, @Param("example") ItemSkuPropertyExample example);

    int updateByExample(@Param("record") ItemSkuProperty record, @Param("example") ItemSkuPropertyExample example);

    int updateByPrimaryKeySelective(ItemSkuProperty record);

    int updateByPrimaryKey(ItemSkuProperty record);
}