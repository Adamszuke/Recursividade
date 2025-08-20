package Trabalho;
import java.util.Scanner;

public class trabalho {

    public static int converterParaNatural(int n, Scanner sc){
        if(n >= 0){
            return n;
        }
        System.out.println("O número digitado não é natural, digite novamente: ");
        n = sc.nextInt();

        return converterParaNatural(n, sc);
    }

    public static void preencherVetor(int[] n, int numeroFinal, int numeroAtual){
        if (numeroAtual < numeroFinal ){
            n[numeroAtual] = numeroAtual;
        } else {
            return;
        }
        System.out.println(n[numeroAtual] + 1);
        preencherVetor(n, numeroFinal, numeroAtual + 1);
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroAtual = 0;
        System.out.println("Digite o tamanho do seu Vetor: ");
        int numeroFinal = sc.nextInt();

        int[] vetor = new int[numeroFinal]; 


        if (vetor[numeroAtual] < numeroFinal) {
            preencherVetor(vetor, numeroFinal, numeroAtual);
            
        }


        sc.close();
    }
}
