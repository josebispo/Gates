
package LeitorCSV;


public class Indices {
    private float imobilizado; //
    private float intangivel; //
    private float ativocirculante;//
    private float realizavellongoprazo;//
    private float estoques; //
    private float ativototal;//
    private float passivocirculante;//
    private float passivonaocirculante;//
    private float patrimonioliquido;//
    private float vendaliquida; //
    private float lucroliquido;//
    private float disponivel;
    
    public Indices (float _imobilizado, float _intangivel, float _ativocirculante, float _realizavellongoprazo, 
            float _estoques, float _ativototal, float _passivocirculante, float _passivonaocirculante, 
            float _patrimonioliquido, float _vendaliquida, float _lucroliquido, float _disponivel){
        imobilizado = _imobilizado;
        intangivel= _intangivel; 
        ativocirculante= _ativocirculante;
        realizavellongoprazo= _realizavellongoprazo;
        estoques= _estoques;
        ativototal= _ativototal;
        passivocirculante= _passivocirculante;
        passivonaocirculante= _passivonaocirculante;
        patrimonioliquido= _patrimonioliquido;        
        vendaliquida= _vendaliquida; 
        lucroliquido= _lucroliquido;
        disponivel = _disponivel;
    }

    public float getImobilizado() {
        return imobilizado;
    }

    public void setImobilizado(float imobilizado) {
        this.imobilizado = imobilizado;
    }

    public float getIntangivel() {
        return intangivel;
    }

    public void setIntangivel(float intangivel) {
        this.intangivel = intangivel;
    }

    public float getAtivocirculante() {
        return ativocirculante;
    }

    public void setAtivocirculante(float ativocirculante) {
        this.ativocirculante = ativocirculante;
    }

    public float getRealizavellongoprazo() {
        return realizavellongoprazo;
    }

    public void setRealizavellongoprazo(float realizavellongoprazo) {
        this.realizavellongoprazo = realizavellongoprazo;
    }

    public float getEstoques() {
        return estoques;
    }

    public void setEstoques(float estoques) {
        this.estoques = estoques;
    }

    public float getAtivototal() {
        return ativototal;
    }

    public void setAtivototal(float ativototal) {
        this.ativototal = ativototal;
    }

    public float getPassivocirculante() {
        return passivocirculante;
    }

    public void setPassivocirculante(float passivocirculante) {
        this.passivocirculante = passivocirculante;
    }

    public float getPassivonaocirculante() {
        return passivonaocirculante;
    }

    public void setPassivonaocirculante(float passivonaocirculante) {
        this.passivonaocirculante = passivonaocirculante;
    }

    public float getPatrimonioliquido() {
        return patrimonioliquido;
    }

    public void setPatrimonioliquido(float patrimonioliquido) {
        this.patrimonioliquido = patrimonioliquido;
    }

    public float getVendaliquida() {
        return vendaliquida;
    }

    public void setVendaliquida(float vendaliquida) {
        this.vendaliquida = vendaliquida;
    }

    public float getLucroliquido() {
        return lucroliquido;
    }

    public void setLucroliquido(float lucroliquido) {
        this.lucroliquido = lucroliquido;
    }

    public float getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(float disponivel) {
        this.disponivel = disponivel;
    }

    
    
    
    
}
