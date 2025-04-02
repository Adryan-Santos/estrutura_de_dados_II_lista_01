// 3- Preencha um array com 10 números e conte quantos são pares e quantos são ímpares.

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int [] inteiros = new int[10];
        int par = 0;
        int impar = 0;

        for (int i = 0; i < inteiros.length; i++) {
            System.out.print("Digite um valor inteiro: ");
            inteiros[i] = Integer.parseInt(in.nextLine());
            if (inteiros[i] % 2 == 0){
                par ++;
            } else {
                impar ++;
            }
        }
        System.out.println();
        System.out.println("Lista");
        for (int i : inteiros) {
            System.out.print(i + " | ");
        }
        System.out.println();
        System.out.println("A lista possui " + par + " números pares!");
        System.out.println("A lista possui " + impar + " números impares!");
        System.out.println();
        in.close();
    }
}
