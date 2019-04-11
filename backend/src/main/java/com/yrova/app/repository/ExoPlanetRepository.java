package com.yrova.app.repository;

import com.yrova.app.model.ExoPlanet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ExoPlanetRepository extends JpaRepository<ExoPlanet, Long> {

    List<ExoPlanet> findByIdIn(List<Long> exoPlanetIds);

    Optional<ExoPlanet> findByPlanetName(String planetName);

}