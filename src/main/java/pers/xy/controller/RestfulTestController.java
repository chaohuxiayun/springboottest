package pers.xy.controller;

import org.springframework.web.bind.annotation.*;
import pers.xy.entity.User;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Date 2019/6/30
 * @Created by xiayun
 */
@RestController
public class RestfulTestController {

    /**
     *GET[select]  请求会向数据库发索取数据的请求，从而来获取信息,其只是用来查询一下数据，不会修改、增加数据，不会影响资源的内容。无论进行多少次操作，结果都是一样的
     *PUT[update]  请求是向服务器端发送数据的，从而改变信息，其用来修改数据的内容，但是不会增加数据的种类等，无论进行多少次PUT操作，其结果并没有不同。
     * DELETE[delete]请求是用来删除某一个资源的。
     * POST[insert]请求同PUT请求类似，都是向服务器端发送数据的，但是该请求会改变数据的种类等资源.几乎目前所有的提交操作都是用POST请求的
     */

    private Map<String, Object> params = new HashMap<>();

    @RequestMapping(path = "/fincUser/{city_id}/{user_id}", method = RequestMethod.GET)
    public Object findUser(@PathVariable("city_id") String cityId, @PathVariable("user_id") String userId) {
        params.clear();
        params.put("cityId", cityId);
        params.put("userId", userId);
        return params;
    }

    @GetMapping(path = "/v1/page_user/{user_id}")
    public Object getUser(@RequestParam(defaultValue = "0", name = "cityId") String cityId, @PathVariable("user_id") String userId, int size) {
        params.clear();
        params.put("cityId", cityId);
        params.put("userId", userId);
        params.put("size", size);
        return params;
    }

    /**
     * http头 content-type 为 application/json
     * @param user
     * @return
     */
    @PostMapping(path = "/v1/getUser2")
    public Object getUser2(@RequestBody User user) {
        params.clear();
        params.put("user", user);
        return params;
    }


    /**
     * http头 content-type 为 application/json
     * @param user
     * @return
     */
    @GetMapping(path = "/v1/getUser3")
    public Object getUser3(@RequestHeader("access_token") String access_token,String id) {
        params.clear();
        params.put("access_token", access_token);
        params.put("id", id);
        return params;
    }
}
