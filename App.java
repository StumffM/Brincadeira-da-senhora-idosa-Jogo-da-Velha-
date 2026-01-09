package JogoDaVelha;

public class App {
    public static void main(String[] args) {
        System.out.println("Jogo da Velha");
        int roundi = 1;
        int contX = 0;
        int contO = 0;
        do {
            char[][] m = new char[3][3];
            boolean[][] m1 = new boolean[3][3];
            int inicio = (int) Math.round(Math.random() * 100);
            System.out.println("Round "+roundi+"/5");
            if (inicio % 2 != 0) {
                System.out.println("O 1° jogador Começa com o X");
            } else {
                System.out.println("O 2° jogador Começa com o X");
            }
            for (int i = 0; i < 8; i++) {
                if (i % 2 == 0) {
                    Player.selPlayer(m, m1, 'X');
                    if (Verifica.verificaWin(m,'X') == true) {
                        System.out.println("O jogador X Ganhou o round"+roundi);
                        Imprime.imprimeC(m);
                        i = 10;
                        contX++;
                    }
                } else {
                    Player.selPlayer(m, m1, 'O');
                    if (Verifica.verificaWin(m,'O') == true) {
                        System.out.println("O jogador O Ganhou o round "+roundi);
                        Imprime.imprimeC(m);
                        i = 10;
                        contO++;
                    }
                }
            } roundi++;
        } while (roundi == 5);
        if (contX>contO){System.out.println("O Jogador X é o Vencedor do jogo");
        }else{System.out.println("O Jogador O é o Vencedor do jogo");}
    }
}
