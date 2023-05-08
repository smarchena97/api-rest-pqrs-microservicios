package co.edu.uniquindio.apirest.controllers;

import co.edu.uniquindio.apirest.entities.Pqrs;
import co.edu.uniquindio.apirest.impl.PqrsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/form")
public class formController {

    @Autowired
    private PqrsServiceImpl pqrsService;

    @GetMapping("")
    public String mostrarFormulario(Model model){
        Pqrs pqrs = new Pqrs();
        model.addAttribute("titulo","Crear PQRS");
        model.addAttribute("pqrs",pqrs);
        return "formPQRS";
    }

    @PostMapping("/guardar")
    public String guardarPqrs(Pqrs pqrs){
        pqrsService.guardarPqrs(pqrs);
        return "redirect:/form";
    }


}
