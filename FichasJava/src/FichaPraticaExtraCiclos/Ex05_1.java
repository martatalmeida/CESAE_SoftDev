package FichaPraticaExtraCiclos;

public class Ex05_1 {

    public static void main(String[] args) {

        int num;
        num = 1;

        for (int i = 1; i <= 5; i++) {
            for (int col = 0; col < i; col++) {
                System.out.print(num + " ");
            }
            num++;
            System.out.println(" ");
        }

    }

}
