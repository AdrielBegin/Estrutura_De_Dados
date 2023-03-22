import java.util.Scanner;
public class Hello{
    public static void main(String[] args){
        System.out.println("hello");
        String[] estados = new String[10];
        estados[0] = "AC";
        estados[1] = "BA";
        estados[2] = "CE";
        estados[3] = "DF";
        estados[4] = "AM";
        estados[5] = "AP";
        estados[6] = "PB";
        estados[7] = "RN";
        estados[8] = "MS";
        estados[9] = "SP";
            System.out.println();
        for(int i = 0; i < estados.length;i++){
            System.out.println(" Estado "+i+":"+estados[i]);
        }
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o nome que voce que buscar");
        String siglaBusca = leitor.nextLine();
        //Busca linear 
        // Na buscar ele começa como não encontrou, ou seja false...
        boolean encontrou = false;
        for(int i = 0; i < estados.length;i++){
            String elemento = estados[i];
            if(elemento.equalsIgnoreCase(siglaBusca)){
                encontrou = true;
                break;
            } 
        }
        if(encontrou ==  true){
                System.out.println("Achooou "+ encontrou);
            }else{
                System.out.println("Não encontrou");
            }

    }
}