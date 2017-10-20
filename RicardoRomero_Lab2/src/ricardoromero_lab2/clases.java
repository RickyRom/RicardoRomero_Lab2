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
public class clases {
    private String nombre;
    private String seccion;
    private int cant_max_etudiant;
    private String maestro;
    private int unid_valorativas;
    ArrayList<alumnos> list = new ArrayList();

    public clases() {
    }

    public clases(String nombre, String seccion, int cant_max_etudiant, String maestro, int unid_valorativas) {
        this.nombre = nombre;
        this.seccion = seccion;
        this.cant_max_etudiant = cant_max_etudiant;
        this.maestro = maestro;
        this.unid_valorativas = unid_valorativas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public int getCant_max_etudiant() {
        return cant_max_etudiant;
    }

    public void setCant_max_etudiant(int cant_max_etudiant) {
        this.cant_max_etudiant = cant_max_etudiant;
    }

    public String getMaestro() {
        return maestro;
    }

    public void setMaestro(String maestro) {
        this.maestro = maestro;
    }

    public int getUnid_valorativas() {
        return unid_valorativas;
    }

    public void setUnid_valorativas(int unid_valorativas) {
        this.unid_valorativas = unid_valorativas;
    }

    public ArrayList<alumnos> getList() {
        return list;
    }

    public void setList(ArrayList<alumnos> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "clases{" + "nombre=" + nombre + ", seccion=" + seccion + ", cant_max_etudiant=" + cant_max_etudiant + ", maestro=" + maestro + ", unid_valorativas=" + unid_valorativas + ", list=" + list + '}';
    }
    
    
}
