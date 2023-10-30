package FichaPraticaExtraCiclos;

public class Ex05_3 {

    public static void main(String[] args) {

        int num1, num2;
        num1 = 1;
        num2 = 1;

        for (int i = 1; i <= 5; i++) {
            for (int esp = 0; esp < 5 - i; esp++) {
                System.out.print(" ");
            }
            for (int col = 1; col < i + 1; col++) {
                System.out.print(num1);
            }
            for (int col = 2; col < i + 1; col++) {
                System.out.print(num2);
            }
            num1++;
            num2++;
            System.out.println(" ");

        }
    }
}
