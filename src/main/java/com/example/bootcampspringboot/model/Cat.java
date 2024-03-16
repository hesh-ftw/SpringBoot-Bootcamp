package com.example.bootcampspringboot.model;

public class Cat {

    public String name;
    public Integer id;


    public String getCat() {
        return name;
    }

    public void setCat(String cat) {
        this.name = cat;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}