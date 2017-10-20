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
        while (!op.equals("r")) {
            op = JOptionPane.showInputDialog(""
                    + "a-Administracion\n"
                    + "b-Matricula\n"
                    + "c-Login\n"
                    + "d-listar Clases\n"
                    + "e-Listar Maestro\n"
                    + "f-Listar Alumno"
                    + "s-Salir"
                    + "");
            if (op.equals("a")) {
                if (c.isEmpty()) {
                    String nombre;
                    String seccion;
                    int cant_max_etudiant;
                    String maestro;
                    int unid_valorativas;

                    nombre = JOptionPane.showInputDialog("Ingresar Nombre de la clase: ");
                    seccion = JOptionPane.showInputDialog("Ingresar Sección de la clase: ");
                    cant_max_etudiant = Integer.parseInt(JOptionPane.showInputDialog("Ingresar Máximo de Estudiantes: "));
                    maestro = JOptionPane.showInputDialog("Ingresar Maestro: ");
                    unid_valorativas = Integer.parseInt(JOptionPane.showInputDialog("Ingresar Unidades Valorativas: "));

                    c.add(new clases(nombre, seccion, cant_max_etudiant, null, unid_valorativas));
                    JOptionPane.showMessageDialog(null, "Clase Agregada Exitosamente");

                } else {
                    String opn = "";
                    while (!opn.equals("c")) {
                        opn = JOptionPane.showInputDialog(""
                                + "a-Agregar Maestro\n"
                                + "b-Agregar Clase\n"
                                + "c-Regresar\n"
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
                            if (clases2 > cant_max_clases) {
                                JOptionPane.showMessageDialog(null, "Se Excede de Clases");
                            } else {
                                for (int i = 0; i < clases2; i++) {
                                    String seccion;
                                    seccion = JOptionPane.showInputDialog(null, "Numero de Seccion: ");
                                    maestro.lista.add(seccion);
                                }
                            }
                            m.add(maestro);
                            JOptionPane.showMessageDialog(null, "Maestro Agregado Exitosamente");
                        }
                        if (opn.equals("b")) {
                            String nombre;
                            String seccion;
                            int cant_max_etudiant;
                            String maestro;
                            int unid_valorativas;

                            nombre = JOptionPane.showInputDialog("Ingresar Nombre de la clase: ");
                            seccion = JOptionPane.showInputDialog("Ingresar Sección de la clase: ");
                            cant_max_etudiant = Integer.parseInt(JOptionPane.showInputDialog("Ingresar Máximo de Estudiantes: "));
                            maestro = JOptionPane.showInputDialog("Ingresar Maestro: ");
                            unid_valorativas = Integer.parseInt(JOptionPane.showInputDialog("Ingresar Unidades Valorativas: "));

                            c.add(new clases(nombre, seccion, cant_max_etudiant, null, unid_valorativas));
                            JOptionPane.showMessageDialog(null, "Clase Agregada Exitosamente");
                        }
                    }
                }
            }
            if (op.equals("b")) {
                String nombre;
                int numero_cuenta;
                String carrera;
                int edad;
                double dinero_dispo;
                String usuario;
                String contra;
                
                nombre = JOptionPane.showInputDialog("Ingresar Nombre del Alumno: ");
                numero_cuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingresar numero de Cuenta: "));
                carrera = JOptionPane.showInputDialog("Ingresar su Carrera: ");
                edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Edad: "));
                dinero_dispo = Double.parseDouble(JOptionPane.showInputDialog("Ingresar su cantidad de Dinero: "));
                usuario = JOptionPane.showInputDialog("Ingresar un Usuario: ");
                contra = JOptionPane.showInputDialog("Ingresar una Contraseña: ");
                
                a.add(new alumnos(nombre, numero_cuenta, carrera, edad, dinero_dispo, usuario, contra));
                JOptionPane.showMessageDialog(null, "Ha sido Registrado Existosamente");
                
            }

            if (op.equals("c")) {

            }

            if (op.equals("d")) {
                String p = "";
                for (clases t : c) {
                    if (t instanceof clases) {
                        p += c.indexOf(t) + "" + "-" + t + "\n";
                    }
                }
                JOptionPane.showMessageDialog(null, p);

            }

            if (op.equals("e")) {
                String p = "";
                for (maestros t : m) {
                    if (t instanceof maestros) {
                        p += m.indexOf(t) + "" + "-" + t + "\n";
                    }
                }
                JOptionPane.showMessageDialog(null, p);
            }

            if (op.equals("f")) {

            }
        }
    }
}
