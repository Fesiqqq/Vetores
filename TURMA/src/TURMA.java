import java.util.Scanner;

public class TURMA {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        System.out.print("Quantidade de alunos: ");
        int n = leitor.nextInt();


        double[] notas = new double[n];
        double soma = 0;


        for (int i = 0; i < n; i++) {
            System.out.print("Nota do aluno " + (i + 1) + ": ");
            notas[i] = leitor.nextDouble();
        }

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }


        double media = soma / n;
        System.out.println("Media da turma: " + media);

        leitor.close();
    }
}