package service;

/**
 * @author xiangfeng
 * @create 2023-04 21:57
 */
public interface UserService {

    void addUser(String username,String password);

    void deleteUser(String  username,String password);

    void updateUser(String username, String password);
}
