package pers.xy.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Date 2019/6/30
 * @Created by xiayun
 */
@RestController
public class ExampleController {

    @RequestMapping("/home")
    public String home() {
        return "Hello World!";
    }

    @RequestMapping("/map")
    public Map<String,String> testMap(){
        Map<String,String> map = new HashMap<>();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");
        return map;
    }

}
