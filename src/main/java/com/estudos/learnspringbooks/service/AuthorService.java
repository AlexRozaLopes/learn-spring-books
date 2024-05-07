package com.estudos.learnspringbooks.service;

import com.estudos.learnspringbooks.model.Author;
import com.estudos.learnspringbooks.repository.AuthorRepository;
import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AuthorService {

    private final AuthorRepository authorRepository;
    private final RabbitTemplate rabbitTemplate;

    public Author saveAuthor(Author author) {
        Author returnAuthor = authorRepository.save(author);
        rabbitTemplate.convertAndSend("first-queue",returnAuthor);
        return returnAuthor;
    }

    public List<Author> getAllAuthor() {
        return authorRepository.findAll();
    }

    @RabbitListener(queues = "first-queue")
    public void listener(Author author) {
        System.out.println(author);
    }
}
