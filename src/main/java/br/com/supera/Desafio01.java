package br.com.supera;

import java.util.ArrayList;
import java.util.Collections;

public class Desafio01 {

    public static void main(String[] args) {
        int lines = Utils.readNumber("Informe a quantidade de leituras: ");
        int[] array = new int[lines];
        
        for (int i = 1; i <= lines; i++) {
            array[(i - 1)] = Utils.readNumber(
                    String.format("Informe o numero %d: ", i));
        }

        var pares = new ArrayList<Integer>();
        var impares = new ArrayList<Integer>();

        for (Integer integer : array) {
            if (integer % 2 == 0)
                pares.add(integer);
            else
                impares.add(integer);
        }

        Collections.sort(pares);
        Collections.sort(impares);
        Collections.reverse(impares);


        for (Integer integer : pares) {
            System.out.println(integer);
        }

        for (Integer integer : impares) {
            System.out.println(integer);
        }
    }
}
