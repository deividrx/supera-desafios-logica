package br.com.supera;

public class Desafio04 {

    public static void main(String[] args) {
        int qtdTeste = Utils.readNumber("Informe a quantidade de casos de teste: ");

        var frases = new String[qtdTeste];

        for (int i = 0; i < qtdTeste; i++) {
            var frase = readFrase(
                    String.format("Informe a frase %d: ", i));

            frases[i] = frase;
        }

        for (String frase : frases) {
            var array = frase.toCharArray();
            var meioIndex = (array.length / 2) - 1;

            for (int i = meioIndex; i >= 0; i--) {
                System.out.print(array[i]);
            }

            for (int i = array.length - 1; i > meioIndex; i--) {
                System.out.print(array[i]);
            }

            System.out.println();
        }
    }

    public static String readFrase(String title) {
        do {
            var frase = System.console().readLine(title);
            if (frase.length() >= 2 && frase.length() <= 100 && frase.length() % 2 == 0) {
                return frase;
            }
            System.out.println("⚠️ Frase Inválida!");
        } while (true);
    }

}
