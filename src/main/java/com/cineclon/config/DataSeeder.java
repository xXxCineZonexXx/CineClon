package com.cineclon.config;

import com.cineclon.model.entity.Cinema;
import com.cineclon.repository.CinemaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
@RequiredArgsConstructor
public class DataSeeder implements CommandLineRunner {

    private final CinemaRepository cinemaRepository;

    @Override
    public void run(String... args) throws Exception {
        if (cinemaRepository.count() == 0) {
            List<Cinema> sedes = Arrays.asList(
                Cinema.builder()
                    .nombre("Cinezone San Isidro")
                    .direccion("Av. Javier Prado Este 4200, San Isidro")
                    .ciudad("Lima")
                    .activa(true)
                    .build(),
                Cinema.builder()
                    .nombre("Cinezone Miraflores")
                    .direccion("Av. Larco 345, Miraflores")
                    .ciudad("Lima")
                    .activa(true)
                    .build(),
                Cinema.builder()
                    .nombre("Cinezone Plaza Norte")
                    .direccion("CC Plaza Norte, Independencia")
                    .ciudad("Lima")
                    .activa(true)
                    .build(),
                Cinema.builder()
                    .nombre("Cinezone Jockey Plaza")
                    .direccion("CC Jockey Plaza, Surco")
                    .ciudad("Lima")
                    .activa(true)
                    .build()
            );

            cinemaRepository.saveAll(sedes);
            System.out.println("✅ SEDES INICIALIZADAS AUTOMÁTICAMENTE");
        }
    }
}
