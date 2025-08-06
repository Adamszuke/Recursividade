package Aula1;
import java.util.Scanner; 

public class Ex1{
    // Crie uma fun ̧c ̃ao recursiva que fa ̧ca a soma acumulativa de 0 at ́e o
    // valor informado. Este valor deve ser um n ́umero natural.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um Número: ");
        int n = sc.nextInt();

        int soma = 0;

        for (int i = 0; i <= n; i++){
            soma += i;
        }

        System.out.println("A soma dos números é: " + soma);

        sc.close();
    }
}
