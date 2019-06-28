package com.vigorous.common.mapper;

import com.vigorous.common.model.ItemEtd;
import com.vigorous.common.model.ItemEtdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemEtdMapper {
    long countByExample(ItemEtdExample example);

    int deleteByExample(ItemEtdExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ItemEtd record);

    int insertSelective(ItemEtd record);

    List<ItemEtd> selectByExample(ItemEtdExample example);

    ItemEtd selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ItemEtd record, @Param("example") ItemEtdExample example);

    int updateByExample(@Param("record") ItemEtd record, @Param("example") ItemEtdExample example);

    int updateByPrimaryKeySelective(ItemEtd record);

    int updateByPrimaryKey(ItemEtd record);
}