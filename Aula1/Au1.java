package Aula1;
import java.util.Scanner;
public class Au1 {
    
    public static void contarRegressivamenteR(int n){
        if (n < 0){
            return;
        }
        System.out.println(n);
        contarRegressivamenteR(n-1);
    }

    public static int converterParaNatural(int n, Scanner sc){
        while (n< 0){
            System.out.println("O número informado não é natural. Favor informar um número natural");
            n = sc.nextInt();
        }
        return(n);
    }

    public static int converterParaNaturalRecursivo(int n, Scanner sc){
        if (n >= 0) {
            return n;
        }
        System.out.println("O número informado não é natural. Favor informar um número natural");
        n = sc.nextInt();

        return converterParaNaturalRecursivo(n, sc);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número natural: ");
        int numeroNatural = sc.nextInt();
        if (numeroNatural < 0) {
            converterParaNatural(numeroNatural, sc);
        }

        contarRegressivamenteR(numeroNatural);
    }
}
