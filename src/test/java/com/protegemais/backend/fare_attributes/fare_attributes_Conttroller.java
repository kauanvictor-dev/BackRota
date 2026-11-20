package com.protegemais.backend.fare_attributes;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/fare_attributes")

public class fare_attributes_Conttroller {

    private final fare_attributes_Repository fare_attributesRepository;

    public fare_attributes_Conttroller(fare_attributes_Repository fare_attributesRepository){
        this.fare_attributesRepository = fare_attributesRepository;
    }

    @GetMapping
    public List<fare_attributes_model> listarFare_attributes(){}


}
