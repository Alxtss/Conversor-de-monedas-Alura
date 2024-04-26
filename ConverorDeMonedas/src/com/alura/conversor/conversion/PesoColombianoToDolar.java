package com.alura.conversor.conversion;

import com.alura.conversor.conexion.ApiConexion;

import java.util.Scanner;

public class PesoColombianoToDolar {
    private String monedaBase = "COP";
    private String monedaDeCambio = "USD";
    private int montoDeConversion = 0;

    public void convertirCopToUsd(){

        System.out.println("Ingrese la cantidad en Pesos colombianos(COP) que desea convertir a Dolares(USD): ");

        Scanner scanner = new Scanner(System.in);
        montoDeConversion = scanner.nextInt();
        ApiConexion apiConexion = new ApiConexion();
        apiConexion.llamarApi(this.monedaBase,this.monedaDeCambio,this.montoDeConversion);
    }
}
