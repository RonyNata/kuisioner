package com.test.kuisioner.model;

import javax.persistence.*;

@Entity
@Table(name = "kuisioner_peserta")
public class KuisionerPeserta {
    @EmbeddedId
    private KuisionerPesertaId kuisionerPesertaId;

    private short nilai;

    public short getNilai() {
        return nilai;
    }

    public void setNilai(short nilai) {
        this.nilai = nilai;
    }

    public KuisionerPesertaId getKuisionerPesertaId() {
        return kuisionerPesertaId;
    }

    public void setKuisionerPesertaId(KuisionerPesertaId kuisionerPesertaId) {
        this.kuisionerPesertaId = kuisionerPesertaId;
    }
}
