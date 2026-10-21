/**
 * Batiz Java Academy - CECyT 9 "Juan de Dios Batiz"
 * Programa de practica para Doane ("Omi")
 * 
 * Instrucciones en la terminal (CMD, PowerShell o Git Bash):
 * 1. Compilar: javac CombateOmi.java
 * 2. Ejecutar:  java CombateOmi
 */
public class CombateOmi {

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("   BATIZ JAVA ACADEMY - DOJO DE OMI               ");
        System.out.println("==================================================");

        // 1. Variables y Tipos de Datos Primitivos
        String nombre = "Doane (Omi)";
        int cinturonKup = 2; // Cinta Roja (Avanzado)
        double energia = 100.0;
        boolean listaParaCompetir = true;

        System.out.println("Estudiante: " + nombre);
        System.out.println("Nivel: " + cinturonKup + " Kup");

        // 2. Estructura Condicional (if - else)
        if (listaParaCompetir && energia >= 80.0) {
            System.out.println("Estado: Optimo! Lista para la arena de combate.");
        } else {
            System.out.println("Estado: Descanso y recuperacion de energia.");
        }

        System.out.println("\n--- 3. Estructura Ciclica (for): 5 Rounds de Entrenamiento ---");
        // Bucle for: Conocemos exactamente el numero de repeticiones
        for (int round = 1; round <= 5; round++) {
            System.out.println("Round " + round + ": Tecnica de guardia y patada circular!");
        }

        System.out.println("\n--- 4. Estructura Selectiva (switch): Grado Marcial ---");
        // Switch evaluando el grado
        switch (cinturonKup) {
            case 10:
                System.out.println("Cinta Blanca: Inicio del camino marcial.");
                break;
            case 6:
                System.out.println("Cinta Verde: Fuerza y crecimiento tecnico.");
                break;
            case 2:
                System.out.println("Cinta Roja: Precision, control y combate tactico.");
                break;
            case 1:
                System.out.println("Cinta Negra: Maestria total.");
                break;
            default:
                System.out.println("Grado en proceso de evaluacion.");
                break;
        }

        System.out.println("\n==================================================");
        System.out.println("Playlist post-entrenamiento: Dua Lipa - Levitating");
        System.out.println("Practica finalizada con exito! Mucho exito en la Batiz, Omi!");
        System.out.println("==================================================");
    }
}
