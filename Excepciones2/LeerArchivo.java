package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;

public class LeerArchivo {
    public void leer(String ruta) throws IOException {


            BufferedReader reader = new BufferedReader(new FileReader(ruta));
            String line = "";
            while ((line = reader.readLine()) != null) {
                System.out.println("info : " + line);

            }


        }

        public void metodo1(String ruta)throws IOException{
        this.metodo2(ruta);
    }

        public  void metodo2(String ruta)throws IOException{
        this.leer(ruta);
        }
}

