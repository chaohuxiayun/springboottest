package pers.xy.mongodbtest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description
 * @Date 2019/7/26
 * @Created by xiayun
 */
@RestController
@RequestMapping("/mongotest")
@Api(value="mongodb的测试类")
public class MongoTestController {

//    @Autowired
//    private UserService userService;
//
//    @RequestMapping(value = "/findAllUser" ,method = RequestMethod.GET)
//    @ApiOperation(value="获取所有的用户", notes="获取所有的用户")
//    public List<User> findAllUser(){
//        return userService.findAllUser();
//    }
//
//    @RequestMapping(value = "/addUser" ,method = RequestMethod.PUT)
//    @ApiOperation(value="新增用户", notes="获取所有的用户")
//    @ApiImplicitParam(paramType="add", name = "User", value = "用户", required = true, dataType = "Integer")
//    public User addUser(User user){
//        userService.addUser(user);
//        return user;
//    }

}
