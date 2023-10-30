package FichaPraticaExtraCiclos;

public class Ex05_3 {

    public static void main(String[] args) {

        int num1;
        num1 = 1;

        for (int i = 1; i <= 5; i++) {
            for (int esp = 0; esp < 5-i; esp++) {
                System.out.print(" ");
            }
            for (int col = 0; col < i*2-1; col++) {
                System.out.print(num1);
            }
        }

    }

}
