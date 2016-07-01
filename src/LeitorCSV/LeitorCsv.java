
package LeitorCSV;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import Telas.EmpresaGUI;
import java.io.PrintWriter;



public class LeitorCsv {      

  public static void Leitor() throws FileNotFoundException, IOException {

    LeitorCsv obj = new LeitorCsv();
    obj.run();
  }
  
  
  public void run() throws FileNotFoundException, IOException {
    String arquivoCSV = EmpresaGUI.leitor; //("BPA_MagazLuiza.csv");
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

        leitor = new BufferedReader(new FileReader(arquivoCSV)); 
        String[] coluna = null;
        String[][] indices = new String [qtdlinhas][10];
        for (int i=0; i<qtdlinhas; i++)
                for (int j=0; j<10; j++)                   
                    indices[i][j]="0";                   
                                
        int cont = 0;        
        while (((linha= leitor.readLine()) != null)&&(cont<qtdlinhas)) {
                coluna = linha.split(csvDivisor,-1); 
                for (int j=0; j<coluna.length; j++){
                    if (!"".equals(coluna[j]))                        
                        indices[cont][j]= coluna[j];                    
                }
                cont++;      
        }
        
        for (int i=0; i<qtdlinhas; i++)
                for (int j=2; j<coluna.length; j++){                  
                    indices[i][j]=indices[i][j].replaceAll("\\.","");
                    
                }
        for (int i=0; i<qtdlinhas; i++){
                for (int j=0; j<coluna.length; j++){  
                    
                    System.out.print(indices[i][j]+" , " );
                }
                System.out.println();
        }
        
        Indices i2015 = new Indices(0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f);
        Indices i2014 = new Indices(0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f);
        Indices i2013 = new Indices(0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f);
        Indices i2012 = new Indices(0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f);
        Indices i2011 = new Indices(0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f);
        Indices i2010 = new Indices(0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f);
        for (int i=0;i<qtdlinhas;i++){
            if ((indices[i][1]).equals("Ativo Total")){
                i2015.setAtivototal(Float.valueOf(indices[i][2])*1000);
                if (!"0".equals(indices[i][3]))
                    i2014.setAtivototal(Float.valueOf(indices[i][3])*1000);
                if (!"0".equals(indices[i][4]))
                    i2013.setAtivototal(Float.valueOf(indices[i][4])*1000);
                if (!"0".equals(indices[i][5]))
                    i2012.setAtivototal(Float.valueOf(indices[i][5])*1000);
                if (!"0".equals(indices[i][6]))
                    i2011.setAtivototal(Float.valueOf(indices[i][6])*1000);
                if (!"0".equals(indices[i][7]))
                    i2010.setAtivototal(Float.valueOf(indices[i][7])*1000);                
                }
            if ((indices[i][1]).equals("Ativo Circulante")){
                i2015.setAtivocirculante(Float.valueOf(indices[i][2])*1000);
                if (!"0".equals(indices[i][3]))
                    i2014.setAtivocirculante(Float.valueOf(indices[i][3])*1000);
                if (!"0".equals(indices[i][4]))
                    i2013.setAtivocirculante(Float.valueOf(indices[i][4])*1000);
                if (!"0".equals(indices[i][5]))
                    i2012.setAtivocirculante(Float.valueOf(indices[i][5])*1000);
                if (!"0".equals(indices[i][6]))
                    i2011.setAtivocirculante(Float.valueOf(indices[i][6])*1000);
                if (!"0".equals(indices[i][7]))
                    i2010.setAtivocirculante(Float.valueOf(indices[i][7])*1000);                
                }
            if ((indices[i][1]).equals("Passivo Circulante")){
                i2015.setPassivocirculante(Float.valueOf(indices[i][2])*1000);
                if (!"0".equals(indices[i][3]))
                    i2014.setPassivocirculante(Float.valueOf(indices[i][3])*1000);
                if (!"0".equals(indices[i][4]))
                    i2013.setPassivocirculante(Float.valueOf(indices[i][4])*1000);
                if (!"0".equals(indices[i][5]))
                    i2012.setPassivocirculante(Float.valueOf(indices[i][5])*1000);
                if (!"0".equals(indices[i][6]))
                    i2011.setPassivocirculante(Float.valueOf(indices[i][6])*1000);
                if (!"0".equals(indices[i][7]))
                    i2010.setPassivocirculante(Float.valueOf(indices[i][7])*1000);                
                }
            if ((indices[i][1]).equals("Imobilizado")){
                i2015.setImobilizado(Float.valueOf(indices[i][2])*1000);
                if (!"0".equals(indices[i][3]))
                    i2014.setImobilizado(Float.valueOf(indices[i][3])*1000);
                if (!"0".equals(indices[i][4]))
                    i2013.setImobilizado(Float.valueOf(indices[i][4])*1000);
                if (!"0".equals(indices[i][5]))
                    i2012.setImobilizado(Float.valueOf(indices[i][5])*1000);
                if (!"0".equals(indices[i][6]))
                    i2011.setImobilizado(Float.valueOf(indices[i][6])*1000);
                if (!"0".equals(indices[i][7]))
                    i2010.setImobilizado(Float.valueOf(indices[i][7])*1000);                
                }
            if ((indices[i][1]).equals("Intangivel")){
                i2015.setIntangivel(Float.valueOf(indices[i][2])*1000);
                if (!"0".equals(indices[i][3]))
                    i2014.setIntangivel(Float.valueOf(indices[i][3])*1000);
                if (!"0".equals(indices[i][4]))
                    i2013.setIntangivel(Float.valueOf(indices[i][4])*1000);
                if (!"0".equals(indices[i][5]))
                    i2012.setIntangivel(Float.valueOf(indices[i][5])*1000);
                if (!"0".equals(indices[i][6]))
                    i2011.setIntangivel(Float.valueOf(indices[i][6])*1000);
                if (!"0".equals(indices[i][7]))
                    i2010.setIntangivel(Float.valueOf(indices[i][7])*1000);                
                }
            if ((indices[i][1]).equals("Ativo Realizável a Longo Prazo")){
                i2015.setRealizavellongoprazo(Float.valueOf(indices[i][2])*1000);
                if (!"0".equals(indices[i][3]))
                    i2014.setRealizavellongoprazo(Float.valueOf(indices[i][3])*1000);
                if (!"0".equals(indices[i][4]))
                    i2013.setRealizavellongoprazo(Float.valueOf(indices[i][4])*1000);
                if (!"0".equals(indices[i][5]))
                    i2012.setRealizavellongoprazo(Float.valueOf(indices[i][5])*1000);
                if (!"0".equals(indices[i][6]))
                    i2011.setRealizavellongoprazo(Float.valueOf(indices[i][6])*1000);
                if (!"0".equals(indices[i][7]))
                    i2010.setRealizavellongoprazo(Float.valueOf(indices[i][7])*1000);                
                }
            if ((indices[i][1]).equals("Estoques")){
                i2015.setEstoques(Float.valueOf(indices[i][2])*1000);
                if (!"0".equals(indices[i][3]))
                    i2014.setEstoques(Float.valueOf(indices[i][3])*1000);
                if (!"0".equals(indices[i][4]))
                    i2013.setEstoques(Float.valueOf(indices[i][4])*1000);
                if (!"0".equals(indices[i][5]))
                    i2012.setEstoques(Float.valueOf(indices[i][5])*1000);
                if (!"0".equals(indices[i][6]))
                    i2011.setEstoques(Float.valueOf(indices[i][6])*1000);
                if (!"0".equals(indices[i][7]))
                    i2010.setEstoques(Float.valueOf(indices[i][7])*1000);                
                }
            if ((indices[i][1]).equals("Passivo Circulante")){
                i2015.setPassivocirculante(Float.valueOf(indices[i][2])*1000);
                if (!"0".equals(indices[i][3]))
                    i2014.setPassivocirculante(Float.valueOf(indices[i][3])*1000);
                if (!"0".equals(indices[i][4]))
                    i2013.setPassivocirculante(Float.valueOf(indices[i][4])*1000);
                if (!"0".equals(indices[i][5]))
                    i2012.setPassivocirculante(Float.valueOf(indices[i][5])*1000);
                if (!"0".equals(indices[i][6]))
                    i2011.setPassivocirculante(Float.valueOf(indices[i][6])*1000);
                if (!"0".equals(indices[i][7]))
                    i2010.setPassivocirculante(Float.valueOf(indices[i][7])*1000);                
                }
            if ((indices[i][1]).equals("Passivo Não Circulante")){
                i2015.setPassivonaocirculante(Float.valueOf(indices[i][2])*1000);
                if (!"0".equals(indices[i][3]))
                    i2014.setPassivonaocirculante(Float.valueOf(indices[i][3])*1000);
                if (!"0".equals(indices[i][4]))
                    i2013.setPassivonaocirculante(Float.valueOf(indices[i][4])*1000);
                if (!"0".equals(indices[i][5]))
                    i2012.setPassivonaocirculante(Float.valueOf(indices[i][5])*1000);
                if (!"0".equals(indices[i][6]))
                    i2011.setPassivonaocirculante(Float.valueOf(indices[i][6])*1000);
                if (!"0".equals(indices[i][7]))
                    i2010.setPassivonaocirculante(Float.valueOf(indices[i][7])*1000);                
                }
            if ((indices[i][1]).equals("Patrimônio Líquido Consolidado")){
                i2015.setPatrimonioliquido(Float.valueOf(indices[i][2])*1000);
                if (!"0".equals(indices[i][3]))
                    i2014.setPatrimonioliquido(Float.valueOf(indices[i][3])*1000);
                if (!"0".equals(indices[i][4]))
                    i2013.setPatrimonioliquido(Float.valueOf(indices[i][4])*1000);
                if (!"0".equals(indices[i][5]))
                    i2012.setPatrimonioliquido(Float.valueOf(indices[i][5])*1000);
                if (!"0".equals(indices[i][6]))
                    i2011.setPatrimonioliquido(Float.valueOf(indices[i][6])*1000);
                if (!"0".equals(indices[i][7]))
                    i2010.setPatrimonioliquido(Float.valueOf(indices[i][7])*1000);                
                }
            if ((indices[i][1]).equals("Receita de Venda de Bens e/ou Serviços")){
                i2015.setVendaliquida(Float.valueOf(indices[i][2])*1000);
                if (!"0".equals(indices[i][3]))
                    i2014.setVendaliquida(Float.valueOf(indices[i][3])*1000);
                if (!"0".equals(indices[i][4]))
                    i2013.setVendaliquida(Float.valueOf(indices[i][4])*1000);
                if (!"0".equals(indices[i][5]))
                    i2012.setVendaliquida(Float.valueOf(indices[i][5])*1000);
                if (!"0".equals(indices[i][6]))
                    i2011.setVendaliquida(Float.valueOf(indices[i][6])*1000);
                if (!"0".equals(indices[i][7]))
                    i2010.setVendaliquida(Float.valueOf(indices[i][7])*1000);                
                }
            if ((indices[i][1]).equals("Lucro/Prejuízo Consolidado do Período")){
                i2015.setLucroliquido(Float.valueOf(indices[i][2])*1000);
                if (!"0".equals(indices[i][3]))
                    i2014.setLucroliquido(Float.valueOf(indices[i][3])*1000);
                if (!"0".equals(indices[i][4]))
                    i2013.setLucroliquido(Float.valueOf(indices[i][4])*1000);
                if (!"0".equals(indices[i][5]))
                    i2012.setLucroliquido(Float.valueOf(indices[i][5])*1000);
                if (!"0".equals(indices[i][6]))
                    i2011.setLucroliquido(Float.valueOf(indices[i][6])*1000);
                if (!"0".equals(indices[i][7]))
                    i2010.setLucroliquido(Float.valueOf(indices[i][7])*1000);                
                }
            if ((indices[i][1]).equals("Caixa e Equivalentes de Caixa")){
                i2015.setDisponivel(Float.valueOf(indices[i][2])*1000);
                if (!"0".equals(indices[i][3]))
                    i2014.setDisponivel(Float.valueOf(indices[i][3])*1000);
                if (!"0".equals(indices[i][4]))
                    i2013.setDisponivel(Float.valueOf(indices[i][4])*1000);
                if (!"0".equals(indices[i][5]))
                    i2012.setDisponivel(Float.valueOf(indices[i][5])*1000);
                if (!"0".equals(indices[i][6]))
                    i2011.setDisponivel(Float.valueOf(indices[i][6])*1000);
                if (!"0".equals(indices[i][7]))
                    i2010.setDisponivel(Float.valueOf(indices[i][7])*1000);                
                }
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
        
        Indicadores indicadores2014 = new Indicadores();
        indicadores2014.setEndividamento((i2014.getPassivocirculante()+i2014.getPassivonaocirculante())/i2014.getPatrimonioliquido());
        indicadores2014.setComposicaoendividamento((i2014.getPassivocirculante()*100)/(i2014.getPassivocirculante()+i2014.getPassivonaocirculante()));
        indicadores2014.setImobilizacaoPL(((i2014.getImobilizado()+i2014.getIntangivel())/i2014.getPatrimonioliquido())*100);
        indicadores2014.setLiquidezgeral((i2014.getAtivocirculante()+i2014.getRealizavellongoprazo())/(i2014.getPassivocirculante()+i2014.getPassivonaocirculante()));
        indicadores2014.setLiqcorrente(i2014.getAtivocirculante()/i2014.getPassivocirculante());
        indicadores2014.setCapcircliq(i2014.getAtivocirculante()-i2014.getPassivocirculante());
        indicadores2014.setLiqseca((i2014.getAtivocirculante()+i2014.getEstoques())/i2014.getPassivocirculante());
        indicadores2014.setLiqimediata(i2014.getDisponivel()/i2014.getPassivocirculante());        
        indicadores2014.setGirodoativo(i2014.getVendaliquida()/i2014.getAtivototal());
        indicadores2014.setMargemliquida((i2014.getLucroliquido()/i2014.getVendaliquida())*100);
        indicadores2014.setRentabilidadedoativo((i2014.getLucroliquido()/i2014.getAtivototal())*100);
        indicadores2014.setRentabilidadePL(i2014.getLucroliquido()/i2014.getPatrimonioliquido());
        
        Indicadores indicadores2013 = new Indicadores();
        if ((i2013.getAtivototal())!=0){
        indicadores2013.setEndividamento((i2013.getPassivocirculante()+i2013.getPassivonaocirculante())/i2013.getPatrimonioliquido());
        indicadores2013.setComposicaoendividamento((i2013.getPassivocirculante()*100)/(i2013.getPassivocirculante()+i2013.getPassivonaocirculante()));
        indicadores2013.setImobilizacaoPL(((i2013.getImobilizado()+i2013.getIntangivel())/i2013.getPatrimonioliquido())*100);
        indicadores2013.setLiquidezgeral((i2013.getAtivocirculante()+i2013.getRealizavellongoprazo())/(i2013.getPassivocirculante()+i2013.getPassivonaocirculante()));
        indicadores2013.setLiqcorrente(i2013.getAtivocirculante()/i2013.getPassivocirculante());
        indicadores2013.setCapcircliq(i2013.getAtivocirculante()-i2013.getPassivocirculante());
        indicadores2013.setLiqseca((i2013.getAtivocirculante()+i2013.getEstoques())/i2013.getPassivocirculante());
        indicadores2013.setLiqimediata(i2013.getDisponivel()/i2013.getPassivocirculante());        
        indicadores2013.setGirodoativo(i2013.getVendaliquida()/i2013.getAtivototal());
        indicadores2013.setMargemliquida((i2013.getLucroliquido()/i2013.getVendaliquida())*100);
        indicadores2013.setRentabilidadedoativo((i2013.getLucroliquido()/i2013.getAtivototal())*100);
        indicadores2013.setRentabilidadePL(i2013.getLucroliquido()/i2013.getPatrimonioliquido());
        }
        
      
        //JSONObject empinfo = new JSONObject();
        FileWriter writeFile = new FileWriter(EmpresaGUI.nome_arq+".json");


		try{
			PrintWriter gravarArq = new PrintWriter(writeFile);
                        gravarArq.printf("[{"+"\n"+"\"name\": "+"\"2015\","+"\n"+"\"data\": ["+indicadores2015.getEndividamento()+","+indicadores2015.getComposicaoendividamento()+","+indicadores2015.getImobilizacaoPL()+","+indicadores2015.getLiquidezgeral()+","
                                    +indicadores2015.getLiqcorrente()+","+indicadores2015.getCapcircliq()+","+indicadores2015.getLiqseca()+","+indicadores2015.getLiqimediata()+","+indicadores2015.getGirodoativo()+","+
                                    indicadores2015.getMargemliquida()+","+indicadores2015.getRentabilidadedoativo()+","+indicadores2015.getRentabilidadePL()+"]"+"\n"+"},");
                        gravarArq.printf("{"+"\n"+"\"name\": "+"\"2014\","+"\n"+"\"data\": ["+indicadores2014.getEndividamento()+","+indicadores2014.getComposicaoendividamento()+","+indicadores2014.getImobilizacaoPL()+","+indicadores2014.getLiquidezgeral()+","
                                    +indicadores2014.getLiqcorrente()+","+indicadores2014.getCapcircliq()+","+indicadores2014.getLiqseca()+","+indicadores2014.getLiqimediata()+","+indicadores2014.getGirodoativo()+","+
                                    indicadores2014.getMargemliquida()+","+indicadores2014.getRentabilidadedoativo()+","+indicadores2014.getRentabilidadePL()+"]"+"\n"+"},");
                        gravarArq.printf("{"+"\n"+"\"name\": "+"\"2013\","+"\n"+"\"data\": ["+indicadores2013.getEndividamento()+","+indicadores2013.getComposicaoendividamento()+","+indicadores2013.getImobilizacaoPL()+","+indicadores2013.getLiquidezgeral()+","
                                    +indicadores2013.getLiqcorrente()+","+indicadores2013.getCapcircliq()+","+indicadores2013.getLiqseca()+","+indicadores2013.getLiqimediata()+","+indicadores2013.getGirodoativo()+","+
                                    indicadores2013.getMargemliquida()+","+indicadores2013.getRentabilidadedoativo()+","+indicadores2013.getRentabilidadePL()+"]"+"\n"+"}]");
                        writeFile.close();
	
		}
		catch(IOException e){
			e.printStackTrace();
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