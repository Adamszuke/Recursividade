package Aula1;
import java.util.Scanner;
public class Ex2 {
    // Crie uma funcao recursiva que calcule a potencia de dois do valor informado.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double n = sc.nextInt();

        double potencia = Math.pow(n, 2);

        System.out.println(potencia);

        sc.close();
    }
}
