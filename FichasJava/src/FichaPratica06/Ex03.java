package FichaPratica06;

public class Ex03 {


    /**
     * Método que avalia se um numero é par
     * @param num Número a ser avaliado
     * @return True se par, False se impar
     */
    public static boolean par(int num) {
        if (num%2 == 0) {
            return true;
        } else {
            return false;
        }
    }


    /**
     * Método que avalia se um numero é positivo
     * @param num Número a ser avaliado
     * @return True se positivo, False se negativo
     */
    public static boolean positivo(int num) {
        if (num>=0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Método que avalia se um numero é primo
     * @param num Número a ser avaliado
     * @return True se primo, False se não primo
     */
    public static boolean primo(int num) {

        for (int divisor = 2; divisor<num; divisor++) {
            if(num%divisor==0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Método que avalia se um numero é perfeito
     * @param num Numero a ser avaliado
     * @return True se perfeito, False se não perfeito
     */
    public static boolean perfeito(int num) {

        int soma = 0;

        for (int divisor= 1; divisor < num; divisor++) {
            if (num % divisor == 0) {
                soma += divisor;
            }
        }
        if (soma == num) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Método que avalia se um numero é triangular
     * @param num Numero a ser avaliado
     * @return True se triangular, False se não triangular
     */
    public static boolean triangular(int num) {

        int soma = 0;

        for (int consec = 1; consec < num; consec++) {
            soma += consec;
            if (soma == num) {
                return true;
            }
        }
        return false;
    }


}
