package br.ufsm.csi.tcc.controller;

import br.ufsm.csi.tcc.model.Local;
import br.ufsm.csi.tcc.service.LocalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("local")
public class LocalController {

    private final LocalService localService;

    @Autowired
    public LocalController(LocalService localService) {
        this.localService = localService;
    }

    @GetMapping
    List<Local> getAllLocals() {
        return localService.getAllLocals();
    }

    @GetMapping("area")
    List<Local> getLocalsByArea(@RequestParam String nome) {
        return localService.getLocalsByArea(nome);
    }

}
