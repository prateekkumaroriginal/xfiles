package com.example.backendone.repository;

import com.example.backendone.domain.Profile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface ProfileRepository extends JpaRepository<Profile, Long> {}
