import java.util.Scanner;

public class PLACAR {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        System.out.print("Quantidade de participantes: ");
        int n = leitor.nextInt();


        int[] placares = new int[n];


        for (int i = 0; i < n; i++) {
            System.out.print("Placar " + (i + 1) + ": ");
            placares[i] = leitor.nextInt();
        }

        int maior = placares[0];
        int menor = placares[0];

        for (int i = 1; i < placares.length; i++) {
            if (placares[i] > maior) {
                maior = placares[i];
            }
            if (placares[i] < menor) {
                menor = placares[i];
            }
        }


        System.out.println("\nSaída:");
        System.out.println("Maior placar: " + maior);
        System.out.println("Menor placar: " + menor);

        leitor.close();
    }
}