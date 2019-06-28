package com.vigorous.common.mapper;

import com.vigorous.common.model.ItemSku;
import com.vigorous.common.model.ItemSkuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemSkuMapper {
    long countByExample(ItemSkuExample example);

    int deleteByExample(ItemSkuExample example);

    int deleteByPrimaryKey(Long uniquecode);

    int insert(ItemSku record);

    int insertSelective(ItemSku record);

    List<ItemSku> selectByExample(ItemSkuExample example);

    ItemSku selectByPrimaryKey(Long uniquecode);

    int updateByExampleSelective(@Param("record") ItemSku record, @Param("example") ItemSkuExample example);

    int updateByExample(@Param("record") ItemSku record, @Param("example") ItemSkuExample example);

    int updateByPrimaryKeySelective(ItemSku record);

    int updateByPrimaryKey(ItemSku record);
}