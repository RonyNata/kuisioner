package com.test.kuisioner.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "peserta")
public class Peserta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_peserta")
    private int idPeserta;

    @Column(name = "nama_peserta")
    private String namaPeserta;

    @OneToMany(mappedBy = "peserta")
    private List<KuisionerPeserta> kuisionerPeserta;

    private String email;

    private String kontak;

    public int getIdPeserta() {
        return idPeserta;
    }

    public void setIdPeserta(int idPeserta) {
        this.idPeserta = idPeserta;
    }

    public String getNamaPeserta() {
        return namaPeserta;
    }

    public void setNamaPeserta(String namaPeserta) {
        this.namaPeserta = namaPeserta;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getKontak() {
        return kontak;
    }

    public void setKontak(String kontak) {
        this.kontak = kontak;
    }
}
