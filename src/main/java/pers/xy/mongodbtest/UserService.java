package pers.xy.mongodbtest;

import java.util.List;

/**
 * @Description
 * @Date 2019/7/26
 * @Created by xiayun
 */
public interface UserService {

    List<User> findAllUser();

    User addUser(User user);
}
