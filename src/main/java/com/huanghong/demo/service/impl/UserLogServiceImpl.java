package com.huanghong.demo.service.impl;

import com.huanghong.demo.entity.UserLog;
import com.huanghong.demo.mapper.UserLogMapper;
import com.huanghong.demo.service.UserLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserLogServiceImpl implements UserLogService {


    @Autowired
    private UserLogMapper userLogMapper;

    @Override
    public void addOrUpdate(UserLog userLog) {

        userLogMapper.insertSelective(userLog);
    }

    @Override
    public List<UserLog> getByUserName(String userName){

        Example example = new Example(UserLog.class);

        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userName", userName);

        return userLogMapper.selectByExample(example);

    }

}
