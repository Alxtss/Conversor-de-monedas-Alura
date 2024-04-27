package com.alura.conversor.principal;

import com.alura.conversor.conversion.*;

import java.util.Scanner;

public class Menu {
    public void getMenu() throws InterruptedException {

        String menu = """
            
            ***********************************************
                           MENU DE OPCIONES
            ***********************************************
             
             1) Dolar =>> Peso argentino
             2) Peso argentino =>> Dolar
             3) Dolar =>> Real brasileño
             4) Real brasileño =>> Dolar
             5) Dolar =>> Peso colombiano
             6) Peso colombino =>> Dolar
             7) Salir
             
             Escriba una opcion valida:             
            ***********************************************
             """;

        int seleccion;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println(menu);
            seleccion = scanner.nextInt();
            switch (seleccion) {
                case 1:
                    DolarToPesoArg dolarToPesoArg = new DolarToPesoArg();
                    dolarToPesoArg.convertir();
                    break;
                case 2:
                    PesoArgentinoToDolar pesoArgentinoToDolar = new PesoArgentinoToDolar();
                    pesoArgentinoToDolar.convertir();
                    break;
                case 3:
                    DolarToRealBrasileno dolarToRealBrasileno = new DolarToRealBrasileno();
                    dolarToRealBrasileno.convertir();
                    break;
                case 4:
                    RealBrasilenoToDolar realBrasilenoToDolar = new RealBrasilenoToDolar();
                    realBrasilenoToDolar.convertir();
                    break;
                case 5:
                    DolarToPesoColombiano dolarToPesoColombiano = new DolarToPesoColombiano();
                    dolarToPesoColombiano.convertir();
                    break;
                case 6:
                    PesoColombianoToDolar pesoColombianoToDolar = new PesoColombianoToDolar();
                    pesoColombianoToDolar.convertir();
                    break;
                case 7:
                    System.out.println("Gracias por usar la aplicacion");
                    break;
                default:
                    System.out.println("¡Elija una opcion valida!");
                    Thread.sleep(1000);
            }
        }while(seleccion!=7);
    }
}
