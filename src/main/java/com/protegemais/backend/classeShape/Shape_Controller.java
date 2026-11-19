package com.protegemais.backend.classeShape;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/shape")

public class Shape_Controller {
    private final Shape_Repository shapeRepository;

    public Shape_Controller(Shape_Repository shapeRepository) {
        this.shapeRepository = shapeRepository;
    }

    @GetMapping("/getShape") 
        public List<Shape_Model> listShapes() {
            return shapeRepository.findAll();
        }

    @GetMapping("/getShape/{id}")
public Shape_Model buscarShape(@PathVariable Long id) {
    return shapeRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Shape não encontrado com o ID: " + id));
}
}