/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ricardoromero_lab2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ricky
 */
public class RicardoRomero_Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<maestros> m = new ArrayList();
        ArrayList<clases> c = new ArrayList();
        ArrayList<alumnos> a = new ArrayList();
        String op = "";
        while (!op.equals("e")) {
            op = JOptionPane.showInputDialog(""
                    + "a-Administracion\n"
                    + "b-Matricula\n"
                    + "c-Login\n"
                    + "d-listar\n"
                    + "e-salir\n"
                    + "");
            if (op.equals("a")) {
                if (c.isEmpty()) {
                    String nombre;
                    String seccion;
                    int cant_max_etudiant;
                    String maestro;
                    int unid_valorativas;

                    nombre = JOptionPane.showInputDialog("Ingresar Nombre: ");
                    seccion = JOptionPane.showInputDialog("Ingresar Sección: ");
                    cant_max_etudiant = Integer.parseInt(JOptionPane.showInputDialog("Ingresar Máximo de Estudiantes: "));
                    maestro = JOptionPane.showInputDialog("Ingresra Maestro: ");
                    unid_valorativas = Integer.parseInt(JOptionPane.showInputDialog("Ingresar Unidades Valorativas: "));

                    c.add(new clases(nombre, seccion, cant_max_etudiant, null, unid_valorativas));
                    JOptionPane.showMessageDialog(null, "Clase Agregada Exitosamente");
                } else {
                    String opn = "";
                    while (!opn.equals("d")) {
                        opn = JOptionPane.showInputDialog(""
                                + "a-Agregar Maestro\n"
                                + "b-Matricula\n"
                                + "c-Login\n"
                                + "");
                        if (opn.equals("a")) {
                            String nombre;
                            String titulo;
                            String maestria;
                            int salario, clases2;
                            String usuario;
                            String contraseña;
                            int cant_max_clases;
                            maestros maestro;
                            
                            nombre = JOptionPane.showInputDialog("Ingrese su Nombre: ");
                            titulo = JOptionPane.showInputDialog("Ingrese su Titulo: ");
                            maestria = JOptionPane.showInputDialog("Ingrese su Maestria: ");
                            salario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Salario: "));
                            usuario = JOptionPane.showInputDialog("Elija un Usuario: ");
                            contraseña = JOptionPane.showInputDialog("Elija una Contraseña: ");
                            cant_max_clases = Integer.parseInt(JOptionPane.showInputDialog("Seleccione la maxima cantidad de clases: "));
                            
                            maestro = new maestros(nombre, titulo, maestria, salario, usuario, contraseña, cant_max_clases);
                            clases2 = Integer.parseInt(JOptionPane.showInputDialog("Cuantas clases Imparte"));
                            if(clases2 > cant_max_clases) {
                                JOptionPane.showMessageDialog(null, "Se Excede de Clases");
                            }else{
                                for (int i = 0; i < clases2; i++) {
                                    String seccion;
                                    seccion = JOptionPane.showInputDialog(null, "Numero de Seccion: ");
                                }
                            }
                        }
                    }

                }
                if (op.equals("b")) {

                }

                if (op.equals("c")) {

                }

                if (op.equals("d")) {

                }
            }
        }
    }
}
