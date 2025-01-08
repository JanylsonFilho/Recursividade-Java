package bee1028;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner dado = new Scanner(System.in);
        int n = dado.nextInt();


        for (int i =0;i<n;i++){
            int x=dado.nextInt();
            int y = dado.nextInt();
            System.out.println(mdc(x,y));
        }

    }

public static int mdc(int x,int y ){
        if (y == 0){
            return x;
        }
        return mdc(y,x%y);
}



}
