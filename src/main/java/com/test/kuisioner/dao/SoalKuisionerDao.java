package com.test.kuisioner.dao;

import com.test.kuisioner.model.SoalKuisioner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;

@Repository
public interface SoalKuisionerDao extends JpaRepository<SoalKuisioner, Integer>{

}
