public class ListaLigada{
    private Elemento_No primeiro;
    private Elemento_No ultimo;
    private int tamanho;

    public ListaLigada(){
        this.tamanho = 0;
    }

    public Elemento_No getPrimeiro(){
        return primeiro;
    }

    public void setPrimeiro( Elemento_No primeiro){
        this.primeiro = primeiro;
    }

    public Elemento_No getUltimo(){
        return ultimo;
    }

    public void setUltimo(Elemento_No ultimo){
        this.ultimo = ultimo;
    }

    public int getTamanho(){
        return tamanho;
    }

    public void  setTamanho(int tamanho){
        this.tamanho = tamanho;
    }

    public void adicionar( String novoValor){
        // Para adicionar tem que fazer um construtor com paremtro recebendo o valor
        Elemento_No novoElemento = new Elemento_No(novoValor);
        // Agora faremos uma vailidação para haja poder adicionar na lista
        if(this.primeiro == null && this.ultimo == null){
            this.primeiro = novoElemento;
            this.ultimo = novoElemento;
            tamanho++;
        }else{
            // Validando se o ultimo elemento não tiver vazio
            // Então adiciona o proximo
            this.ultimo.setProximo(novoElemento);
        }
    }

    public void remover(String valorProcurado){
        // Pegando elemento.
        // getTamanho é vetor
        // Não tem o um numero depois do primeiro.
        // Então ele é nulo
        Elemento_No anterior = null;
        Elemento_No atual = this.primeiro;
        for (int i= 0; i< this.getTamanho();i++){            
           if(atual.getValor().equalsIgnoreCase(valorProcurado)){
            anterior.setProximo(atual.getProximo());
            this.tamanho --;
            atual = null;
            break;

           }
           // Para o  anteiro percorre o vetor 
           // Temos fazer ele receber o atual.
           anterior = atual;
           atual = atual.getProximo();
        }



    }

    public Elemento_No get (int posicao){
        // Pegar a posição
        // O "Elemento" é para saber o atual elemento
        Elemento_No atual = this.primeiro;
        //Percorrer o vetor
        for(int i = 0; i < posicao; i++){
            //Verificando se o atual tem proximo
            if(atual.getProximo() != null){
                //Aqui se repete pois como estamos trabalhando com lista ligada
                //É necessario que 
                atual = atual.getProximo();
            }

        }
        return atual;
    }
}
