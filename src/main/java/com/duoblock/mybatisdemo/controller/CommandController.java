package com.duoblock.mybatisdemo.controller;

import com.duoblock.mybatisdemo.entity.po.BusFlLocRecord;
import com.duoblock.mybatisdemo.service.ICommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/command")
public class CommandController {
  @Autowired
  private ICommandService service;

  @GetMapping(value = "getRecord")
  public BusFlLocRecord getRecord(Integer id) {
    return service.getRecord(id);
  }
}
