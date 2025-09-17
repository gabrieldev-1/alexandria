import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Database database = new Database();

        database.addCategory("Java");
        database.addCategory("Python");
        database.addCategory("C");
        database.addCategory("Ruby");
        database.addCategory("Data Structure");

        database.addMaterial("Introducao a Java", "guia para iniciantes em Java", "Gabriel dos Santos", "#", "Java");



        

        System.out.println("\n" +
                "    _    _                          _      _       _ \n" +
                "   / \\  | | _____  ____ _ _ __   __| |_ __(_) __ _| |\n" +
                "  / _ \\ | |/ _ \\ \\/ / _` | '_ \\ / _` | '__| |/ _` | |\n" +
                " / ___ \\| |  __/>  < (_| | | | | (_| | |  | | (_| |_|\n" +
                "/_/   \\_\\_|\\___/_/\\_\\__,_|_| |_|\\__,_|_|  |_|\\__,_(_)\n" +
                "");

        int choice;

        // Menu principal
        do {
            System.out.println("----------------- MENU -----------------");
            System.out.println("(1) categorias");
            System.out.println("(2) Sobre o projeto");
            System.out.print("Sua escolha: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consome o '\n'
            System.out.println("----------------------------------------");

            if (choice != 1 && choice != 2) {
                System.out.println("Digite um valor validado (1 ou 2).");
            }

        } while (choice != 1 && choice != 2);

        switch (choice) {
            case 1:
                boolean categoryFound = false;

                do {
                    database.printCategorys();
                    System.out.print("Digite o ID da categoria: ");
                    int categoryChoice = scanner.nextInt();
                    scanner.nextLine();

                    for (Category currCategory : database.categories) {
                        if (currCategory.getId() == categoryChoice) {
                            categoryFound = true;
                            currCategory.printMaterials();
                            break;
                        }
                    }

                    if (!categoryFound) {
                        System.out.println("Essa categoria nao existe. Insira um valor valido.");
                    }
                } while (!categoryFound);
                break;

            case 2:
                System.out.println("Olá! Bem-vindo(a) ao TechDocs, um catálogo de materiais acadêmicos focado em tecnologia.\n" +
                        "Aqui você poderá navegar por uma coleção de livros, PDFs e tutoriais de forma simples e rápida, diretamente do seu terminal.\n" +
                        "Este projeto foi desenvolvido com o objetivo de centralizar e organizar o acesso a materiais de estudo, facilitando o seu aprendizado e o compartilhamento de conhecimento na área de tecnologia.");
                break;
        }
    }
}