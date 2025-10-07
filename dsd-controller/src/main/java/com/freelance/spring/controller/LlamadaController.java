package com.freelance.spring.controller;

import com.freelance.spring.domain.Llamada;
import com.freelance.spring.services.LlamadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/llamadas")
public class LlamadaController {

    @Autowired
    private LlamadaService llamadaService;

    @GetMapping
    public ResponseEntity<List<Llamada>> getAllLlamadas() {
        return ResponseEntity.ok(this.llamadaService.findAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Llamada> getLlamadaById(@PathVariable(name = "id") String id) {
        return ResponseEntity.ok(this.llamadaService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Llamada> saveLlamada(@RequestBody Llamada llamada) {
        return ResponseEntity.ok(this.llamadaService.save(llamada));
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> deleteLlamada(@PathVariable(name = "id") String id) {
        this.llamadaService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}