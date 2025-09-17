import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MaterialRepository database = new MaterialRepository();

        // Adiciona categorias
        database.addCategory("Java");
        database.addCategory("Python");
        database.addCategory("C");
        database.addCategory("Ruby");
        database.addCategory("Data Structure");

        // Popula cada categoria com materiais diferentes
        database.addMaterial("Introducao a Java", "Guia para iniciantes em Java", "Gabriel dos Santos", "#", "Java");
        database.addMaterial("Java Avançado", "Tópicos avançados de Java", "Maria Oliveira", "#", "Java");

        database.addMaterial("Python Básico", "Aprenda Python do zero", "João Silva", "#", "Python");
        database.addMaterial("Python para Data Science", "Python aplicado à ciência de dados", "Ana Souza", "#", "Python");

        database.addMaterial("C Essencial", "Fundamentos da linguagem C", "Carlos Lima", "#", "C");
        database.addMaterial("Estruturas em C", "Estruturas de dados em C", "Fernanda Costa", "#", "C");

        database.addMaterial("Ruby on Rails", "Desenvolvimento web com Ruby", "Lucas Pereira", "#", "Ruby");
        database.addMaterial("Ruby Básico", "Primeiros passos com Ruby", "Juliana Ramos", "#", "Ruby");

        database.addMaterial("Algoritmos", "Introdução a algoritmos", "Pedro Martins", "#", "Data Structure");
        database.addMaterial("Estruturas de Dados", "Listas, pilhas e filas", "Sofia Alves", "#", "Data Structure");

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
                            database.printMaterials(currCategory);
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