package bee1029;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

Scanner dado = new Scanner(System.in);

int testes = dado.nextInt();
for (int i =0;i<testes;i++){
    int n =dado.nextInt();
    int calls=countCalls(n) -1;
    int fibonnacci=fib(n);

    System.out.println("fib(" + n + ") = " + calls + " calls = " + fibonnacci);
}


    }
public static int countCalls(int n ){
    if (n == 0) {
        return 1;
    } else if (n == 1) {
        return 1;
    } else {
        return 1 + countCalls(n - 1) + countCalls(n - 2);
    }

}

   public static  int fib(int n) {
        if(n < 3) {
            return 1;
        } else {
            return fib(n-1) + fib(n-2);
        }
    }

}
