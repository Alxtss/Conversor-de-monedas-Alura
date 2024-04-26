package com.alura.conversor.conversion;

import com.alura.conversor.conexion.ApiConexion;

import java.util.Scanner;

public class DolarToPesoColombiano {
    private String monedaBase = "USD";
    private String monedaDeCambio = "COP";
    private int montoDeConversion = 0;

    public void convertirUsdToCop(){

        System.out.println("Ingrese la cantidad en Dolares(USD) que desea convertir a Pesos colombianos(COP): ");

        Scanner scanner = new Scanner(System.in);
        montoDeConversion = scanner.nextInt();
        ApiConexion apiConexion = new ApiConexion();
        apiConexion.llamarApi(this.monedaBase,this.monedaDeCambio,this.montoDeConversion);
    }
}
