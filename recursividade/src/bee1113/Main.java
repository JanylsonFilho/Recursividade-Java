package bee1113;

import java.util.Scanner;

public class Main {

    public static void Entradas(Scanner dado){

        int x = dado.nextInt();
        int y = dado.nextInt();

        if (x == y){

            return;

        }
         if (x>y){
            System.out.println("Decrescente");

        }
         else {
            System.out.println("Crescente");

         }
         Entradas(dado);
    }


    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        Entradas(dado);
    }

}
