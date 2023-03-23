import javax.sound.sampled.SourceDataLine;


public class Programa {
    public static void main (String[] args){
        ListaLigada lista = new ListaLigada();
        System.out.println(lista.getTamanho());
        lista.adicionar("MT");
        lista.adicionar("AC");
        lista.adicionar("CE");
        lista.adicionar("SP");
        System.out.println("Tamanho: "+lista.getTamanho());
        System.out.println("Primeito (Conteudo da bolinha = Valor) "+lista.getPrimeiro().getValor());
        System.out.println("Ultimo (Conteudo da bolinha = Valor) "+lista.getPrimeiro().getValor());

        // Imprimindo a lista ligada
        for(int i =0; i < lista.getTamanho(); i++){
            System.out.println(lista.get(i).getValor());
        }
        
        // Remover o estado de SP
        lista.remover("SP");
        System.out.println("Removeu estado SP");

        // Imprimindo a lista ligada
        for(int i =0; i < lista.getTamanho(); i++){
            System.out.println(lista.get(i).getValor());
        }

    }
}

