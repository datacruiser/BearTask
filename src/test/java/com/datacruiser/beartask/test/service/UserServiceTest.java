package com.datacruiser.beartask.test.service;

import com.datacruiser.beartask.entity.User;
import com.datacruiser.beartask.exception.OtherThingsException;
import com.datacruiser.beartask.service.UserService;
import com.datacruiser.beartask.test.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceTest extends BaseTest {
    @Autowired
    private UserService userService;

    @Test
    public void testAdd() {
        User user = new User();
        try {
            userService.add(user);
        } catch (OtherThingsException e) {
            //其他综合异常或是不能处理的异常
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testDel() {
        User user = new User();
        try {
            userService.del(user);
        } catch (OtherThingsException e) {
            //其他综合异常或是不能处理的异常
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testUpdate() {
        User user = new User();
        try {
            userService.update(user);
        } catch (OtherThingsException e) {
            //其他综合异常或是不能处理的异常
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
