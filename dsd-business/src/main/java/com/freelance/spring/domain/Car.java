package com.freelance.spring.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    @Id @GeneratedValue
    private Long id;
    @NonNull private String manufacturer;
    @NonNull private String model;
}
