package com.example.demo.repository;

import com.example.demo.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> findByUserId(Long userId);
    List<Event> findByType(String type);
}
