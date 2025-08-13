package com.parcial_1.service;

import com.parcial_1.domain.Carro;
import java.util.List;

public interface CarroService {

    public List<Carro> getCarros();

    public Carro getCarro(Carro carro);

    public void save(Carro carro);

    public void delete(Carro carro);
}