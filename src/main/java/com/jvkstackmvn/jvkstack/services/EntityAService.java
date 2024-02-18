package com.jvkstackmvn.jvkstack.services;

import com.jvkstackmvn.jvkstack.domains.entities.EntityA;
import com.jvkstackmvn.jvkstack.repositories.EntityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntityAService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private EntityRepository er;


    //Show all entities bussiness
    public List<EntityA> getAllEntities(){
        logger.info("### Getting All Entities");
        return er.findAll();
    }

    //Save entity to Database business
    public void saveEntity(EntityA entityA) {
        er.save(entityA);
    }
}
