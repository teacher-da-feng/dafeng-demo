package com.dafeng.springboot.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xiangfeng
 * @create 2023-04 20:45
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String username;
    private int age;
    private String password;
    private String alias;
}
