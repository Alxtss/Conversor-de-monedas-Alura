package com.alura.conversor.conversion;

import com.alura.conversor.conexion.ApiConexion;

import java.util.Scanner;

public class PesoArgentinoToDolar {
    private String monedaBase = "ARS";
    private String monedaDeCambio = "USD";
    private int montoDeConversion = 0;

    public void convertirArsToUsd(){

        System.out.println("Ingrese la cantidad en Pesos argentinos(ARS) que desea convertir a Dolares(USD): ");

        Scanner scanner = new Scanner(System.in);
        montoDeConversion = scanner.nextInt();
        ApiConexion apiConexion = new ApiConexion();
        apiConexion.llamarApi(this.monedaBase,this.monedaDeCambio,this.montoDeConversion);
    }
}
