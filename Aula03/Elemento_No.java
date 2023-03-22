import java.net.PortUnreachableException;

import javax.lang.model.element.Element;
import javax.sound.midi.VoiceStatus;

public class Elemento_No {
    private String valor;
    private Elemento_No proximo;
    
    //Construtor para adicionar algo na lista com paramentro novoValor
    public Elemento_No(String novoValor){
        this.valor = novoValor;
    }

    public String getValor(){
        return valor;
    }
    public void setValor(String valor){
        this.valor = valor;
    }
    public Elemento_No getProximo(){
        return proximo;        
    }
    public void setProximo (Elemento_No proximo){
        this.proximo = proximo;
    }



}
