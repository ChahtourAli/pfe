package com.attijari.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.attijari.entities.Agence;

@Repository
public interface AgenceRepository extends JpaRepository<Agence,String>{

}
