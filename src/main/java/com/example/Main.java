package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
Scanner informacion = new Scanner(System.in);
System.out.println("Ingrese la informacion en edades divididas por comas por cada uno de los habitantes del pueblo: ");
String edad = informacion.nextLine();

String[] edades = edad.split(",");
int[] datos = new int[edades.length];

for (int i= 0; i < edades.length; i++) {

try{datos[i] =  Integer.parseInt(edades[i]);
} catch (NumberFormatException e ) {
    System.out.println("Entrada invalida. Debe ser un numero.");

    
}
}







    }
}