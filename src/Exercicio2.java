// 2 - Dado um array de números inteiros, calcule e exiba a média dos elementos.

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> inteiros = new ArrayList<>();
        System.out.print("Digite a quantidade de números que deseja digitar na lista: ");
        int qtd = Integer.parseInt(in.nextLine());
        int soma = 0;
        for (int i = 0; i < qtd; i++) {
            System.out.print("Digite um valor inteiro: ");
            int valor = Integer.parseInt(in.nextLine());
            inteiros.add(valor);
            soma += valor;
        }

        double media = soma / inteiros.size();

        System.out.println();
        System.out.println("Lista: " + inteiros);
        System.out.println();
        System.out.println("Soma dos números inseridos na lista: " + soma);
        System.out.println("Média dos números inseridos na lista: " + media);
        in.close();
    }
}
