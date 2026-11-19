
package com.protegemais.backend.classeCalendar;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calendar")
public class calendar_Controller {

    private final calendar_Repository calendarRepository;

    public calendar_Controller(calendar_Repository calendarRepository) {
        this.calendarRepository = calendarRepository;
    }

    
    @GetMapping
    public List<calendar_Model> listarCalendar() {
        return calendarRepository.findAll();
    }

    
    @GetMapping("/{id}")
    public calendar_Model buscarCalendarPorId(@PathVariable Long id) {
        return calendarRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Calendar não encontrado"));
    }
}
