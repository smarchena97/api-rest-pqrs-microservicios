package co.edu.uniquindio.apirest.controllers;

import co.edu.uniquindio.apirest.entities.Pqrs;
import co.edu.uniquindio.apirest.services.PqrsService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class PeticionController {

    @Autowired
    private PqrsService pqrsService;

    @ApiOperation(value = "obtener todas las pqrs")
    @GetMapping("")
    public List<Pqrs> listAllPqrs(){
        return pqrsService.listarPqrs();
    }

    @GetMapping("/{id}")
    public Pqrs buscarPqrs(@PathVariable("id") Long id){
        return pqrsService.buscarPorId(id);
    }

    @PostMapping("")
    public Pqrs guardarPqrs(@RequestBody Pqrs pqrs){
        return pqrsService.guardarPqrs(pqrs);
    }


}
