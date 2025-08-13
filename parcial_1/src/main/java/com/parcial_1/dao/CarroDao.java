package com.parcial_1.dao;

import com.parcial_1.domain.Carro;
import org.springframework.data.repository.CrudRepository;

public interface CarroDao extends CrudRepository<Carro, Long> {
}