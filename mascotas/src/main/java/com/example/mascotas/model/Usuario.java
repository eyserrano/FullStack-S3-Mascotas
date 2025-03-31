package com.example.mascotas.model;
/**
 * Clase que representa un usuario dentro del sistema de viajes con mascotas.
 * Puede tener el rol de "dueño de mascota" o "conductor pet-friendly".
 * Proyecto: Microservicio de Gestión de Usuarios - Semana 3
 * Asignatura: Desarrollo FullStack I (DSY2201)
 * Corresponde a la semana 3
 * Fecha: 30-03-2025
 * Autor: Yonny Serrano
 */
public class Usuario{

    private int id;
    private String nombre;
    private String email;
    private String rol;

    public Usuario(int id, String nombre, String email, String rol) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.rol = rol;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEmail() { return email; }
    public String getRol() { return rol; }

    public void setId(int id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setEmail(String email) { this.email = email; }
    public void setRol(String rol) { this.rol = rol; }
}
