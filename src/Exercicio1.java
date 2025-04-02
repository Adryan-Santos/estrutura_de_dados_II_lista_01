// 1 - Peça ao usuário para inserir um conjunto de números e determine o maior e o menor valor.

import java.util.Scanner;

import java.util.ArrayList;
import java.util.Collections;

public class Exercicio1 {
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
        System.out.println("Lista: " + inteiros);
        System.out.println();
        System.out.println("O maior valor da lista é: " + Collections.max(inteiros));
        System.out.println("O menor valor da lista é: " + Collections.min(inteiros));
        in.close();
    }
}
