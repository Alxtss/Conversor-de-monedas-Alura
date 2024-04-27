package com.alura.conversor.conexion;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiConexion {

    public void llamarApi(String monedaBase, String monedaDeCambio, double montoDeConversion){

        String clave = "7e259263f3e088784f515c0b";

        // Setting URL
        String url_str = "https://v6.exchangerate-api.com/v6/"+ clave +"/pair/"
                +monedaBase+"/"+monedaDeCambio+"/"+montoDeConversion;

        try{
            // Making Request
            URL url = new URL(url_str);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();
            //conn.setRequestMethod("GET");

            int responseCode = request.getResponseCode();
            //Validando conexion
            if (responseCode == HttpURLConnection.HTTP_OK) {
                //Almacenando en buffer
                BufferedReader in = new BufferedReader(new InputStreamReader(request.getInputStream()));
                StringBuilder response = new StringBuilder();
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                // Convertir el contenido de la respuesta en GSON
                Gson gson = new Gson();
                JsonObject json = gson.fromJson(response.toString(), JsonObject.class);

                //Setear resultado con dos decimales
                double conversionResult = json.get("conversion_result").getAsDouble();
                String req_result = String.format("%.2f", conversionResult);
                System.out.println("$"+montoDeConversion+" "+monedaBase+" son $"+req_result+" "+monedaDeCambio);
                Thread.sleep(2500);
            }else {
                System.out.println("Error enla solicitud. Código de respuesta: " + responseCode);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
