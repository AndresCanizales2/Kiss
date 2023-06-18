package com.KissApp.component.Usuario;


public class CardData {



    private String usuarioName;
    private String nombre;
    private int edad;
    private String imagen;
    private String descripcion;
    public CardData(String usuarioName, String nombre, int edad, String imagen, String descripcion) {
        this.usuarioName = usuarioName;
        this.nombre = nombre;
        this.edad = edad;
        this.imagen = imagen;
        this.descripcion = descripcion;
    }
    public String getUsuarioName() {
        return usuarioName;
    }

    public void setUsuarioName(String usuarioName) {
        this.usuarioName = usuarioName;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

