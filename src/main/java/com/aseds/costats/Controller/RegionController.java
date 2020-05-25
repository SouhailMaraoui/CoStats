package com.aseds.costats.Controller;

import com.aseds.costats.Model.Region;
import com.aseds.costats.Repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value= "/region",produces = { MediaType.APPLICATION_JSON_VALUE })
public class RegionController {

    @Autowired
    RegionRepository repository;

    @GetMapping(value="/all")
    public List<Region> getAll()
    {
        return repository.findAll();
    }

    @GetMapping(value="/{id}")
    public Region getById(@PathVariable("id") long id)
    {
        return repository.findById(id).get();
    }

    @PostMapping(value = "/create")
    public void create(@RequestBody Region obj)
    {
        repository.save(obj);
    }

    @PutMapping(value="/{id}/update")
    public void update(@PathVariable("id") long id,@RequestBody Region newObj)
    {
        repository.findById(id).map(oldObj -> {
            long idOld=oldObj.getId();
            oldObj=newObj;
            oldObj.setId(idOld);
            return repository.save(oldObj);
        }).orElseGet(() -> {
            newObj.setId(id);
            return repository.save(newObj);
        });
    }

    @DeleteMapping(value="/{id}/delete")
    public void delete(@PathVariable("id") long id)
    {
        repository.deleteById(id);
    }
}