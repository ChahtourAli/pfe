package com.attijari.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.attijari.entities.Optimum;
@Repository
public interface OptimumRepository extends JpaRepository <Optimum, String> {

}
