package com.test.kuisioner.service.Implement;

import com.test.kuisioner.model.SoalKuisioner;
import com.test.kuisioner.service.SoalKuisionerService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("SoalKuisionerService")
@Transactional
public class SoalKuisionerServiceImpl implements SoalKuisionerService{
    @Override
    public List<SoalKuisioner> getSoal() {
        return null;
    }
}
