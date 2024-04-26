package com.alura.conversor.conversion;

import com.alura.conversor.conexion.ApiConexion;

import java.util.Scanner;

public class DolarToRealBrasileno {
    private String monedaBase = "USD";
    private String monedaDeCambio = "BRL";
    private int montoDeConversion = 0;

    public void convertirUsdToBrl(){

        System.out.println("Ingrese la cantidad en Dolares(USD) que desea convertir a Reales brasileños(BRL): ");

        Scanner scanner = new Scanner(System.in);
        montoDeConversion = scanner.nextInt();
        ApiConexion apiConexion = new ApiConexion();
        apiConexion.llamarApi(this.monedaBase,this.monedaDeCambio,this.montoDeConversion);
    }
}
