package br.com.treinaweb.ediaristas.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.treinaweb.ediaristas.core.enums.Icone;
import br.com.treinaweb.ediaristas.core.models.Servico;

@Controller
@RequestMapping("/admin/servicos")
public class ServicoController {

    @RequestMapping("/cadastrar")
    public ModelAndView cadastrar() {
        var modelAndView = new ModelAndView("admin/servico/form");

        modelAndView.addObject("servico", new Servico());

        return modelAndView;
    }

    // icons available to all views as an attribute
    @ModelAttribute("icones")
    public Icone[] getIcones() {
        return Icone.values();
    }
}
