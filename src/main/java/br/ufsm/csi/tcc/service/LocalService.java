package br.ufsm.csi.tcc.service;

import br.ufsm.csi.tcc.model.Local;
import br.ufsm.csi.tcc.repository.LocalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalService {

    private final LocalRepository localRepository;

    @Autowired
    public LocalService(LocalRepository localRepository) {
        this.localRepository = localRepository;
    }

    public List<Local> getAllLocals() {
        return localRepository.findAll();
    }

    public List<Local> getLocalsByArea(String nome) {
        return localRepository.findLocalsByArea(nome);
    }

}
