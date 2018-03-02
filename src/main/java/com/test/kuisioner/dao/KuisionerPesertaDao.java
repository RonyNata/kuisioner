package com.test.kuisioner.dao;

import com.test.kuisioner.model.KuisionerPeserta;
import com.test.kuisioner.model.KuisionerPesertaId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KuisionerPesertaDao extends JpaRepository<KuisionerPeserta, KuisionerPesertaId> {
}
