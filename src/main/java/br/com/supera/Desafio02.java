package br.com.supera;

public class Desafio02 {

    public static void main(String[] args) {
        double value = readDouble();

        int[] notas = { 100, 50, 20, 10, 5, 2 };
        int[] moedas = { 100, 50, 25, 10, 5, 1 };

        int valueNotas = (int) value;
        int valueMoedas = (int) ((value - valueNotas) * 100);

        System.out.println("NOTAS:");
        for (int i : notas) {
            int num = valueNotas / i;
            System.out.println(String.format("%d notas(s) de R$ %d", num, i));
            if (num != 0) {
                valueNotas = valueNotas % i;
            }
        }

        valueMoedas += valueNotas * 100;

        System.out.println("MOEDAS:");
        for (int i : moedas) {
            int num = valueMoedas / i;
            System.out.println(String.format("%d moeda(s) de R$ %.2f", num, (double) i / 100));
            if (num != 0) {
                valueMoedas = valueMoedas % i;
            }
        }
    }

    public static double readDouble() {
        while (true) {
            var input = System.console().readLine("Informe um valor: "); 
            if (input.matches("^([0-9]*[.])?[0-9]+$")) {
                return Double.parseDouble(input);
            }
            System.out.println("Entrada inválida!");
        }
    }
}
