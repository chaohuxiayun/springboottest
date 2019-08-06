package pers.xy.mongodbtest;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @Description
 * @Date 2019/7/26
 * @Created by xiayun
 */
@Data
@Document
public class User extends BaseEntity{

    public  String name;

    public  String password;

    public UserInfo userInfo;
}
