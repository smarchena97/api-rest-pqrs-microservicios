package co.edu.uniquindio.apirest.impl;

import co.edu.uniquindio.apirest.entities.Pqrs;
import co.edu.uniquindio.apirest.repository.PqrsRepository;
import co.edu.uniquindio.apirest.services.PqrsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PqrsServiceImpl implements PqrsService {

    @Autowired
    PqrsRepository pqrsRepository;

    @Override
    public List<Pqrs> listarPqrs() {
        return pqrsRepository.findAll();
    }

    @Override
    public Pqrs guardarPqrs(Pqrs pqrs) {
        return pqrsRepository.save(pqrs);
    }

    @Override
    public Pqrs buscarPorId(Long id) {
        return pqrsRepository.findById(id).get();
    }
}
