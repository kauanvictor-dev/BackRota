package com.protegemais.backend.classeTransfers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/transfers")
@RestController

public class Transfers_Controller {
    private final Transfers_Repository transfersRepository;

    public Transfers_Controller(Transfers_Repository transfersRepository) {
        this.transfersRepository = transfersRepository;
    }
    
    public List<Transfers_Model> listarTransfers() {
        return transfersRepository.findAll();
    }

    public Transfers_Model buscarTransfersPorId(Long id) {
        return transfersRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Transfers não encontrado"));
    }
}
