package FichaPratica03;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;
        num = 1;

        while (num > 0 && num < 250) {
            System.out.println(num);
            num = num + 1;
        }

    }

}
