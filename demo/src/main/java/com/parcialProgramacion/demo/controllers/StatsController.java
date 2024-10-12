package com.parcialProgramacion.demo.controllers;

import com.parcialProgramacion.demo.dto.StatsResponse;
import com.parcialProgramacion.demo.service.StatsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stats")
public class StatsController {
    private final StatsService statsService;

    // Constructor que inyecta el StatsService

    public StatsController(StatsService statsService){
        this.statsService =  statsService;
    }

    @GetMapping
    public StatsResponse getStats(){
        // Llama al servicio StatsService para obtener las estadísticas y las devuelve como respuesta
        return statsService.getStats();
    }
}
