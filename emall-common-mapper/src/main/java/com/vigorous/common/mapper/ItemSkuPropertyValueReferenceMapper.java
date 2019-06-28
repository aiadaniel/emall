package com.vigorous.common.mapper;

import com.vigorous.common.model.ItemSkuPropertyValueReference;
import com.vigorous.common.model.ItemSkuPropertyValueReferenceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemSkuPropertyValueReferenceMapper {
    long countByExample(ItemSkuPropertyValueReferenceExample example);

    int deleteByExample(ItemSkuPropertyValueReferenceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ItemSkuPropertyValueReference record);

    int insertSelective(ItemSkuPropertyValueReference record);

    List<ItemSkuPropertyValueReference> selectByExample(ItemSkuPropertyValueReferenceExample example);

    ItemSkuPropertyValueReference selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ItemSkuPropertyValueReference record, @Param("example") ItemSkuPropertyValueReferenceExample example);

    int updateByExample(@Param("record") ItemSkuPropertyValueReference record, @Param("example") ItemSkuPropertyValueReferenceExample example);

    int updateByPrimaryKeySelective(ItemSkuPropertyValueReference record);

    int updateByPrimaryKey(ItemSkuPropertyValueReference record);
}