
package LeitorCSV;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class LeitorCsv {

  public static void main(String[] args) {

    LeitorCsv obj = new LeitorCsv();
    obj.run();

  }

  public void run() {

    String arquivoCSV = "BPP_MagazLuiza.csv";
    BufferedReader leitor = null;
    String linha;
    String csvDivisor = ";";
    try {

        leitor = new BufferedReader(new FileReader(arquivoCSV));     
        while ((linha= leitor.readLine()) != null) {
 
            String[] pais = linha.split(csvDivisor);
            for (int i=0; i<4; i++){
               if (pais[i].equals("Passivo Total")){
                    System.out.println(pais[pais.length-2] + " " + pais[pais.length-1]);

             }
              //if ((pais[pais.length-2]).equals("Passivo Total")){                                 
            }
        }      

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        if (leitor != null) {
            try {
                leitor.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
  }

}