package com.example.backendone.repository;

import com.example.backendone.domain.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface NoteRepository extends JpaRepository<Note, Long> {}
