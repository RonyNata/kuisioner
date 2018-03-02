package com.test.kuisioner.model;

import javax.persistence.*;

@Entity
@Table(name = "kuisioner_peserta")
public class KuisionerPeserta {
    @EmbeddedId
    private KuisionerPesertaId kuisionerPesertaId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "id_soal",
            insertable = false,
            updatable = false,
            referencedColumnName = "id_soal"
    )
    private SoalKuisioner soalKuisioner;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "id_peserta",
            insertable = false,
            updatable = false,
            referencedColumnName = "id_peserta"
    )
    private Peserta peserta;

    public SoalKuisioner getSoalKuisioner() {
        return soalKuisioner;
    }

    public void setSoalKuisioner(SoalKuisioner soalKuisioner) {
        this.soalKuisioner = soalKuisioner;
    }

    public Peserta getPeserta() {
        return peserta;
    }

    public void setPeserta(Peserta peserta) {
        this.peserta = peserta;
    }

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
