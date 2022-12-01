package com.habngroup.springboot_kaddem.services;

import com.habngroup.springboot_kaddem.DTO.ArchivePercentType;
import com.habngroup.springboot_kaddem.entities.Contrat;
import com.habngroup.springboot_kaddem.entities.Specialite;

import java.util.Date;
import java.util.List;

public interface IContratService  {
    void addContrat(Contrat contrat);
    void updateContrat(Long contratId, Contrat contrat);
    void deleteContrat(Contrat contrat);
    void deleteContratById(Long contratId);
    List<Contrat> getAllContrats();
    Contrat getContratById(Long contratId);
    Contrat affectContratToEtudiant(Contrat contrat, String nomEtudiant, String prenomEtudiant);
    List<ArchivePercentType> getContratPercentByArchiveStatus();
    List<Contrat> findAllByDateDebutContratOrDateFinContratOrSpecialiteOrArchiveOrMontantContrat(Date dateDebut, Date dateFin, Specialite specialite,
                                                                                                 boolean archive, Long montantContrat);
}
