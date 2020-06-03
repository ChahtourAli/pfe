package com.attijari.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.attijari.entities.Operation;

@Repository
public interface OperationRepository extends JpaRepository <Operation, String>{

}
