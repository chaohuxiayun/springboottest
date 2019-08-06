package pers.xy.mongodbtest;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description
 * @Date 2019/7/26
 * @Created by xiayun
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private MongoTemplate mongoTemplate;

    @Override
    public List<User> findAllUser() {
        return mongoTemplate.findAll(User.class);
    }

    @Override
    public User addUser(User user) {
        mongoTemplate.save(user);
        return null;
    }
}
