package co.edu.uniquindio.apirest.services;

import co.edu.uniquindio.apirest.entities.Pqrs;

import java.util.List;

public interface PqrsService {

    public List<Pqrs> listarPqrs();

    public Pqrs guardarPqrs(Pqrs pqrs);
}
