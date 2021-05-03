package com.ITFarmerBlog.Dao;

import com.ITFarmerBlog.Entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    List<User> getUsers();

    int insertUser(User user);
}
