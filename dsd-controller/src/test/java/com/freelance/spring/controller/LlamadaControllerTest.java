package com.freelance.spring.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.freelance.spring.domain.Llamada;
import com.freelance.spring.repository.CarRepository;
import com.freelance.spring.services.CarService;
import com.freelance.spring.services.LlamadaService;
import org.junit.jupiter.api.Test;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(controllers = LlamadaController.class)
public class LlamadaControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private LlamadaService llamadaService;

    @MockBean
    private CarService carService;

    @MockBean
    private CarRepository carRepository;

    @MockBean
    private MongoTemplate mongoTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void getAllLlamadas() throws Exception {
        List<Llamada> llamadas = Arrays.asList(
                new Llamada("1", "111", "222", 120),
                new Llamada("2", "333", "444", 300)
        );
        when(llamadaService.findAll()).thenReturn(llamadas);

        mockMvc.perform(get("/api/v1/llamadas"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(2)))
                .andExpect(jsonPath("$[0].fromNumber").value("111"))
                .andExpect(jsonPath("$[1].fromNumber").value("333"));
    }

    @Test
    public void getLlamadaById() throws Exception {
        Llamada llamada = new Llamada("1", "111", "222", 120);
        when(llamadaService.findById("1")).thenReturn(llamada);

        mockMvc.perform(get("/api/v1/llamadas/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value("1"))
                .andExpect(jsonPath("$.fromNumber").value("111"));
    }

    @Test
    public void saveLlamada() throws Exception {
        Llamada llamadaToSave = new Llamada(null, "555", "666", 60);
        Llamada savedLlamada = new Llamada("3", "555", "666", 60);
        when(llamadaService.save(any(Llamada.class))).thenReturn(savedLlamada);

        mockMvc.perform(post("/api/v1/llamadas")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(llamadaToSave)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value("3"))
                .andExpect(jsonPath("$.fromNumber").value("555"));
    }

    @Test
    public void deleteLlamada() throws Exception {
        mockMvc.perform(delete("/api/v1/llamadas/1"))
                .andExpect(status().isOk());
    }
}