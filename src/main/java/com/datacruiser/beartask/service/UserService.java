package com.datacruiser.beartask.service;

import com.datacruiser.beartask.entity.User;

public interface UserService extends BaseService<User> {

    void add(User user) throws Exception;
   // void User login(User user) throws Exception;
    /**
     * @param user
     * @return
     */
    User findUser(User user) throws Exception;

    void update(User user) throws Exception;

    void del(User user) throws Exception;
}
