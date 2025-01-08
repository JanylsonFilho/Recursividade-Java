import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner dado = new Scanner(System.in);


        System.out.println("Versão recursiva: " + comb(dado.nextInt(), dado.nextInt()));
        System.out.println("Versão não recursiva: " + comb2(5,3));
    }
public static int comb2(int n,int k ){
    return Fat(n) / (Fat(k) * Fat(n-k));
}

    public static int Fat(int n) {
        int f = 1;

        for (int i = n; i > 0; i--)
            f = f * i;

        return f;
    }


    public static int comb(int n,int k){
if (k ==1)
    return n;
if (k == n )
    return 1;
if (1<k && k<n)

    return comb(n-1, k-1) + comb(n-1, k);

    return 0;

    }
}