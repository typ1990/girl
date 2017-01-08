package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import javax.transaction.Transactional;

/**
 * Created by typ on 2017/1/8.
 */
@Service
public class GirlService {

    @Autowired
    private  GirlRespository girlRespository;

    @Transactional
    public  void insertTwo(){
        Girl girlA=new Girl("G",29);
        Girl girlB=new Girl("ADF",28);

        girlRespository.save(girlA);
        girlRespository.save(girlB);
    }

}
