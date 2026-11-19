package com.protegemais.backend;
import java.util.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/agency")

public class agency_Controller {

    private final agency_Repository agencyRepository;
    
    public agency_Controller(agency_Repository agencyRepository){
        this.agencyRepository = agencyRepository;
    }

    
    @GetMapping
public List<agency_model>listarAgency(){
    return agencyRepository.findAll();
}
@GetMapping("/{id}")
public agency_model BuscarAgencyPorId(@PathVariable Long id){
    return agencyRepository.findById(id)
    .orElseThrow(()-> new RuntimeException("agency não encontrado") );
}


}

