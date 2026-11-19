package com.protegemais.backend.classeCalendar;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class calendar_Service {
    private final calendar_Repository calendarRepository;

    public calendar_Service(calendar_Repository calendarRepository) {
        this.calendarRepository = calendarRepository;
    }

    public calendar_Model criarCalendar(calendar_Model calendar) {
        return calendarRepository.save(calendar);
    }

    public List<calendar_Model> listarCalendar() {
        return calendarRepository.findAll();
    }

    public calendar_Model atualizarCalendar(Long service_id, calendar_Model calendarAtualizado) {
        return calendarRepository.findById(service_id) 
            .map (calendar -> {
                calendar.setMonday(calendarAtualizado.isMonday());
                calendar.setTuesday(calendarAtualizado.isTuesday());
                calendar.setWednesday(calendarAtualizado.isWednesday());
                calendar.setThursday(calendarAtualizado.isThursday());
                calendar.setFriday(calendarAtualizado.isFriday());
                calendar.setSaturday(calendarAtualizado.isSaturday());
                calendar.setSunday(calendarAtualizado.isSunday());

                return calendarRepository.save(calendar);
            })
            .orElseThrow(() -> new RuntimeException("Calendar não encontrado com o ID: " + service_id));
    }

    public void deletarCalendar(Long service_id) {
        calendarRepository.deleteById(service_id);
    }
}
