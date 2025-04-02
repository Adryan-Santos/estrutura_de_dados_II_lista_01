// 7 - Implemente um programa que rotacione os elementos do array k posições para a direita. Exemplo:
// Entrada: [1, 2, 3, 4, 5], k = 2  
// Saída: [4, 5, 1, 2, 3]


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> inteiros = new ArrayList<>();
        System.out.print("Digite a quantidade de números que deseja digitar na lista: ");
        int qtd = Integer.parseInt(in.nextLine());
        
        for (int i = 0; i < qtd; i++) {
            System.out.print("Digite um valor inteiro: ");
            int valor = Integer.parseInt(in.nextLine());
            inteiros.add(valor);
        }

        System.out.println();
        System.out.println("Lista Original: " + inteiros);
        System.out.println();
        System.out.print("Digite a quantidade de rotações que deverão ser realizadas: ");
        int rotacao = Integer.parseInt(in.nextLine());

        Collections.rotate(inteiros, rotacao);

        System.out.println();
        System.out.println("Lista Rotacionada: " + inteiros);
        System.out.println();
        in.close();
    }
}
