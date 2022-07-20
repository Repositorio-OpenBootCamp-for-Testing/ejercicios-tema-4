package com.ejercicios.main;

public class Tema_4 {
    public static void main(String[] args) {
        // Condicionales if: Validar si es positivo, negativo o cero.
        int numerolf = 4;
        if (numerolf > 0)
            System.out.println("El número es positivo.");
        else if (numerolf < 0)
            System.out.println("El número es negativo.");
        else
            System.out.println("El número es cero.");

        // Bucle While
        int numeroWhile = 0;
        while (numeroWhile < 3)
        {
            System.out.println("El dato es: " + numeroWhile);
            numeroWhile++;
        }

        // Bucle Do-While
        do {
            System.out.println("El resultado es: " + numeroWhile);
            numeroWhile++;
        } while (numeroWhile < 3);

        // Bucle For
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++)
        {
            System.out.println("El valor es: " + numeroFor);
        }

        // Switch (estaciones)
        String estacion = "INVIERNO";
        switch (estacion)
        {
            case "VERANO":
                System.out.println("La estación es verano.");
                break;
            case "INVIERNO":
                System.out.println("La estación es invierno.");
                break;
            case "OTOÑO":
                System.out.println("La estación es otoño.");
                break;
            case "PRIMAVERA":
                System.out.println("La estación es primavera.");
                break;
            default:
                System.out.println("No es una estación.");
        }
    }
}