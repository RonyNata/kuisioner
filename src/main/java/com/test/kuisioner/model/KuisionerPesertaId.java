package com.test.kuisioner.model;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class KuisionerPesertaId implements Serializable{
    @Column(name = "id_peserta")
    private int idPeserta;

    @Column(name = "id_soal")
    private int idSoal;

    public int getIdPeserta() {
        return idPeserta;
    }

    public void setIdPeserta(int idPeserta) {
        this.idPeserta = idPeserta;
    }

    public int getIdSoal() {
        return idSoal;
    }

    public void setIdSoal(int idSoal) {
        this.idSoal = idSoal;
    }
}
