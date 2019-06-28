package com.vigorous.common.mapper;

import com.vigorous.common.model.ItemSkuPropertyKeyReference;
import com.vigorous.common.model.ItemSkuPropertyKeyReferenceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemSkuPropertyKeyReferenceMapper {
    long countByExample(ItemSkuPropertyKeyReferenceExample example);

    int deleteByExample(ItemSkuPropertyKeyReferenceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ItemSkuPropertyKeyReference record);

    int insertSelective(ItemSkuPropertyKeyReference record);

    List<ItemSkuPropertyKeyReference> selectByExample(ItemSkuPropertyKeyReferenceExample example);

    ItemSkuPropertyKeyReference selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ItemSkuPropertyKeyReference record, @Param("example") ItemSkuPropertyKeyReferenceExample example);

    int updateByExample(@Param("record") ItemSkuPropertyKeyReference record, @Param("example") ItemSkuPropertyKeyReferenceExample example);

    int updateByPrimaryKeySelective(ItemSkuPropertyKeyReference record);

    int updateByPrimaryKey(ItemSkuPropertyKeyReference record);
}