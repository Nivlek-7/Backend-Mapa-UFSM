package br.ufsm.csi.tcc.service;

import br.ufsm.csi.tcc.model.Carrapicho;
import br.ufsm.csi.tcc.repository.CarrapichoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarrapichoService {

    private final CarrapichoRepository carrapichoRepository;

    @Autowired
    public CarrapichoService(CarrapichoRepository carrapichoRepository) {
        this.carrapichoRepository = carrapichoRepository;
    }

    public List<Carrapicho> getAllCarrapichos() {
        return carrapichoRepository.findAll();
    }

    public List<Carrapicho> getFirst20Carrapichos() {
        return carrapichoRepository.findFirst20Carrapichos();
    }
}
