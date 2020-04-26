package com.duoblock.mybatisdemo.service;

import com.duoblock.mybatisdemo.entity.po.BusFlLocRecord;

public interface ICommandService {
  BusFlLocRecord getRecord(Integer recordId);
}
