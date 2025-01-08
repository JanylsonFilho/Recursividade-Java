package bee1030;


        import java.util.Scanner;

        public class Main {

            public static int josephus(int n, int k) {
                if (n == 1) {
                    return 0;
                } else {
                    return (josephus(n - 1, k) + k) % n;
                }
            }

            public static void main(String[] args) {
                Scanner dado = new Scanner(System.in);
                int testes = dado.nextInt();

                for (int i = 1; i <= testes; i++) {
                    int n = dado.nextInt();
                    int k = dado.nextInt();

                    int sobrevivente = josephus(n, k) + 1; // +1 para ajustar à indexação de 1

                    System.out.println("Case " + i + ": " + sobrevivente);
                }


            }
        }


