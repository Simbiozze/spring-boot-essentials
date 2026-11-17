package com.spring_boot_essentials.controller;


import com.spring_boot_essentials.database.model.ExerciciosEntity;
import com.spring_boot_essentials.service.ExerciciosService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/e1/exercicios")
@RequiredArgsConstructor
public class ExerciciosController {

    private final ExerciciosService exerciciosService;


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ExerciciosEntity> findlAll(){
        return exerciciosService.findlAll();
    }

}
