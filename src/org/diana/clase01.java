package org.diana;

public class clase01 {
    public static void datosalumno(String nombre, String Apellido, int edad, String sexo, int matricula) {
        System.out.println("El alumno se llama"  +  nombre  +  Apellido  +   "tiene "
                + edad  +  " años "  +  " su sexo es " + sexo
                + "su numero de matricula es: " + matricula);

    }

    public  void registrarAlumno() {
        datosalumno("Diane", "Garcia", 21, "femenino", 21009);
    }
    public static void banda(String nombre,String origen, int año, String cancion,
                             double reproducciones ) {
        System.out.println("La banda " + nombre + " es un grupo de origen"  +  origen +
                " que tiene" + año + "años desde que compuso su primer sencillo" + cancion +
                "que cuenta con mas de"  +  reproducciones  + "millones de reproducciones");
    }

        public void datosdelabanda() {
            banda("Morat", "Bogota",7,"Mi nuevo vicio", 80.7);

        }
}
