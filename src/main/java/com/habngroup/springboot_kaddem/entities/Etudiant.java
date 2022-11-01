package com.habngroup.springboot_kaddem.entities;

import java.io.Serializable;

public class Etudiant implements Serializable {

    private long idEtudiant;
    private String prenomE;
    private String nomE;
    private Option option;

    public Etudiant() {
    }

    public Etudiant(String prenomE, String nomE, Option option) {
        this.prenomE = prenomE;
        this.nomE = nomE;
        this.option = option;
    }

    public Etudiant(long idEtudiant, String prenomE, String nomE, Option option) {
        this.idEtudiant = idEtudiant;
        this.prenomE = prenomE;
        this.nomE = nomE;
        this.option = option;
    }

    public long getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(long idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public String getPrenomE() {
        return prenomE;
    }

    public void setPrenomE(String prenomE) {
        this.prenomE = prenomE;
    }

    public String getNomE() {
        return nomE;
    }

    public void setNomE(String nomE) {
        this.nomE = nomE;
    }

    public Option getOption() {
        return option;
    }

    public void setOption(Option option) {
        this.option = option;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "idEtudiant=" + idEtudiant +
                ", prenomE='" + prenomE + '\'' +
                ", nomE='" + nomE + '\'' +
                ", option=" + option +
                '}';
    }
}
