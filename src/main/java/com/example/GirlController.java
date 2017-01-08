package com.example;

import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by typ on 2017/1/8.
 */
@RestController
public class GirlController {

    @Autowired
    private GirlRespository girlRespository;

    @Autowired
    private  GirlService girlService;

    /**
     * 查询女生列表
     * @return
     */
    @GetMapping(value = "/girls")
//    @RequestMapping(value = "/girls",method = RequestMethod.GET)
    private List<Girl> girlList(){
        return girlRespository.findAll();
    }


    @GetMapping(value = "addGirl")
    public Girl girlAdd(@RequestParam(value = "cupSize") String cupSize,
                          @RequestParam(value = "age") Integer age ){
        Girl girl= new Girl();
        girl.setAge(age);
        girl.setCupSize(cupSize);
        return girlRespository.save(girl);

    }

    @GetMapping(value = "query/{age}")
    public List<Girl> findByAge( @PathVariable("age") Integer age ){
        return girlRespository.findByAge(age);
    }

    @GetMapping(value = "insertTwo")
    public  void girlTwo(){

        girlService.insertTwo();
    }

}
