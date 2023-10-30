package FichaPraticaExtraCiclos;

public class Ex04_3 {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int esp = 0; esp < 5-i; esp++) {
                System.out.print(" ");
            }
            for (int col = 0; col < i*2-1; col++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
