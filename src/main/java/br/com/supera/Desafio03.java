package br.com.supera;

import java.util.Arrays;

public class Desafio03 {

    public static void main(String[] args) {
        int n = Utils.readNumber("Informe o tamanho do array: ");
        int k = Utils.readNumber("Informe o valor alvo: ");
        int count = 0;

        var array = new int[n];
        Arrays.setAll(array, i -> i + 1);

        for (int i : array) {
            for (int j : array) {
                if (j - i == k) {
                    System.out.println(j + " - " + i);
                    count++;
                }
            }
        }

        System.out.println("Quantidade de pares: " + count);
    }
}
