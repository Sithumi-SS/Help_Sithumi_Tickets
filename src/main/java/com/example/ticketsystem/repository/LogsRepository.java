package com.example.ticketsystem.repository;

import com.example.ticketsystem.model.Logs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogsRepository extends JpaRepository<Logs, Long> {
}
