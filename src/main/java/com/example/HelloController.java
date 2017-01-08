package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by typ on 2017/1/7.
 */
@RestController
@RequestMapping(value = "/a")
public class HelloController {

//    @Value("${cupSize}")
//    private String cupSize;
//
//    @Value("${content}")
//    private String content;

    @Autowired
    private GirlProperties g;

    @RequestMapping(value = "/{id}/hi",method = RequestMethod.GET)
    public String say(@PathVariable("id") Integer id){
            return "id:"+id;
//        return g.getCupSize()+ g.getAge();
//        return "index";
    }

//    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    @GetMapping(value = "/hi")
    public String say1(@RequestParam(value = "id",required = false,defaultValue = "0") Integer id){
        return "id:"+id;
//        return g.getCupSize()+ g.getAge();
//        return "index";
    }


}
