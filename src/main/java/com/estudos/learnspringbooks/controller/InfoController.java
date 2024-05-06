package com.estudos.learnspringbooks.controller;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
@ConfigurationProperties(prefix = "inf.prop")
@Data
public class InfoController {

    private String descricao = "Ambiente De Teste";


    @GetMapping
    public ResponseEntity<?> getInfo(){
        return ResponseEntity.ok(descricao);
    }
}
