package com.jvkstackmvn.jvkstack.controllers;

import com.jvkstackmvn.jvkstack.domains.entities.EntityA;
import com.jvkstackmvn.jvkstack.services.EntityAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/entities")
public class EntityController {
    @Autowired
    private EntityAService es;

    //Show all entities API
    @GetMapping("/")
    public ResponseEntity<List<EntityA>> getAllEntities(){
        List<EntityA> result = es.getAllEntities();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }


    //Save entity to Database API
    @PostMapping("/")
    public ResponseEntity<?> saveEntity(@RequestBody EntityA e){
        es.saveEntity(e);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
