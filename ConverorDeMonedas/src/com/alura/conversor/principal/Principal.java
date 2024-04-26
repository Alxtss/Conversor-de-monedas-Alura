package com.alura.conversor.principal;

import com.alura.conversor.conversion.*;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Menu menu  = new Menu();
        menu.getMenu();

        Scanner scanner = new Scanner(System.in);
        int seleccion = scanner.nextInt();


        if (seleccion <= 7) {
            switch (seleccion){
                case 1:
                    DolarToPesoArg dolarToPesoArg = new DolarToPesoArg();
                    dolarToPesoArg.convertirUsdToArs();
                    break;
                case 2:
                    PesoArgentinoToDolar pesoArgentinoToDolar = new PesoArgentinoToDolar();
                    pesoArgentinoToDolar.convertirArsToUsd();
                    break;
                case 3:
                    DolarToRealBrasileno dolarToRealBrasileno = new DolarToRealBrasileno();
                    dolarToRealBrasileno.convertirUsdToBrl();
                    break;
                case 4:
                    RealBrasilenoToDolar realBrasilenoToDolar = new RealBrasilenoToDolar();
                    realBrasilenoToDolar.convertirBrlToUsd();
                    break;
                case 5:
                    DolarToPesoColombiano dolarToPesoColombiano = new DolarToPesoColombiano();
                    dolarToPesoColombiano.convertirUsdToCop();
                    break;
                case 6:
                    PesoColombianoToDolar pesoColombianoToDolar = new PesoColombianoToDolar();
                    pesoColombianoToDolar.convertirCopToUsd();
                    break;
                case 7:
                    System.out.println("Gracias por usar la aplicacion");
                    break;
            }
        }else{
            System.out.println("Seleccione una opcion valida: ");
        }


    }

}
























