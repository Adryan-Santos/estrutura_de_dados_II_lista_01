// 6 - Dado um array, remova os valores duplicados e exiba o novo array sem repetições.

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio6 {
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

        for (int i = 0; i < inteiros.size(); i++) {
            int valor = inteiros.get(i);
            for (int j = i + 1; j < inteiros.size(); j++) {
                if (inteiros.get(j) == valor) {
                    inteiros.remove(j);
                    j--;
                }
            }
        }

        System.out.println("Lista removendo os números duplicados: " + inteiros);

        in.close();
    }
}
