package com.qa.chocolate.rest;

import com.qa.chocolate.domain.Chocolate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ChocolateController {

    private List<Chocolate> choco = new ArrayList<>();

    //Response entity -> allows us to configure the status code of the response

    //CRUD

    //Create - POST
    //Response to return instead of 200: 201 - created
    @PostMapping("/createChoco")
    public ResponseEntity<Chocolate> createChoco(@RequestBody Chocolate c) {
        this.choco.add(c);
        //get the record we just created
        Chocolate newChoco = this.choco.get(this.choco.size()-1);
        //                                     ENUM
        return new ResponseEntity<>(newChoco, HttpStatus.CREATED);
    }
    //insert into chocolate(name, brand, ...) values("dairy milk", "cadbury", ..)

    //Read - GET
    @GetMapping("/getChoco")
    public List<Chocolate> getChoco(){
        return this.choco;
    }

    //Update - PUT/PATCH - PUT

    //Delete - DELETE



}
