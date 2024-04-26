package com.alura.conversor.conexion;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiConexion {

    public void llamarApi(String monedaBase, String monedaDeCambio, int montoDeConversion){

        String clave = "7e259263f3e088784f515c0b";
//        String monedaBase = "USD";
//        String monedaDeCambio = "ARS";
//        int montoDeConversion = 1;

        // Setting URL
        String url_str = "https://v6.exchangerate-api.com/v6/"+ clave +"/pair/"
                +monedaBase+"/"+monedaDeCambio+"/"+montoDeConversion;

        try{
            // Making Request
            URL url = new URL(url_str);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            // Convert to JSON
            JsonParser jp = new JsonParser();
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
            JsonObject jsonobj = root.getAsJsonObject();

            // Accessing object
            String req_result = jsonobj.get("conversion_result").getAsString();
            System.out.println("$"+montoDeConversion+" "+monedaBase+" son $"+req_result+" "+monedaDeCambio);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
