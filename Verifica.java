package JogoDaVelha;

public class Verifica {
    public static boolean verificaWin(char[][] m, char x) {
        if (m[0][0] == x & m[0][1] == x & m[0][2] == x ||
                m[1][0] == x & m[1][1] == x & m[1][2] == x ||
                m[2][0] == x & m[2][1] == x & m[2][2] == x ||
                m[0][0] == x & m[1][0] == x & m[2][0] == x ||
                m[0][1] == x & m[1][1] == x & m[2][1] == x ||
                m[0][2] == x & m[1][2] == x & m[2][2] == x ||
                m[0][0] == x & m[1][1] == x & m[2][2] == x ||
                m[0][2] == x & m[1][1] == x & m[2][0] == x) {
            return true;
        }
        return false;
    }

    public static boolean verificaaPos(boolean x) {
        if (x == true) {
            return true;
        }
        return false;
    }
}
