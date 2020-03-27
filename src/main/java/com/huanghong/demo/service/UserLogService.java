package com.huanghong.demo.service;

import com.huanghong.demo.entity.UserLog;

import java.util.List;

public interface UserLogService {
    void addOrUpdate(UserLog userLog);

    List<UserLog> getByUserName(String userName);
}
