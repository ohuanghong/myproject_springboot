package com.huanghong.demo.service.impl;

import com.huanghong.demo.entity.UserLog;
import com.huanghong.demo.mapper.UserLogMapper;
import com.huanghong.demo.service.UserLogService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserLogServiceImplTest {


    @Autowired
    private UserLogService userLogService;

    @Test
    void addOrUpdate() {

        UserLog userLog = new UserLog();
        userLog.setUserName("测试人员");
        userLog.setMethod("GET");
        userLog.setOperation("CREATE");
        userLog.setIp("127.0.0.1");

        userLog.setParams("{\"name\": \"测试的人员\"}");
        userLog.setTime(10000L);

        userLogService.addOrUpdate(userLog);
    }

    @Test
    void getByUserName() {

        userLogService.getByUserName("测试人员");
    }

}