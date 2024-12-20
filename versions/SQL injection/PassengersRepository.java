package com.tpp.bus_db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tpp.bus_db.models.Passengers;

@Repository
public interface PassengersRepository extends JpaRepository<Passengers, Integer> {
}