package com.example.Swag.controller;

import com.swagger.client.codegen.rest.api.UserControllerApi;
import com.swagger.client.codegen.rest.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GetAllUserApi {
    @Autowired
    UserControllerApi userControllerApi;
    @GetMapping("/getByID/{id}")
    public User getByID(@PathVariable int id){
        User byID= userControllerApi.getByIdUsingGET(id);
        return byID;
    }
    @GetMapping("/hey")
    public String sayHi(){
        return "Hi Broo";
    }

    @GetMapping("/getAll")
    public List<User> getAll(){
        List<User> list=userControllerApi.getAllUsingGET();
        return list;
    }
    @PostMapping("/createUser")
    public String createUser(@RequestBody User user){
        userControllerApi.saveUserUsingPOST(user);
        return "Saved Successfully";
    }

    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable int id){
        userControllerApi.deleteByIdUsingDELETE(id);
        return "Deleted Successfullyt";
    }

}
