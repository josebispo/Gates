
package LeitorCSV;



public class Indicadores {
    
    
    float endividamento; //((Passivo circulante + Passivo não circulante) / Pat Liq) x 100
    float composicaoendividamento; //(Passivo Circulante)*100/(capital de terceiros) // CapTer=PC+PNC?
    float imobilizacaoPL; //Ativo Permanente = imobilizado + intangível // (AP / PL) x 100
    //float imobilizacaoRNC; // Ativo Permanente=Imobilizado+intangivel) // (AP/(PL+PassivoNaoCirculante)) x 100
    float liquidezgeral; // (AC+RealizávelLongoPrazo)/(PC+PNC)
    float liqcorrente; // AC/PC
    float capcircliq; //AC-PC 
    float liqseca; //(AC-Estoques)/PC ou // (Disponivel+Aplicações Financeiras + Clientes)/PC
    float liqimediata; //Disponivel/PC
    float girodoativo; // (Receita de Venda / AtivoTotal)
    float margemliquida; // (Lucro Liquido / Receita de Vendas) x 100
    float rentabilidadedoativo; // (LL/AtivoTotal) x 100
    float rentabilidadePL; // (LL/Patrimonio liquido) x 100

    public float getEndividamento() {
        return endividamento;
    }

    public void setEndividamento(float endividamento) {
        this.endividamento = endividamento;
    }

    public float getComposicaoendividamento() {
        return composicaoendividamento;
    }

    public void setComposicaoendividamento(float composicaoendividamento) {
        this.composicaoendividamento = composicaoendividamento;
    }

    public float getImobilizacaoPL() {
        return imobilizacaoPL;
    }

    public void setImobilizacaoPL(float imobilizacaoPL) {
        this.imobilizacaoPL = imobilizacaoPL;
    }

    public float getLiquidezgeral() {
        return liquidezgeral;
    }

    public void setLiquidezgeral(float liquidezgeral) {
        this.liquidezgeral = liquidezgeral;
    }

    public float getLiqcorrente() {
        return liqcorrente;
    }

    public void setLiqcorrente(float liqcorrente) {
        this.liqcorrente = liqcorrente;
    }

    public float getCapcircliq() {
        return capcircliq;
    }

    public void setCapcircliq(float capcircliq) {
        this.capcircliq = capcircliq;
    }

    public float getLiqseca() {
        return liqseca;
    }

    public void setLiqseca(float liqseca) {
        this.liqseca = liqseca;
    }

    public float getLiqimediata() {
        return liqimediata;
    }

    public void setLiqimediata(float liqimediata) {
        this.liqimediata = liqimediata;
    }

    public float getGirodoativo() {
        return girodoativo;
    }

    public void setGirodoativo(float girodoativo) {
        this.girodoativo = girodoativo;
    }

    public float getMargemliquida() {
        return margemliquida;
    }

    public void setMargemliquida(float margemliquida) {
        this.margemliquida = margemliquida;
    }

    public float getRentabilidadedoativo() {
        return rentabilidadedoativo;
    }

    public void setRentabilidadedoativo(float rentabilidadedoativo) {
        this.rentabilidadedoativo = rentabilidadedoativo;
    }

    public float getRentabilidadePL() {
        return rentabilidadePL;
    }

    public void setRentabilidadePL(float rentabilidadePL) {
        this.rentabilidadePL = rentabilidadePL;
    }

    
    
}
