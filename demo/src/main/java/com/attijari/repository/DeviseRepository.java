package com.attijari.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.attijari.entities.Devise;

@Repository
public interface DeviseRepository extends JpaRepository<Devise, String> {

}
