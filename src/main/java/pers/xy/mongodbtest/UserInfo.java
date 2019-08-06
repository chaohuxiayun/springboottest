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
public class UserInfo extends BaseEntity {

    public UserInfo(String age, String nickname) {
        this.age = age;
        this.nickname = nickname;
    }

    public UserInfo() {
        this.age = age;
        this.nickname = nickname;
    }

    private String age;
    private String nickname;
}
