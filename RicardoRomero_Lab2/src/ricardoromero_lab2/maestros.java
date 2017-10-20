/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ricardoromero_lab2;

import java.util.ArrayList;

/**
 *
 * @author ricky
 */
public class maestros {
    private String nombre;
    private String titulo;
    private String maestria;
    private int salario;
    private String usuario;
    private String contraseña;
    private String cant_max_clases;
    ArrayList<String> lista = new ArrayList();

    public maestros() {
    }

    public maestros(String nombre, String titulo, String maestria, int salario, String usuario, String contraseña, String cant_max_clases) {
        this.nombre = nombre;
        this.titulo = titulo;
        this.maestria = maestria;
        this.salario = salario;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.cant_max_clases = cant_max_clases;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMaestria() {
        return maestria;
    }

    public void setMaestria(String maestria) {
        this.maestria = maestria;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCant_max_clases() {
        return cant_max_clases;
    }

    public void setCant_max_clases(String cant_max_clases) {
        this.cant_max_clases = cant_max_clases;
    }

    public ArrayList<String> getLista() {
        return lista;
    }

    public void setLista(ArrayList<String> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "maestros{" + "nombre=" + nombre + ", titulo=" + titulo + ", maestria=" + maestria + ", salario=" + salario + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", cant_max_clases=" + cant_max_clases + ", lista=" + lista + '}';
    }
    
}
