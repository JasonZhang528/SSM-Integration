package com.ITFarmerBlog.Dao;

import com.ITFarmerBlog.Entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class databaseConnTest {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = context.getBean(UserDao.class);
        List<User> users = userDao.getUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = context.getBean(UserDao.class);
        User user = new User();
        user.setUid(3);
        user.setUsername("user01");
        user.setPassword("123");
        user.setNickname("Dawn01");
        user.setPermissions(3);
        user.setEmail("772086328@qq.com");
        user.setPhone("121212");
        user.setProfile_photo(" ");
        user.setUip(" ");
        user.setBirthday(" ");
        user.setRegister_time(" ");
        userDao.insertUser(user);
    }
}
