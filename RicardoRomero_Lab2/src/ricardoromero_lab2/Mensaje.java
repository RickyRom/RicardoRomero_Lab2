/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ricardoromero_lab2;

/**
 *
 * @author ricky
 */
public class Mensaje {
    private String titulo;
    private String emisor;
    private String receptor;
    private String cuerpo;
    private int nivel_importancia;

    public Mensaje() {
    }

    public Mensaje(String titulo, String emisor, String receptor, String cuerpo, int nivel_importancia) {
        this.titulo = titulo;
        this.emisor = emisor;
        this.receptor = receptor;
        this.cuerpo = cuerpo;
        this.nivel_importancia = nivel_importancia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public int getNivel_importancia() {
        return nivel_importancia;
    }

    public void setNivel_importancia(int nivel_importancia) {
        this.nivel_importancia = nivel_importancia;
    }

    @Override
    public String toString() {
        return titulo;
    }
    
}
