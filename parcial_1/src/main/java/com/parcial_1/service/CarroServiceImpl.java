package com.parcial_1.service;

import com.parcial_1.dao.CarroDao;
import com.parcial_1.domain.Carro;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarroServiceImpl implements CarroService {

    @Autowired
    private CarroDao carroDao;

    @Override
    public List<Carro> getCarros() {
        return (List<Carro>) carroDao.findAll();
    }

    @Override
    public Carro getCarro(Carro carro) {
        return carroDao.findById(carro.getIdCarro()).orElse(null);
    }

    @Override
    public void save(Carro carro) {
        carroDao.save(carro);
    }

    @Override
    public void delete(Carro carro) {
        carroDao.delete(carro);
    }
}