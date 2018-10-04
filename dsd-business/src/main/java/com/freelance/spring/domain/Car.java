package com.freelance.spring.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Cars")
public class Car {
    /**
     * POJO for business layer.
     * @param id
     */
    @Id
    private String id;
    /**
     * @param manufacturer name.
     */
    private String manufacturer;
    /**
     * @param model name.
     */
    private List<String> model;
}
