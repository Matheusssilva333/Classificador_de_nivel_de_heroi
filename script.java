import java.util.Scanner;

public class script {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu nome de usuário: ");
        String nome = ler.nextLine();

        System.out.println("Digite seu XP: ");
        int xp = ler.nextInt();

        System.out.println("Oi, prazer te conhecer " + nome);
        System.out.println("O seu XP a seguir: " + xp);

        // Usando if-else para intervalos de XP
        if (xp <= 1000) {
            System.out.println("Seu nível é igual a: Ferro");
        } else if (xp <= 2000) {
            System.out.println("Seu nível é igual a: Bronze");
        } else if (xp <= 5000) {
            System.out.println("Seu nível é igual a: Prata");
        } else {
            System.out.println("Seu nível é maior que Prata!");
        }

        scanner.close();
    }
}

