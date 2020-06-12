package com.icis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

//测试SpringBoot框架控制器
@Controller
@RequestMapping("boot")
public class BootController {
    //方法   返回一个字符串
    @RequestMapping("quickStart")
    @ResponseBody
    public String bootStart(){
        String str="SpringBoot项目启动成功.";
        return  str;
    }
    //测试返回一个json格式对象
    @RequestMapping("getMap")
    @ResponseBody
    public Map<String,String> getJsonMap(){
        Map<String,String> map=new HashMap();
        map.put("name","詹姆斯");
        map.put("age","34");
        map.put("bobby","篮球");
        map.put("salary","23$");
        return map;
    }

}
