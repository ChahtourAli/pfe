package com.attijari.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.attijari.entities.Ville;
@Repository
public interface VilleRepository  extends JpaRepository<Ville, String>{

}
