// 8 - Dado dois arrays ordenados, crie um terceiro array que contenha todos os elementos ordenados.
// Entrada: [1, 3, 5] e [2, 4, 6]  
// Saída: [1, 2, 3, 4, 5, 6]


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Exercicio8 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();
        System.out.print("Digite a quantidade de números que deseja digitar na primeira lista: ");
        int qtdLista1 = Integer.parseInt(in.nextLine());
        
        for (int i = 0; i < qtdLista1; i++) {
            System.out.print("Digite um valor inteiro: ");
            int valor = Integer.parseInt(in.nextLine());
            lista1.add(valor);
        }
        
        System.out.println();
        System.out.print("Digite a quantidade de números que deseja digitar na segunda lista: ");
        int qtdLista2 = Integer.parseInt(in.nextLine());

        for (int i = 0; i < qtdLista2; i++) {
            System.out.print("Digite um valor inteiro: ");
            int valor = Integer.parseInt(in.nextLine());
            lista2.add(valor);
        }

        System.out.println("Lista 1: " + lista1);
        System.out.println("Lista 2: " + lista2);

        ArrayList<Integer> listaOrdenada = new ArrayList<>(lista1);
        listaOrdenada.addAll(lista2);
        Collections.sort(listaOrdenada);

        System.out.println("Lista ordenada: " + listaOrdenada);
        in.close();
    }
}
