package com.example.mascotas.controller;

import org.springframework.web.bind.annotation.*;

import com.example.mascotas.model.Usuario;

import java.util.ArrayList;
import java.util.List;
/**
 * Controlador REST para la gestión de usuarios en la app de viajes con mascotas.
 * Nos Permite consultar la lista completa de usuarios o bien, uno en específico
 *  según su ID.
 * Proyecto: Microservicio de Gestión de Usuarios - Semana 3
 * Asignatura: Desarrollo FullStack I (DSY2201)
 * Fecha: 30-03-2025
 * Autor: Yonny Serrano
 **/
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private List<Usuario> usuarios = new ArrayList<>();

    public UsuarioController() {
        usuarios.add(new Usuario(1, "Eva Muñoz", "eva.muñoz.1975@gmail_ejemplo.com", "dueño de mascota"));
        usuarios.add(new Usuario(2, "Yonny Serrano", "yserrano.1971@gmail_ejemplo.com", "dueño de mascota"));
        usuarios.add(new Usuario(3, "Cecilia Muñoz", "cecilia.muñoz.1970@gmail_ejemplo.com", "dueño de mascota"));
        usuarios.add(new Usuario(4, "Sigifredo Contreras", "sigi1965@gmail_ejemplo.com", "conductor pet-friendly"));
    }

    // GET /usuarios
    @GetMapping
    public List<Usuario> obtenerTodos() {
        return usuarios;
    }

    // GET /usuarios/{id}
    @GetMapping("/{id}")
    /* return Datos del Usuario si existe, o null si no se encuentra */
    public Usuario obtenerPorId(@PathVariable int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }
}
