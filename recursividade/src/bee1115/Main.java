package bee1115;

import java.util.Scanner;

public class Main {


    public static void Entrada(Scanner dado) {

        int x = dado.nextInt();
        int y = dado.nextInt();

        if (x == 0 || y == 0) {

            return;

        }
        if (x > 0 && y > 0) {
            System.out.println("primeiro");
        } else if (x > 0 && y < 0) {
            System.out.println("quarto");
        } else if (x < 0 && y > 0) {
            System.out.println("segundo");
        } else  {
            System.out.println("terceiro");

        }
        Entrada(dado);
    }
        public static void main (String[]args){
            Scanner dado = new Scanner(System.in);
            Entrada(dado);
        }

    }

