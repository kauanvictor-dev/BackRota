package com.protegemais.backend.calendar_dates;
import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/calendar_dates") 

public class calendar_dates_Controller {


    private final calendar_dates_Repository calendar_datesRepository;

    public calendar_dates_Controller(calendar_dates_Repository calendar_datesRepository){
        this.calendar_datesRepository = calendar_datesRepository;
    }
     @GetMapping
    public List<calendar_dates_model> ListarCalendar_dates(){
        return calendar_datesRepository.findAll();
    }

    @GetMapping("{/id}")
     public calendar_dates_model buscarCalendar_datesPorId(@PathVariable Long id){
        return calendar_datesRepository.findById(id)
        .orElseThrow(()-> new RuntimeException("agency não encontrado") );
     }

}
