package cn.org.yunmo.hotel.pojo;

import javax.persistence.*;

/**
 * @Description JpaSqlServer
 * @Author zyh
 * @Date 2018-11-21 17:16
 */
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//GenerationType.IDENTITY 插入可以不setID
    private int id;

    private int age;

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
