package FichaPratica06;

public class Ex05 {


    /**
     * Método para descobrir o numero maior de um vetor
     * @param array Vetor a ser avaliado
     * @return Maior numero
     */
    public static int maior(int[] array) {

        int maior = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
        }
        return maior;
    }


    /**
     * Método para descobrir o numero menor de um vetor
     * @param array Vetor a ser avaliado
     * @return Menor numero
     */
    public static int menor(int[] array) {

        int menor = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
            }
        }
        return menor;
    }


    /**
     * Método para descobrir se um vetor está crescente
     * @param array Vetor a ser avaliado
     * @return True se crescente, False se decrescente
     */
    public static boolean crescente(int[] array) {

        int numAnterior = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < numAnterior) {
                return false;
            }
            numAnterior = array[i];
        }

        return true;
    }



}
