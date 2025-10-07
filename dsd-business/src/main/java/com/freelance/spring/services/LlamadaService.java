package com.freelance.spring.services;

import com.freelance.spring.domain.Llamada;

import java.util.List;

public interface LlamadaService {
    List<Llamada> findAll();
    Llamada findById(String id);
    Llamada save(Llamada llamada);
    void deleteById(String id);
}