package com.KissApp.component.Usuario;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serial;
import java.io.Serializable;
import java.util.Base64;

@Document(collection = "usuarios")
public class UsuarioEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    @Field("userName")
    private String userName;
    @Field("nombre")
    private String nombre;
    @Field("apellido")
    private String apellido;
    @Field("password")
    private String password;
    @Field("telefono")
    private String telefono;
    @Field("edad")
    private String edad;
    @Field("altura")
    private String altura;
    @Field("genero")
    private String genero;
    @Field("localizacion")
    private String ciudad;
    @Field("marcaCoche")
    private String coche;
    @Field("musica_favorita")
    private String musica_favorita;
    @Field("salario")
    private String salario;
    @Field("UrlFotoUsuario")
    private String  UrlFotoUsuario;
    @Field("textArea")
    private String textArea;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCoche() {
        return coche;
    }

    public void setCoche(String coche) {
        this.coche = coche;
    }

    public String getMusica_favorita() {
        return musica_favorita;
    }

    public void setMusica_favorita(String musica_favorita) {
        this.musica_favorita = musica_favorita;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }





    public String getTextArea() {
        return textArea;
    }

    public void setTextArea(String textArea) {
        this.textArea = textArea;
    }

    public String getUrlFotoUsuario() {
        return UrlFotoUsuario;
    }

    public void setUrlFotoUsuario(String urlFotoUsuario) {
        UrlFotoUsuario = urlFotoUsuario;
    }




}
