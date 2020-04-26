package com.duoblock.mybatisdemo.mapper.standard;

import com.duoblock.mybatisdemo.entity.po.BusFlLocRecord;
import com.duoblock.mybatisdemo.entity.po.BusFlLocRecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BusFlLocRecordMapper {
    long countByExample(BusFlLocRecordExample example);

    int deleteByExample(BusFlLocRecordExample example);

    int deleteByPrimaryKey(Integer recordId);

    int insert(BusFlLocRecord record);

    int insertSelective(BusFlLocRecord record);

    List<BusFlLocRecord> selectByExample(BusFlLocRecordExample example);

    BusFlLocRecord selectByPrimaryKey(Integer recordId);

    int updateByExampleSelective(@Param("record") BusFlLocRecord record, @Param("example") BusFlLocRecordExample example);

    int updateByExample(@Param("record") BusFlLocRecord record, @Param("example") BusFlLocRecordExample example);

    int updateByPrimaryKeySelective(BusFlLocRecord record);

    int updateByPrimaryKey(BusFlLocRecord record);
}