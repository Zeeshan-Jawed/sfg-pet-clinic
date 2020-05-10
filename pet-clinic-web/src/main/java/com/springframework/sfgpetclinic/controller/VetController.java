package com.springframework.sfgpetclinic.controller;

import com.springframework.sfgpetclinic.service.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {
    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets","/vets.html"})
    public String listVet(Model model){
        model.addAttribute("vets",vetService.findAll());
        return "vet/index";
    }
}
