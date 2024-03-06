package com.example.budapestgayguidebackend.repository;

import com.example.budapestgayguidebackend.model.Sauna;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaunaRepository extends JpaRepository <Sauna, Long> {

}
