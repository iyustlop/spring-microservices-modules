package com.freelance.spring.controller;

import com.freelance.spring.config.Config;
import com.freelance.spring.domain.Car;
import com.freelance.spring.repository.CarRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import java.util.Arrays;
import java.util.Collections;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = Controller.class, secure = false)
@Import(Config.class)
public class ControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CarRepository carRepository;

    @MockBean
    private MongoTemplate mongoTemplate1;

    @Test
    public void coolCars() throws Exception {
        when(carRepository.findAll()).thenReturn(Arrays.asList(
                new Car("1", "ferrari", Collections.singletonList("288")),
                new Car("1", "porsche", Collections.singletonList("911"))));

        mockMvc.perform(get("/car"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(2)));
    }

}