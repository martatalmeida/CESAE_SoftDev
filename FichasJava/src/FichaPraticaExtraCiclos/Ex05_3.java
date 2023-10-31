package FichaPraticaExtraCiclos;

public class Ex05_3 {

    public static void main(String[] args) {

        int num1;
        num1 = 1;

        for (int linhas = 1; linhas <= 5; linhas++) {
            for (int esp = 0; esp < 5 - linhas; esp++) {
                System.out.print(" ");
            }
            for (int col = 1; col < linhas + 1; col++) {
                System.out.print(num1);
            }
            for (int col = 2; col < linhas + 1; col++) {
                System.out.print(num1);
            }
             num1++;
            System.out.println(" ");

        }
    }
}
