package br.com.supera;

public class Utils {

    public static int readNumber(String title) {
        do {
            var qtd = System.console().readLine(title);
            if (qtd.matches("^[0-9]+$")) return Integer.parseInt(qtd);
            System.out.println("⚠️ Numero Inválida!");
        } while (true);
    }
}
