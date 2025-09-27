import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (FileWriter escritor = new FileWriter("saida.txt")) {
            System.out.println("Digite o texto que será convertido para um arquivo txt. Digite --fim-- para encerrar):");

            while (true) {
                String linha = scanner.nextLine();
                if (linha.equalsIgnoreCase("--FIM--")) {
                    break;
                }
                escritor.write(linha + System.lineSeparator());
            }

            System.out.println("Texto salvo com sucesso em saida.txt!");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao salvar o arquivo.");
            e.printStackTrace();
        }

        scanner.close();
    }
}
