package JogoDaVelha;
import java.util.Scanner;
public class Player {
    public static void selPlayer(char[][] m, boolean[][] m1, char c) {
        Scanner scn = new Scanner(System.in);
        Imprime.imprimeC(m);
        System.out.println("Vez do Jogador "+c+ ", selecione uma posição");
        int x = scn.nextInt();
        if (x <= 0 || x > 9) {
            System.out.println("Posição invalida");
            selPlayer(m, m1,c);
        }
        switch (x) {
            case 1:
                if (!Verifica.verificaaPos(m1[0][0])) {
                    m[0][0] = c;
                    m1[0][0] = true;
                } else {
                    System.out.println("Posição invalida");
                    selPlayer(m, m1,c);
                }
                break;
            case 2:
                if (!Verifica.verificaaPos(m1[0][1])) {
                    m[0][1] = c;
                    m1[0][1] = true;
                } else {
                    System.out.println("Posição invalida");
                    selPlayer(m, m1,c);
                }
                break;
            case 3:
                if (Verifica.verificaaPos(m1[0][2]) == false) {
                    m[0][2] = c;
                    m1[0][2] = true;
                } else {
                    System.out.println("Posição invalida");
                    selPlayer(m, m1,c);
                }
                break;
            case 4:
                if (Verifica.verificaaPos(m1[1][0]) == false) {
                    m[1][0] = c;
                    m1[1][0] = true;
                } else {
                    System.out.println("Posição invalida");
                    selPlayer(m, m1,c);
                }
                break;
            case 5:
                if (Verifica.verificaaPos(m1[1][1]) == false) {
                    m[1][1] = c;
                    m1[1][1] = true;
                } else {
                    System.out.println("Posição invalida");
                    selPlayer(m, m1,c);
                }
                break;
            case 6:
                if (Verifica.verificaaPos(m1[1][2]) == false) {
                    m[1][2] = c;
                    m1[1][2] = true;
                } else {
                    System.out.println("Posição invalida");
                    selPlayer(m, m1,c);
                }
                break;
            case 7:
                if (Verifica.verificaaPos(m1[2][0]) == false) {
                    m[2][0] = c;
                    m1[2][0] = true;
                } else {
                    System.out.println("Posição invalida");
                    selPlayer(m, m1,c);
                }
                break;
            case 8:
                if (Verifica.verificaaPos(m1[0][0]) == false) {
                    m[2][1] = c;
                    m1[2][1] = true;
                } else {
                    System.out.println("Posição invalida");
                    selPlayer(m, m1,c);
                }
                break;
            case 9:
                if (Verifica.verificaaPos(m1[2][2]) == false) {
                    m[2][2] = c;
                    m1[2][2] = true;
                } else {
                    System.out.println("Posição invalida");
                    selPlayer(m, m1,c);
                }
                break;
        }
    }
}