package Outros;
import java.util.Scanner;

public class matriz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Múltiplicação da diagonal das matrizes;
        int [][] matriz = new int[3][3];
        int mult = 1; 
        
        System.out.println("Digite os números da Matriz: ");
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                matriz[i][j] = sc.nextInt();
                if (i == j){
                    mult = mult * matriz[i][j];
                }
            }
        }

        for (int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                System.out.printf("%5d", matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println("A determinante é: " + mult);

        sc.close();

    }    
}
