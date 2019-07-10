package com.example.demo.repositories;

import com.example.demo.domain.Kunde;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KundenRepository extends JpaRepository<Kunde, Long> {
}
