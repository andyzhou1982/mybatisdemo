package com.duoblock.mybatisdemo.service.impl;


import com.duoblock.mybatisdemo.entity.po.BusFlLocRecord;
import com.duoblock.mybatisdemo.mapper.standard.BusFlLocRecordMapper;
import com.duoblock.mybatisdemo.service.ICommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommandService implements ICommandService {

  @Autowired
  private BusFlLocRecordMapper mapper;

  @Override
  public BusFlLocRecord getRecord(Integer recordId){
    BusFlLocRecord record = mapper.selectByPrimaryKey(recordId);
    return record;
  }
}
