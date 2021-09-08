package com.cxf.mybatisdemo.dao;

import com.cxf.mybatisdemo.model.User;

import java.util.List;

public interface UserMapper {
    List<User> selectUser();
}
