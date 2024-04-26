package com.alura.conversor.conversion;

import com.alura.conversor.conexion.ApiConexion;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class DolarToPesoArg{

    private String monedaBase = "USD";
    private String monedaDeCambio = "ARS";
    private int montoDeConversion = 0;

    public void convertirUsdToArs(){

        System.out.println("Ingrese la cantidad en Dolares(USD) que desea convertir a Pesos argentinos(ARS): ");

        Scanner scanner = new Scanner(System.in);
        montoDeConversion = scanner.nextInt();
        ApiConexion apiConexion = new ApiConexion();
        apiConexion.llamarApi(this.monedaBase,this.monedaDeCambio,this.montoDeConversion);
    }
}
