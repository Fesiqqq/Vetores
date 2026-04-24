import java.util.Scanner;

public class ESTOQUE {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        System.out.print("Quantidade de produtos: ");
        int n = leitor.nextInt();


        int[] estoque = new int[n];
        int contadorEstoqueBaixo = 0;


        for (int i = 0; i < n; i++) {
            System.out.print("Estoque produto " + (i + 1) + ": ");
            estoque[i] = leitor.nextInt();
        }


        for (int i = 0; i < estoque.length; i++) {
            if (estoque[i] < 5) {
                contadorEstoqueBaixo++;
            }
        }


        System.out.println("Produtos com estoque baixo: " + contadorEstoqueBaixo);

        leitor.close();
    }
}