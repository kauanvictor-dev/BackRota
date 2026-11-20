package com.protegemais.backend.classeRoutes;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/routes")
public class Routes_Controller {
    private final Routes_Repository routesRepository;

    public Routes_Controller(Routes_Repository routesRepository) {
        this.routesRepository = routesRepository;
    }

    public List<Routes_Model> listarRoutes() {
        return routesRepository.findAll();
    }

    public Routes_Model buscarRoutesPorId(Long id) {
        return routesRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Routes não encontrado"));
    }


}
