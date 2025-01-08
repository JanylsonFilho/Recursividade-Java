package dois_A_;

import java.util.Scanner;

public class ene {

    public static double dois(double n ){

        if (n==0){
            return 1;
        }
        else if (n<0){
            return 1/dois(-n);

        }
        return 2*dois(n-1);
    }


    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        System.out.println("resultado: "+ dois(dado.nextDouble()));
    }
}
