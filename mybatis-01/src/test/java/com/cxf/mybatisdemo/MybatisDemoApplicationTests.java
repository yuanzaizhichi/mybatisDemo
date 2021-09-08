package com.cxf.mybatisdemo;


import com.cxf.mybatisdemo.dao.UserMapper;
import com.cxf.mybatisdemo.model.User;
import com.cxf.mybatisdemo.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MybatisDemoApplicationTests {

    @Test
    public void contextLoads() {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> userList = mapper.selectUser();

        for (User user : userList) {
            System.out.println(user);
        }

        session.close();

    }

}
