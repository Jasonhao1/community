package com.nowcode.community.util;

import com.nowcode.community.entity.User;
import org.springframework.stereotype.Component;

/**
 * Created by Intellij IDEA.
 * User:  haose
 * Date:  2022/05/13
 */

/**
 * 持有用户信息，用于代替session对象
 */
@Component
public class HostHolder {

    private ThreadLocal<User> users = new ThreadLocal<>();

    public void setUser(User user){
        users.set(user);
    }

    public User getUser(){
        return users.get();
    }

    public void clear(){
        users.remove();
    }

}
