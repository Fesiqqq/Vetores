import java.util.Scanner;

public class VOTACAO {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        int[] votos = new int[3];

        System.out.print("Total de votos: ");
        int totalVotos = leitor.nextInt();


        for (int i = 0; i < totalVotos; i++) {
            System.out.print("Voto (1, 2 ou 3): ");
            int escolha = leitor.nextInt();


            if (escolha >= 1 && escolha <= 3) {

                votos[escolha - 1]++;
            } else {
                System.out.println("Voto inválido! Escolha entre 1, 2 ou 3.");
                i--;
            }
        }


        System.out.println("\nSaída:");
        int maiorVotos = -1;
        int vencedor = 0;

        for (int i = 0; i < votos.length; i++) {
            System.out.println("Candidato " + (i + 1) + ": " + votos[i] + " votos");

            if (votos[i] > maiorVotos) {
                maiorVotos = votos[i];
                vencedor = i + 1;
            }
        }

        System.out.println("Vencedor: Candidato " + vencedor);

        leitor.close();
    }
}