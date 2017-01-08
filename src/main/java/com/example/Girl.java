package com.example;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.dialect.Ingres10Dialect;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by typ on 2017/1/7.
 */
@Entity
public class Girl {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name="system-uuid",strategy="uuid")
    private String id;

    private String cupSize;

    private Integer age;

    public Girl() {
    }

    public Girl(String cupSize, Integer age) {
        this.cupSize = cupSize;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
