package com.cineclon.api;

import com.cineclon.model.entity.Cinema;
import com.cineclon.repository.CinemaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sedes")
@RequiredArgsConstructor
public class CinemaController {

    private final CinemaRepository cinemaRepository;

    @GetMapping
    public ResponseEntity<List<Cinema>> getAllCinemas() {
        return ResponseEntity.ok(cinemaRepository.findAll());
    }
}
