package pers.xy.mongodbtest;

import lombok.Data;
//import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @Description
 * @Date 2019/7/26
 * @Created by xiayun
 */
//@Data
//@Document
public class User extends BaseEntity{

    private String name;

    private String password;

    private UserInfo userInfo;
}
