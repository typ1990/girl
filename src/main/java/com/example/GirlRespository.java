package com.example;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by typ on 2017/1/8.
 */
public interface GirlRespository extends JpaRepository<Girl,Integer> {

    public List<Girl> findByAge(Integer age);

}
