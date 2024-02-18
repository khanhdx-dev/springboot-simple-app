package com.jvkstackmvn.jvkstack.repositories;

import com.jvkstackmvn.jvkstack.domains.entities.EntityA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;


//This interface extends the JPA Repository, which already had the method to process data in the library's code.
@Repository
public interface EntityRepository extends JpaRepository<EntityA, Long> {
    Optional<EntityA> findById(Long id);
}
