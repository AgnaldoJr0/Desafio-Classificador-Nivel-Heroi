
import java.util.Scanner;

public class Classificador {
    public static void main(String[] args) throws Exception {
        String classificador;

        String nomeHeroi;
        int xpHeroi;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite seu nome do Herói: ");
            nomeHeroi = scanner.nextLine();
            System.out.print("Digite o xp do Herói: ");
            xpHeroi = scanner.nextInt();
        }

        if (xpHeroi < 1000) {
            classificador = "Ferro";
        } else if (xpHeroi >= 1001 && xpHeroi <= 2000) {
            classificador = "Bronze";
        } else if (xpHeroi >= 2001 && xpHeroi <= 5000) {
            classificador = "Prata";
        } else if (xpHeroi >= 5001 && xpHeroi <= 7000) {
            classificador = "Ouro";
        } else if (xpHeroi >= 7001 && xpHeroi <= 8000) {
            classificador = "Platina";
        } else if (xpHeroi >= 8001 && xpHeroi <= 9000) {
            classificador = "Ascendente";
        } else if (xpHeroi >= 9001 && xpHeroi <= 10000) {
            classificador = "Imortal";
        } else if (xpHeroi > 10000) {
            classificador = "Radiante";
        } else {
            classificador = "Herói ainda não iniciou a sua jornada";
        }

        System.out.println("O Heroi de nome " + nomeHeroi + " esta no nivel de " + classificador);
    }
}
