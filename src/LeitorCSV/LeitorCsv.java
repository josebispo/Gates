
package LeitorCSV;

import gui.SeletorGUI;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;


public class LeitorCsv {      

  public static void Leitor() throws FileNotFoundException, IOException {

    LeitorCsv obj = new LeitorCsv();
    obj.run();
  }
  
  
  public void run() throws FileNotFoundException, IOException {
    String arquivoCSV = SeletorGUI.leitor; //("BPA_MagazLuiza.csv");
    BufferedReader leitor = null;
    String linha;
    String csvDivisor = ",";
    File arquivo = new File (arquivoCSV);
    LineNumberReader  contlinhas = new LineNumberReader (new FileReader (arquivo));
    contlinhas.skip(arquivo.length());
    int qtdlinhas = contlinhas.getLineNumber()+1;
    System.out.print("o arquivo tem "+qtdlinhas+" linhas");
    System.out.println();
    
    
    
    try {

//<<<<<<< HEAD
        leitor = new BufferedReader(new FileReader(arquivoCSV)); 
        
        String[][] indices = new String [qtdlinhas][4];
        for (int i=0; i<qtdlinhas; i++)
                for (int j=0; j<4; j++)                   
                    indices[i][j]="0";                   
                                
        int cont = 0;        
        while (((linha= leitor.readLine()) != null)&&(cont<qtdlinhas)) {
        String[] coluna = linha.split(csvDivisor,-1); 
                for (int j=0; j<4; j++){
                    if (!"".equals(coluna[j]))                        
                        indices[cont][j]= coluna[j];                    
                }
                cont++;      
        }
        
        for (int i=0; i<qtdlinhas; i++)
                for (int j=2; j<4; j++){                  
                    indices[i][j]=indices[i][j].replaceAll("\\.","");
                    
                }
//        for (int i=0; i<qtdlinhas; i++){
//                for (int j=0; j<4; j++){  
//                    
//                    System.out.print(indices[i][j]+" , " );
//                }
//                System.out.println();
//        }
        
        Indices i2015 = new Indices(0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f);
        for (int i=0;i<qtdlinhas;i++){
            if ((indices[i][1]).equals("Ativo Total"))
                i2015.setAtivototal(Float.valueOf(indices[i][2])*1000);
            if ((indices[i][1]).equals("Ativo Circulante"))
                i2015.setAtivocirculante(Float.valueOf(indices[i][2])*1000);
            if ((indices[i][1]).equals("Passivo Circulante"))
                i2015.setPassivocirculante(Float.valueOf(indices[i][2])*1000);
            if ((indices[i][1]).equals("Imobilizado"))
                i2015.setImobilizado(Float.valueOf(indices[i][2])*1000);
            if ((indices[i][1]).equals("Intangivel"))
                i2015.setIntangivel(Float.valueOf(indices[i][2])*1000);
            if ((indices[i][1]).equals("Ativo Realizável a Longo Prazo"))
                i2015.setRealizavellongoprazo(Float.valueOf(indices[i][2])*1000);
            if ((indices[i][1]).equals("Estoques"))
                i2015.setEstoques(Float.valueOf(indices[i][2])*1000);
            if ((indices[i][1]).equals("Passivo Circulante"))
                i2015.setPassivocirculante(Float.valueOf(indices[i][2])*1000);
            if ((indices[i][1]).equals("Passivo Não Circulante"))
                i2015.setPassivonaocirculante(Float.valueOf(indices[i][2])*1000);
            if ((indices[i][1]).equals("Patrimônio Líquido Consolidado"))
                i2015.setPatrimonioliquido(Float.valueOf(indices[i][2])*1000);
            if ((indices[i][1]).equals("Receita de Venda de Bens e/ou Serviços"))
                i2015.setVendaliquida(Float.valueOf(indices[i][2])*1000);
            if ((indices[i][1]).equals("Lucro/Prejuízo Consolidado do Período"))
                i2015.setLucroliquido(Float.valueOf(indices[i][2])*1000);
            if ((indices[i][1]).equals("Caixa e Equivalentes de Caixa"))
                i2015.setDisponivel(Float.valueOf(indices[i][2])*1000);
    }
        
        System.out.println("Ativo Total 2015: "+i2015.getAtivototal());
        System.out.println("Imobilizado 2015: "+i2015.getImobilizado());
        System.out.println("Passivo Circulante 2015: "+i2015.getPassivocirculante());
        System.out.println("Lucro Liquido 2015: "+i2015.getLucroliquido());

        Indicadores indicadores2015 = new Indicadores();
        indicadores2015.setEndividamento((i2015.getPassivocirculante()+i2015.getPassivonaocirculante())/i2015.getPatrimonioliquido());
        indicadores2015.setComposicaoendividamento((i2015.getPassivocirculante()*100)/(i2015.getPassivocirculante()+i2015.getPassivonaocirculante()));
        indicadores2015.setImobilizacaoPL(((i2015.getImobilizado()+i2015.getIntangivel())/i2015.getPatrimonioliquido())*100);
        indicadores2015.setLiquidezgeral((i2015.getAtivocirculante()+i2015.getRealizavellongoprazo())/(i2015.getPassivocirculante()+i2015.getPassivonaocirculante()));
        indicadores2015.setLiqcorrente(i2015.getAtivocirculante()/i2015.getPassivocirculante());
        indicadores2015.setCapcircliq(i2015.getAtivocirculante()-i2015.getPassivocirculante());
        indicadores2015.setLiqseca((i2015.getAtivocirculante()+i2015.getEstoques())/i2015.getPassivocirculante());
        indicadores2015.setLiqimediata(i2015.getDisponivel()/i2015.getPassivocirculante());        
        indicadores2015.setGirodoativo(i2015.getVendaliquida()/i2015.getAtivototal());
        indicadores2015.setMargemliquida((i2015.getLucroliquido()/i2015.getVendaliquida())*100);
        indicadores2015.setRentabilidadedoativo((i2015.getLucroliquido()/i2015.getAtivototal())*100);
        indicadores2015.setRentabilidadePL(i2015.getLucroliquido()/i2015.getPatrimonioliquido());
        System.out.println(indicadores2015); 
//=======
//        leitor = new BufferedReader(new FileReader(arquivoCSV));     
//        while ((linha= leitor.readLine()) != null) {
// 
//            String[] pais = linha.split(csvDivisor);
//            for (int i=0; i<4; i++){
//               if (pais[i].equals("Passivo Total")){
//                    System.out.println(pais[pais.length-2] + " " + pais[pais.length-1]);}

             
              //if ((pais[pais.length-2]).equals("Passivo Total")){                                 
  
              
//>>>>>>> 8c41fd30e69538602f4ebbe47b3b1c425cc064b6

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