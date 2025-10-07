package com.freelance.spring.services.impl;

import com.freelance.spring.domain.Llamada;
import com.freelance.spring.services.LlamadaService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class LlamadaServiceImpl implements LlamadaService {

    private final Map<String, Llamada> llamadas = new ConcurrentHashMap<>();

    public LlamadaServiceImpl() {
        // Add some dummy data
        llamadas.put("1", new Llamada("1", "123456789", "987654321", 120));
        llamadas.put("2", new Llamada("2", "555555555", "111111111", 300));
    }

    @Override
    public List<Llamada> findAll() {
        return new ArrayList<>(llamadas.values());
    }

    @Override
    public Llamada findById(String id) {
        return llamadas.get(id);
    }

    @Override
    public Llamada save(Llamada llamada) {
        if (llamada.getId() == null) {
            llamada.setId(String.valueOf(System.currentTimeMillis()));
        }
        llamadas.put(llamada.getId(), llamada);
        return llamada;
    }

    @Override
    public void deleteById(String id) {
        llamadas.remove(id);
    }
}