package JogoDaVelha;

public class Imprime {
    public static void imprimeC(char[][]m){// Metodo para impressão de uma matriz
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print("["+ m[i][j]+"]" + " " );
            }
            System.out.println();
        }
    }
}
