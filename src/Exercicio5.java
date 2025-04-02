// 5 - Peça ao usuário um número e verifique se ele está presente no array. Exiba a posição caso esteja.

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio5 {
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
        System.out.print("Digite um número para buscar na lista: ");
        int searchNum = Integer.parseInt(in.nextLine());

        ArrayList<Integer> posicao = new ArrayList<>();

        // Percorre a lista e armazena as posições onde o número aparece
        for (int i = 0; i < inteiros.size(); i++) {
            if (inteiros.get(i) == searchNum) {
                posicao.add(i);
            }
        }

        // Exibe o resultado da busca
        if (!posicao.isEmpty()) {
            System.out.println("O número " + searchNum + " foi encontrado no indice: " + posicao);
        } else {
            System.out.println("O número " + searchNum + " não foi encontrado.");
        }

        in.close();
    }
}
