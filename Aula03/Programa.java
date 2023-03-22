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
        System.out.println(lista.get(0).getValor());
        System.out.println(lista.get(1).getValor());
        System.out.println(lista.get(2).getValor());
        System.out.println(lista.get(3).getValor());

    }
}

