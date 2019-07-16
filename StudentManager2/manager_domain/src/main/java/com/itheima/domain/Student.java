package com.itheima.domain;

/**
 * @author 刘玉保
 * @date 2019/07/14 上午 9:28
 */

public class Student {
    private Integer id;
    private String name;
    private Integer sex;
    private Integer age;
    private String address;

    public Student() {
    }

    public Student(Integer id, String name, Integer sex, Integer age, String address) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "学生 {" +
                "ID:" + id +
                ",姓名:" + name +
                ",性别:" + sex +
                ",年龄:" + age +
                ",地址:" + address +
                '}';
    }
}
