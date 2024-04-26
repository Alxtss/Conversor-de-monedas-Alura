package com.alura.conversor.principal;

public class Menu {
    public String getMenu(){

        String menu = """
            ***********************************************
             Bienvenido al Conversor de Moneda =]
             
             1) Dolar =>> Peso argentino
             2) Peso argentino =>> Dolar
             3) Dolar =>> Real brasileño
             4) Real brasileño =>> Dolar
             5) Dolar =>> Peso colombiano
             6) Peso colombino =>> Dolar
             7) Salir
             Elija una opcion valida:
            ***********************************************
             """;

        System.out.println(menu);

        return menu;
    }
}
