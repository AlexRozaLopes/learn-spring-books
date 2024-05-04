package com.estudos.learnspringbooks.repository;

import com.estudos.learnspringbooks.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AuthorRepository extends JpaRepository<Author, UUID> {
}
