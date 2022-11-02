package com.habngroup.springboot_kaddem.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Contrat implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idContrat")
    private long idContrat;
    @Temporal(TemporalType.DATE)
    private Date dateDebutContrat;
    @Temporal(TemporalType.DATE)
    private Date dateFinContrat;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;
    private boolean archive;
    private long montantContrat;
    @ManyToOne
    Etudiant etudiant;

    public Contrat() {
    }

    public Contrat(Date dateDebutContrat, Date dateFinContrat, Specialite specialite, boolean archive, long montantContrat) {
        this.dateDebutContrat = dateDebutContrat;
        this.dateFinContrat = dateFinContrat;
        this.specialite = specialite;
        this.archive = archive;
        this.montantContrat = montantContrat;
    }

    public Contrat(long idContrat, Date dateDebutContrat, Date dateFinContrat, Specialite specialite, boolean archive, long montantContrat) {
        this.idContrat = idContrat;
        this.dateDebutContrat = dateDebutContrat;
        this.dateFinContrat = dateFinContrat;
        this.specialite = specialite;
        this.archive = archive;
        this.montantContrat = montantContrat;
    }

    public long getIdContrat() {
        return idContrat;
    }

    public void setIdContrat(long idContrat) {
        this.idContrat = idContrat;
    }

    public Date getDateDebutContrat() {
        return dateDebutContrat;
    }

    public void setDateDebutContrat(Date dateDebutContrat) {
        this.dateDebutContrat = dateDebutContrat;
    }

    public Date getDateFinContrat() {
        return dateFinContrat;
    }

    public void setDateFinContrat(Date dateFinContrat) {
        this.dateFinContrat = dateFinContrat;
    }

    public Specialite getSpecialite() {
        return specialite;
    }

    public void setSpecialite(Specialite specialite) {
        this.specialite = specialite;
    }

    public boolean isArchive() {
        return archive;
    }

    public void setArchive(boolean archive) {
        this.archive = archive;
    }

    public long getMontantContrat() {
        return montantContrat;
    }

    public void setMontantContrat(long montantContrat) {
        this.montantContrat = montantContrat;
    }

    @Override
    public String toString() {
        return "Contrat{" +
                "idContrat=" + idContrat +
                ", dateDebutContrat=" + dateDebutContrat +
                ", dateFinContrat=" + dateFinContrat +
                ", specialite=" + specialite +
                ", archive=" + archive +
                ", montantContrat=" + montantContrat +
                '}';
    }
}
