package com.estudos.learnspringbooks.service;

import com.estudos.learnspringbooks.model.Livro;
import com.estudos.learnspringbooks.repository.LivroRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class LivroService {

    private final LivroRepository livroRepository;

    public Livro saveLivro(Livro livro) {
        return livroRepository.save(livro);
    }

    public List<Livro> getAllLivros() {
        return livroRepository.findAll();
    }
}
