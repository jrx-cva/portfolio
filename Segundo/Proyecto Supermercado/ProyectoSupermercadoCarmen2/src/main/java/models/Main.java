package models;

import javax.lang.model.util.Elements;
import javax.swing.text.Document;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        String url = "https://www.bolsamadrid.es/esp/aspx/Mercados/Precios.aspx?indice=ESI100000000&punto=indice"; //url de la p�gina

        while(true) {
            Document doc = Jsoup.connect(url).get();
            Elements ibex = doc.select("#ctl00_Contenido_tbl�ndice tr:last-child");
            System.out.println(ibex.text());

		   /*for (Element fila: ibex) {
			   System.out.println(fila.text());
		   }*/

            //escribir fichero
            BufferedWriter escritor = new BufferedWriter (new FileWriter("ibex.txt", true));
            escritor.write(ibex.text()+"\n"); //escribir linea
            //escritor.newLine();
            escritor.close();
            Thread.sleep(60000); //espera cada minuto

        }
    }
}
