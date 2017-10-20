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
public class alumnos {
    private String nombre;
    private int numero_cuenta;
    private String carrera;
    private int edad;
    private double dinero_dispo;
    private String usuario;
    private String contra;
    ArrayList<String> listas = new ArrayList();
    ArrayList<mensajes> buzon = new ArrayList();

    public alumnos() {
    }

    public alumnos(String nombre, int numero_cuenta, String carrera, int edad, double dinero_dispo, String usuario, String contra) {
        this.nombre = nombre;
        this.numero_cuenta = numero_cuenta;
        this.carrera = carrera;
        this.edad = edad;
        this.dinero_dispo = dinero_dispo;
        this.usuario = usuario;
        this.contra = contra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(int numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDinero_dispo() {
        return dinero_dispo;
    }

    public void setDinero_dispo(double dinero_dispo) {
        this.dinero_dispo = dinero_dispo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public ArrayList<String> getListas() {
        return listas;
    }

    public void setListas(ArrayList<String> listas) {
        this.listas = listas;
    }

    public ArrayList<mensajes> getBuzon() {
        return buzon;
    }

    public void setBuzon(ArrayList<mensajes> buzon) {
        this.buzon = buzon;
    }

    @Override
    public String toString() {
        return "alumnos{" + "nombre=" + nombre + ", numero_cuenta=" + numero_cuenta + ", carrera=" + carrera + ", edad=" + edad + ", dinero_dispo=" + dinero_dispo + ", usuario=" + usuario + ", contra=" + contra + ", listas=" + listas + ", buzon=" + buzon + '}';
    }
    
}
