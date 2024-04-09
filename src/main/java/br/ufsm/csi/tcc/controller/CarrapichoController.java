package br.ufsm.csi.tcc.controller;

import br.ufsm.csi.tcc.model.Carrapicho;
import br.ufsm.csi.tcc.service.CarrapichoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("carrapicho")
public class CarrapichoController {

    private final CarrapichoService carrapichoService;

    @Autowired
    public CarrapichoController(CarrapichoService carrapichoService) {
        this.carrapichoService = carrapichoService;
    }

    @GetMapping
    List<Carrapicho> getAllCarrapicho() {
        return carrapichoService.getAllCarrapichos();
    }

    @GetMapping("first20")
    List<Carrapicho> getFirst20Carrapichos() {
        return carrapichoService.getFirst20Carrapichos();
    }

}
