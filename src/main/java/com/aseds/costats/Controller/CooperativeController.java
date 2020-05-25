package com.aseds.costats.Controller;

import com.aseds.costats.Model.Cooperative;
import com.aseds.costats.Repository.CooperativeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/Cooperative",produces = { MediaType.APPLICATION_JSON_VALUE })
public class CooperativeController {
    @Autowired
    CooperativeRepository cooperativeRepository;

    @GetMapping(value="/all")
    public List<Cooperative> getAll()
    {
        return cooperativeRepository.findAll();
    }

    @GetMapping(value="/{idCooperative}")
    public Cooperative getCooperative(@PathVariable("idCooperative") long id)
    {
        return cooperativeRepository.findById(id).get();
    }

    @PostMapping(value = "/new")
    public void addCooperative(@RequestBody Cooperative cooperative)
    {
        cooperativeRepository.save(cooperative);
    }

    @PutMapping(value="/{idCooperative}/update")
    public void updateCooperative(@PathVariable("idCooperative") long id,@RequestBody Cooperative cooperative)
    {
        cooperativeRepository.findById(id).map(oldCooperative -> {
            oldCooperative.setNomCooperative(cooperative.getNomCooperative());
            oldCooperative.setAdresse(cooperative.getAdresse());
            oldCooperative.setSecteur(cooperative.getSecteur());
            oldCooperative.setMotDePasse(cooperative.getMotDePasse());

            oldCooperative.setAssemblees(cooperative.getAssemblees());
            oldCooperative.setCommunications(cooperative.getCommunications());
            oldCooperative.setMembers(cooperative.getMembers());
            oldCooperative.setEvenements(cooperative.getEvenements());
            oldCooperative.setFormations(cooperative.getFormations());
            oldCooperative.setProduits(cooperative.getProduits());

            oldCooperative.setRevenus(cooperative.getRevenus());
            oldCooperative.setPertes(cooperative.getPertes());

            return cooperativeRepository.save(oldCooperative);
        }).orElseGet(() -> {
            cooperative.setId(id);
            return cooperativeRepository.save(cooperative);
        });
    }

    @DeleteMapping(value="/{idCooperative}/delete")
    public void deleteCooperative(@PathVariable("idCooperative") long id)
    {
        cooperativeRepository.deleteById(id);
    }
}
