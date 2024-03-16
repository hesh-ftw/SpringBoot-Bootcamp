package com.example.bootcampspringboot.controllers;

import com.example.bootcampspringboot.model.Cat;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//REST CONTROLLERS
@RestController
public class CatController {

    private  List<Cat> list= new ArrayList<>(); //declare the array list


    //RETRIEVE EXISTING DATA

    @GetMapping("cat/all")
    public List<Cat> getCats(){
        return list;
    }
    //multiple request parameters

    @GetMapping("cat/{id}/{name}")
    public Cat getCatById(@PathVariable("id") int id, @PathVariable("name") String name){
        for(Cat cat :list){
            if(cat.getId() == id && cat.getName().equals(name)){
                return cat;
            }
        }
        return null;
    }


    @GetMapping("cat")
    public Cat getCatById2(@RequestParam("id") int id, @RequestParam("name") String name){
        for(Cat cat :list){
            if(cat.getId() == id && cat.getName().equals(name)){
                return cat;
            }
        }
        return null;
    }

    //add new data
    @PostMapping("cat")
    public Cat save(@RequestBody Cat cat){
        cat.setId(list.size()+1);
        list.add(cat);
        return cat;
    }

    //update data
    @PutMapping("cat")
    public Cat update(@RequestBody Cat cat){
        for (Cat cat1: list) {
            if(cat.getId() == cat1.getId()){
                cat1.setName(cat.getName());
            }
        }

        return cat;
    }


    //delete data
    @DeleteMapping("cat/{id}")
    public void deleteById(@PathVariable("id") int id){
        for (int i = 0; i < list.size(); i++) {
            Cat cat= list.get(i);
            if(cat.getId().equals(id)){
                list.remove(cat);
            }
        }
    }

}