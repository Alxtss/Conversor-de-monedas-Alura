package com.alura.conversor.principal;

import com.alura.conversor.conversion.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws InterruptedException {
        Menu menu = new Menu();

        System.out.println("");
        System.out.println("BIENVENIDO AL CONVERSOR DE MONEDAS =]");

        try{
            menu.getMenu();
        }catch (InputMismatchException e){
            System.out.println("Por favor, ingrese una opcion válida sin letras ni simbolos.");
            Thread.sleep(2000);
            menu.getMenu();
        }
    }
}
























