package com.test.kuisioner.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "soal_kuisioner")
public class SoalKuisioner {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_soal")
    private int idSoal;

    private String soal;

    @OneToMany(mappedBy = "soalKuisioner")
    private List<KuisionerPeserta> kuisionerPeserta;

    public int getIdSoal() {
        return idSoal;
    }

    public void setIdSoal(int idSoal) {
        this.idSoal = idSoal;
    }

    public String getSoal() {
        return soal;
    }

    public void setSoal(String soal) {
        this.soal = soal;
    }
}
