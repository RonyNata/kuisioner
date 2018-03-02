package com.test.kuisioner.model;

import com.test.kuisioner.model.enumeration.KepuasanEnum;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "hasil")
public class Hasil implements Serializable {

    @Id
    @OneToOne
    @JoinColumn(name = "id_peserta")
    private Peserta idPeserta;

    @Enumerated(EnumType.STRING)
    @Column(name="hasil")
    private KepuasanEnum kepuasan;

    public Peserta getIdPeserta() {
        return idPeserta;
    }

    public void setIdPeserta(Peserta idPeserta) {
        this.idPeserta = idPeserta;
    }

    public KepuasanEnum getKepuasan() {
        return kepuasan;
    }

    public void setKepuasan(KepuasanEnum kepuasan) {
        this.kepuasan = kepuasan;
    }
}
