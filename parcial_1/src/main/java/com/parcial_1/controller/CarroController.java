package com.parcial_1.controller;

import com.parcial_1.domain.Carro;
import com.parcial_1.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/carro")
public class CarroController {

    @Autowired
    private CarroService carroService;

    @GetMapping("/listado")
    public String listado(Model model) {
        var carros = carroService.getCarros();
        model.addAttribute("carros", carros);
        return "listado";
    }

    @GetMapping("/eliminar/{idCarro}")
    public String eliminar(@PathVariable("idCarro") Long idCarro) {
        Carro carro = new Carro();
        carro.setIdCarro(idCarro);
        carroService.delete(carro);
        return "redirect:/carro/listado";
    }
}