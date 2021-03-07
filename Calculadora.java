// CALCULADARA BY JCOSTA - Multiplicação, Soma, Divição e Subtração
// PRIMEIRO - utilizador escolhe qual tipo de calculo quer utilizar
// SEGUNDO - Insere os números ( cada um na sua vez ) e aparece o resultado conforme a escolha na opção anterior

import java.util.Scanner;

public class Calculadora

{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)

    {

        int opcao = -1;
        apresetnartitulo();

        do {

            apresentarMenu();

            opcao = scanner.nextInt();

            verificarOpcao(opcao);
            executarOpcao1(opcao);
            executarOpcao2(opcao);
            executarOpcao3(opcao);
            executarOpcao4(opcao);
            executarOpcaosair(opcao);
        }

        while (opcao != -1);

    }

    public static void apresetnartitulo()

    {

        System.out.println("\n           BEM-VINDO A CALCULADORA DO J'COSTA");

    }

    public static void apresentarMenu()

    {
        System.out.println("\n                  Escolha uma opção:\n");
        System.out.println("                    1 - Somar");
        System.out.println("                    2 - Subtrair");
        System.out.println("                    3 - Dividir");
        System.out.println("                    4 - Multiplicar");
        System.out.println("                   -1 - Sair");
        System.out.print("\nSelecione opção: ");
    }

    public static void executarOpcao1(int opcao)

    {
        switch (opcao)

        {
            case 1:
                System.out.print("Introduza 1 número:");
                int a = scanner.nextInt();

                System.out.print("Introduza 2 número:");
                int b = scanner.nextInt();

                Calculos Calculos = new Calculos();
                System.out.println("\nResultado = " + Calculos.sum(a, b));
                break;

        }
    }

    public static void executarOpcao2(int opcao)

    {
        switch (opcao)

        {
            case 2:
                System.out.print("Introduza 1 número:");
                int a = scanner.nextInt();

                System.out.print("Introduza 2 número:");
                int b = scanner.nextInt();

                Calculos Calculos = new Calculos();
                System.out.println("\nSubtração = " + Calculos.sub(a, b));
                break;

        }
    }

    public static void executarOpcao3(int opcao)

    {
        switch (opcao)

        {
            case 3:
                System.out.print("Introduza 1 número:");
                int a = scanner.nextInt();

                System.out.print("Introduza 2 número:");
                int b = scanner.nextInt();

                Calculos Calculos = new Calculos();
                System.out.println("Divição = " + Calculos.div(a, b));
                break;

        }
    }

    public static void executarOpcao4(int opcao)

    {
        switch (opcao)

        {
            case 4:
                System.out.print("Introduza 1 número:");
                int a = scanner.nextInt();

                System.out.print("Introduza 2 número:");
                int b = scanner.nextInt();

                Calculos Calculos = new Calculos();
                System.out.println("Multiplicação = " + Calculos.multi(a, b));
                break;

        }
    }

    public static void executarOpcaosair(int opcao)

    {
        switch (opcao)

        {
            case -1:
                System.out.print("\nVolte sempre que precisar !! ^.^");
                System.out.print("\n ");
        }
    }

    public static void verificarOpcao(int opcao)

    {
        if (opcao < -1 || opcao > 4)

        {
            System.out.println("\nOpção invalida. Selecione outra opção entre 1 e 4 ou -1 para sair.\n");
        }
    }

}