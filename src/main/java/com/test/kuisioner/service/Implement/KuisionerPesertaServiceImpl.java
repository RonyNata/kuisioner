package com.test.kuisioner.service.Implement;

import com.test.kuisioner.dao.KuisionerPesertaDao;
import com.test.kuisioner.model.KuisionerPeserta;
import com.test.kuisioner.service.KuisionerPesertaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("KuisionerPesertaService")
@Transactional
public class KuisionerPesertaServiceImpl implements KuisionerPesertaService {
    @Autowired
    private KuisionerPesertaDao kuisionerPesertaDao;

    @Override
    public void createKuisionerPeserta(KuisionerPeserta kuisionerPeserta) {
        kuisionerPesertaDao.save(kuisionerPeserta);
    }
}
