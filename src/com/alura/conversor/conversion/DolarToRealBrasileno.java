package com.alura.conversor.conversion;

import com.alura.conversor.conexion.ApiConexion;

import java.util.Scanner;

public class DolarToRealBrasileno implements IConversion{
    private String monedaBase = "USD";
    private String monedaDeCambio = "BRL";
    private double montoDeConversion = 0;

    @Override
    public void convertir() {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Ingrese la cantidad en Dolares(USD) que desea convertir a Reales brasileños(BRL): ");
        System.out.println("---------------------------------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextDouble()) {
            System.out.println("Por favor, ingrese un número válido sin letras ni simbolos.");
            scanner.next(); // Limpia el búfer del teclado
        }

        montoDeConversion = scanner.nextDouble();

        ApiConexion apiConexion = new ApiConexion();
        apiConexion.llamarApi(monedaBase,monedaDeCambio,montoDeConversion);
    }
}
