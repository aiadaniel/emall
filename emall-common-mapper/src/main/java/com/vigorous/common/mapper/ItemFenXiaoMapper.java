package com.vigorous.common.mapper;

import com.vigorous.common.model.ItemFenXiao;
import com.vigorous.common.model.ItemFenXiaoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemFenXiaoMapper {
    long countByExample(ItemFenXiaoExample example);

    int deleteByExample(ItemFenXiaoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ItemFenXiao record);

    int insertSelective(ItemFenXiao record);

    List<ItemFenXiao> selectByExample(ItemFenXiaoExample example);

    ItemFenXiao selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ItemFenXiao record, @Param("example") ItemFenXiaoExample example);

    int updateByExample(@Param("record") ItemFenXiao record, @Param("example") ItemFenXiaoExample example);

    int updateByPrimaryKeySelective(ItemFenXiao record);

    int updateByPrimaryKey(ItemFenXiao record);
}