package com.kodlamaio.lawfirmAOP.dataAccess;

import com.kodlamaio.lawfirmAOP.entities.Profession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessionRepository extends JpaRepository<Profession,Integer> {
}
