// 9 - Dado um array com números positivos e negativos, encontre o subarray com a maior soma.
// Exemplo:
// Entrada: [-2,1,-3,4,-1,2,1,-5,4]  
//Saída: 6 (subarray [4,-1,2,1])


import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.print("Digite a quantidade de números: ");
        int qtd = in.nextInt();

        System.out.println("Digite os números:");
        for (int i = 0; i < qtd; i++) {
            numeros.add(in.nextInt());
        }

        int maxSoma = numeros.get(0);
        int somaAtual = numeros.get(0);

        for (int i = 1; i < numeros.size(); i++) {
            somaAtual = Math.max(numeros.get(i), somaAtual + numeros.get(i));
            maxSoma = Math.max(maxSoma, somaAtual);
        }

        System.out.println("A maior soma do subarray é: " + maxSoma);

        in.close();
    }
}
