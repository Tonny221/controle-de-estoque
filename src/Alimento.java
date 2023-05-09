import java.util.*;

public class Alimento {
    String nome;
    String unidadeDeMedida;
    Float quantidadeArmazenada;

    public Alimento (String nome, String unidadeDeMedida, Float quantidadeArmazenada) {
        this.nome = nome;
        this.unidadeDeMedida = unidadeDeMedida;
        this.quantidadeArmazenada = quantidadeArmazenada;
    }

    public Alimento (String data) {
        StringTokenizer token = new StringTokenizer(data, ",");

        while (token.hasMoreTokens()) {
            this.nome = token.nextToken();
            this.quantidadeArmazenada = Float.parseFloat(token.nextToken());
            this.unidadeDeMedida = token.nextToken();
        }
    }
}
