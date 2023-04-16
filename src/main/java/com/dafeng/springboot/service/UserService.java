package com.dafeng.springboot.service;

/**
 * @author xiangfeng
 * @create 2023-04 22:14
 */
public interface UserService {

    void addUser(String username,String password);
    void deleteUser(int age);

    void updateUser(String username,String password);
}
