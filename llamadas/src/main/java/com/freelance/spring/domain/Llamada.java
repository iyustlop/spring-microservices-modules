package com.freelance.spring.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Llamada {
    private String id;
    private String fromNumber;
    private String toNumber;
    private int durationInSeconds;
}