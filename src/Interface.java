import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n" + //
                        "\n" + //
                        "    _    _                          _      _       _ \n" + //
                        "   / \\  | | _____  ____ _ _ __   __| |_ __(_) __ _| |\n" + //
                        "  / _ \\ | |/ _ \\ \\/ / _` | '_ \\ / _` | '__| |/ _` | |\n" + //
                        " / ___ \\| |  __/>  < (_| | | | | (_| | |  | | (_| |_|\n" + //
                        "/_/   \\_\\_|\\___/_/\\_\\__,_|_| |_|\\__,_|_|  |_|\\__,_(_)\n" + //
                        "\n" + //
                        "");

        int choice;
        do {
            System.out.println("(1) categorias");
            System.out.println("(2) Sobre o projeto");
            System.out.println("O que vai ser?");
            System.out.print("Sua escolha: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // evita uma possivel erro de leitura; onde o cursor do terminal pula a escolha;

            if (choice != 1 && choice != 2) {
                System.out.println("Digite um valor validado (1 ou 2).");
            }

        } while (choice != 1 && choice != 2);    

        switch (choice) {
            case 1:
                
                break;
            
            case 2:

                break;
        }
    }
}