package com.alura.conversor.conversion;

import com.alura.conversor.conexion.ApiConexion;

import java.util.Scanner;

public class RealBrasilenoToDolar {
    private String monedaBase = "BRL";
    private String monedaDeCambio = "USD";
    private int montoDeConversion = 0;

    public void convertirBrlToUsd(){

        System.out.println("Ingrese la cantidad en Reales brasileños(BRL) que desea convertir a Dolares(USD): ");

        Scanner scanner = new Scanner(System.in);
        montoDeConversion = scanner.nextInt();
        ApiConexion apiConexion = new ApiConexion();
        apiConexion.llamarApi(this.monedaBase,this.monedaDeCambio,this.montoDeConversion);
    }
}
