package com.pokhara.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pokhara.entities.ContactEntity;

@Repository
public interface ContactRepository extends JpaRepository<ContactEntity, Integer>{

}
