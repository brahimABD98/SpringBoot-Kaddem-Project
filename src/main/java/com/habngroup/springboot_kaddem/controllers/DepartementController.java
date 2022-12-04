package com.habngroup.springboot_kaddem.controllers;

import com.habngroup.springboot_kaddem.entities.Departement;
import com.habngroup.springboot_kaddem.entities.Option;
import com.habngroup.springboot_kaddem.entities.Professor;
import com.habngroup.springboot_kaddem.services.IDepartementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
@CrossOrigin
public class DepartementController {

    private final IDepartementService iDepartementService;

    @Autowired
    public DepartementController(IDepartementService iDepartementService) {
        this.iDepartementService = iDepartementService;
    }

    @GetMapping("/getDepartements")
    List<Departement> getAllDepartements(){
        return iDepartementService.getAllDepartements();
    }

    @GetMapping("/getDepartement/{departementId}")
    Departement getDepartementById(@PathVariable("departementId") Long departementId){
       return  iDepartementService.getDepartementById(departementId);
    }

    @PostMapping("/addDepartement")
    void addDepartement(@RequestBody Departement departement){
        iDepartementService.addDepartement(departement);
    }

    @DeleteMapping("/deleteDepartement")
    void deleteDepartement(@RequestBody Departement departement){
        iDepartementService.deleteDepartement(departement);
    }

    @DeleteMapping("/deleteDepartement/{departementId}")
    void deleteDepartement(@PathVariable("departementId") Long departementId){
        iDepartementService.deleteDepartementById(departementId);
    }

    @PutMapping("/updateDepartement/{departementId}")
    void updateDepartement(@PathVariable("departementId") Long departementId, @RequestBody Departement departement){
        iDepartementService.updateDepartement(departementId, departement);
    }
    @PutMapping("/ajouterchefdepartemnt/{nomDepartement}")
    void affecterChefDepartement(@PathVariable("nomDepartement")String nomDepartement, @RequestBody Professor professor){
        iDepartementService.affectChefDepartement(nomDepartement,professor);
    }
    @GetMapping("/afficheroptiondepartement/{nomDeaprtement}")
    Set<Option> displayDepartementoptionsbynom(@PathVariable("nomDeaprtement")String nomDeaprtement){
     return    iDepartementService.displayDepartementoptionsbynom(nomDeaprtement);
    }

    @GetMapping("/afficherNbrEtudparOption/{nomDepartement}")
    Map<Option, Long> displaynbretudiantbyoption(@PathVariable("nomDepartement") String nomDepartement){
        return iDepartementService.displaynbretudiantbyoption(nomDepartement);
    }
}
