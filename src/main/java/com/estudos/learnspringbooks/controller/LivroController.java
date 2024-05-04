package com.estudos.learnspringbooks.controller;

import com.estudos.learnspringbooks.model.Livro;
import com.estudos.learnspringbooks.service.LivroService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livro")
@AllArgsConstructor
public class LivroController {

    private final LivroService livroService;

    @PostMapping
    public ResponseEntity<Livro> postLivro(@RequestBody Livro livro) {
        return ResponseEntity.ok(livroService.saveLivro(livro));
    }

    @GetMapping
    public ResponseEntity<List<Livro>> getAllLivros() {
        return ResponseEntity.ok(livroService.getAllLivros());
    }

}
