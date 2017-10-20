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
                int numero_cuenta, pos;
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

                String p = "";
                for (clases t : c) {
                    if (t instanceof clases) {
                        p += c.indexOf(t) + "" + "-" + t + "\n";
                    }
                }
                JOptionPane.showMessageDialog(null, p);

                pos = Integer.parseInt(JOptionPane.showInputDialog(" " + "Elija la posicion de la clase a matricular"));
                JOptionPane.showMessageDialog(null, "Clase Matriculada Exitosamente");
            }

            if (op.equals("c")) {
                String opcion = "";
                while (!opcion.equals("c")) {
                    opcion = JOptionPane.showInputDialog(""
                            + "a-Login Maestro\n"
                            + "b-Login Alumno\n"
                            + "c-Regresar\n"
                            + "");
                    if (opcion.equals("a")) {
                        String name, Pword;
                        int i;
                        String nombre;
                        String titulo;
                        String maestria;
                        int salario;
                        String usuario;
                        String contraseña;
                        boolean es = false;

                        do {
                            name = JOptionPane.showInputDialog("Ingrese su usuario");
                            Pword = JOptionPane.showInputDialog("Ingrese su contraseña");
                            for (Object o : m) {
                                if (o instanceof maestros) {
                                    if (((maestros) o).getUsuario().equals(name) && ((maestros) o).getContraseña().equals(Pword)) {
                                        es = true;
                                        JOptionPane.showMessageDialog(null, "SESION INICIADA EXITOSAMENTE");
                                        JOptionPane.showMessageDialog(null, "BIENVENIDO: " + name);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "INGRESE UN USUARIO CORRECTO");
                                        JOptionPane.showMessageDialog(null, "SESION NO PUDO SER INICIADA");
                                    }
                                }
                            }
                        } while (es == false);
                        String opci = "";
                        while (!opci.equals("c")) {
                            opci = JOptionPane.showInputDialog(""
                                    + "a-Modificar Datos\n"
                                    + "b-Listar Alumnos\n"
                                    + "c-Regresar\n"
                                    + "");
                            if (opci.equals("a")) {
                                i = Integer.parseInt(JOptionPane.showInputDialog("pocision a modificar"));
                                nombre = JOptionPane.showInputDialog("Ingrese nuevo Nombre: ");
                                titulo = JOptionPane.showInputDialog("Ingrese nuevo Titulo: ");
                                maestria = JOptionPane.showInputDialog("Ingrese nueva Maestria: ");
                                salario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nuevo Salario: "));
                                usuario = JOptionPane.showInputDialog("Elija nuevo Usuario: ");
                                contraseña = JOptionPane.showInputDialog("Elija nueva Contraseña: ");

                                ((maestros) m.get(i)).setNombre(nombre);
                                ((maestros) m.get(i)).setTitulo(titulo);
                                ((maestros) m.get(i)).setMaestria(maestria);
                                ((maestros) m.get(i)).setSalario(salario);
                                ((maestros) m.get(i)).setUsuario(usuario);
                                ((maestros) m.get(i)).setContraseña(contraseña);
                            }

                            if (opci.equals("b")) {

                            }
                        }
                    }

                    if (opcion.equals("b")) {
                        String name, Pword;
                        boolean es = false;
                        int i;
                        String nombre;
                        int numero_cuenta, pos;
                        String carrera;
                        int edad;
                        double dinero_dispo;
                        String usuario;
                        String contra;

                        do {
                            name = JOptionPane.showInputDialog("Ingrese su usuario");
                            Pword = JOptionPane.showInputDialog("Ingrese su contraseña");
                            for (Object o : a) {
                                if (o instanceof alumnos) {
                                    if (((alumnos) o).getUsuario().equals(name) && ((alumnos) o).getContra().equals(Pword)) {
                                        es = true;
                                        JOptionPane.showMessageDialog(null, "SESION INICIADA EXITOSAMENTE");
                                        JOptionPane.showMessageDialog(null, "BIENVENIDO: " + name);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "INGRESE UN USUARIO CORRECTO");
                                        JOptionPane.showMessageDialog(null, "SESION NO PUDO SER INICIADA");
                                    }
                                }
                            }
                        } while (es == false);
                        String option = "";
                        while (!option.equals("d")) {
                            option = JOptionPane.showInputDialog(""
                                    + "a-Modificar Datos\n"
                                    + "b-Listar clases\n"
                                    + "c-Regresar\n"
                                    + "");
                            if (option.equals("a")) {
                                i = Integer.parseInt(JOptionPane.showInputDialog("pocision a modificar"));
                                nombre = JOptionPane.showInputDialog("Ingresar nuevo Nombre del Alumno: ");
                                numero_cuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingresar nuevo numero de Cuenta: "));
                                carrera = JOptionPane.showInputDialog("Ingresar nueva Carrera: ");
                                edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nueva Edad: "));
                                dinero_dispo = Double.parseDouble(JOptionPane.showInputDialog("Ingresar nueva cantidad de Dinero: "));
                                usuario = JOptionPane.showInputDialog("Ingresar nuevo Usuario: ");
                                contra = JOptionPane.showInputDialog("Ingresar nueva Contraseña: ");
                                
                                ((alumnos)a.get(i)).setNombre(nombre);
                                ((alumnos)a.get(i)).setNumero_cuenta(numero_cuenta);
                                ((alumnos)a.get(i)).setCarrera(carrera);
                                ((alumnos)a.get(i)).setEdad(edad);
                                ((alumnos)a.get(i)).setDinero_dispo(dinero_dispo);
                                ((alumnos)a.get(i)).setUsuario(usuario);
                                ((alumnos)a.get(i)).setContra(contra);
                            }
                        }
                    }
                }
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
                String p = "";
                for (alumnos t : a) {
                    if (t instanceof alumnos) {
                        p += a.indexOf(t) + "" + "-" + t + "\n";
                    }
                }
                JOptionPane.showMessageDialog(null, p);
            }
        }
    }

}
