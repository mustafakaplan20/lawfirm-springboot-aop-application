package com.kodlamaio.lawfirmAOP.dataAccess;

import com.kodlamaio.lawfirmAOP.entities.Lawyer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LawyerRepository extends JpaRepository<Lawyer,Integer> {
}
