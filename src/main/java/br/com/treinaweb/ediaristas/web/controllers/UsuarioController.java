package br.com.treinaweb.ediaristas.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.treinaweb.ediaristas.web.dtos.UsuarioCadastroForm;
import br.com.treinaweb.ediaristas.web.services.WebServiceUsuario;

@Controller
@RequestMapping("/admin/usuarios")
public class UsuarioController {

    @Autowired
    private WebServiceUsuario service;
    
    @GetMapping
    public ModelAndView buscarTodos() {
        var modelAndView = new ModelAndView("admin/usuario/lista");

        modelAndView.addObject("usuarios", service.buscarTodos());

        return modelAndView;
    }

    @GetMapping("/cadastrar")
    public ModelAndView cadastrar() {
        var modelAndView = new ModelAndView("admin/usuario/cadastro-form");

        modelAndView.addObject("cadastroForm", new UsuarioCadastroForm());

        return modelAndView;
    }
}
