package bee1114;

import java.util.Scanner;

    public class Main {


        public static void Entrada(Scanner dado) {

            int x = dado.nextInt();


            if (x == 2002) {

                System.out.println("Acesso Permitido");
                return;

            }
            else {
                System.out.println("Senha incorreta,digite novamente");
            }
            Entrada(dado);
        }
        public static void main (String[]args){
            Scanner dado = new Scanner(System.in);
            Entrada(dado);
        }

    }



