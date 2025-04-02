// 4 - Crie um programa que inverta a ordem dos elementos de um array sem usar uma nova estrutura de dados auxiliar.

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Exercicio4 {
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
        Collections.reverse(inteiros);
        System.out.println("Lista invertida; " + inteiros);
        in.close();
    }
}
