import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Ex1: Troca do valor de variaveis A e B");
        ex1();
        System.out.println("Ex5: Antecessor");
        ex5();
        System.out.println("Ex6: Area do Retangulo");
        ex6();
        System.out.println("Ex7: Idade em dias");
        ex7();
        System.out.println("Ex9: Reajuste de Salario");
        ex9();
        System.out.println("Ex10: Custo Final Carro");
        ex10();
        System.out.println("Ex14: Maior que 10");
        ex14();
        System.out.println("Ex15: Negativo ou Positivo");
        ex15();
        System.out.println("Ex17: Aprovado ou Reprovado");
        ex17();
        System.out.println("Ex19: Maior entre dois valores");
        ex19();


    }

    public static void ex1()    {
        // Escreva um algoritmo que armazene o valor 10 em uma variável A e o valor 20 em uma variável B.
        // A seguir (utilizando apenas atribuições entre variáveis) troque os seus conteúdos fazendo com que o
        // valor que está em A passe para B e vice-versa. Ao final, escrever os valores que ficaram armazenados
        // nas variáveis.
        int a = 10;
        int b = 20;
        int aux;
        aux = a;
        a = b;
        b = aux;
        System.out.println("Variavel A = " +a);
        System.out.println("Variavel B = " +b);
    }


    public static void ex5()  {
        // Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o numero:");
        int numero = scanner.nextInt();
        System.out.println("Antecessor = :" +(numero -1));
    }


    public static void ex6()    {
        // Escreva um algoritmo para ler as dimensões de um retângulo (base e altura),
        // calcular e escrever a área do retângulo.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a base do retangulo:");
        double base = scanner.nextDouble();
        System.out.println("Insira a altura do retangulo");
        double altura = scanner.nextDouble();
        System.out.println("A area do retangulo é:" +(base * altura));
    }


    public static void ex7()    {
        // Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade
        // dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira quantos anos voce tem:");
        int ano = scanner.nextInt();
        System.out.println("Insira quantos meses voce tem:");
        int mes= scanner.nextInt();
        System.out.println("Insira quantos dias voce tem:");
        int dia = scanner.nextInt();

        System.out.println("Voce tem " +((ano *365) +(mes *30)+ dia));
    }


    public static void ex9()    {
        // Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
        // Calcular e escrever o valor do novo salário.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira seu salario mensal:");
        double salario = scanner.nextDouble();
        System.out.println("Insira o reajuste em porcentagem:");
        double reajuste = scanner.nextDouble();
        System.out.println("O seu salario reajustado é de: " +((salario) *(1 + reajuste /100)));
    }


    public static void ex10()   {
        /* Ler custo de fabrica de um carro, calcular impostos e escrever custo final
         * Distribuidor (%): 28
         * Imposto (%): 45
         */
        Scanner scanner = new Scanner(System.in);

        double distribuidor = 28;
        double imposto = 45;
        System.out.println("Insira custo de fabrica:");
        double custoFabrica = scanner.nextDouble();

        System.out.println("O valor final do carro é: " +(
                    (custoFabrica)
                    +(custoFabrica *(distribuidor /100))
                    +(custoFabrica *(imposto /100))
                )
        );
    }


    public static void ex14()   {
        /* Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso
         * contrário escrever NÃO É MAIOR QUE 10!
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um numero:");
        double numero = scanner.nextDouble();
        if (numero >10) {
            System.out.println("É MAIOR QUE 10!");
        }

        else {
            System.out.println("NÃO É MAIOR QUE 10!");
        }

    }


    public static void ex15()   {
        // Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo)
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um numero:");
        double numero = scanner.nextDouble();
        if (numero >= 0)    {
            System.out.println("O numero é positivo");
        }
        else {
            System.out.println("O numero é negativo");
        }
    }


    public static void ex17()   {
        /* Ler notas de 2 avaliacoes de um aluno
         * Calcular media aritmetica simples
         * Escrever uma mensagem se aprovado ou nao (>=6 aprovado)
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a nota da avaliacao 1:");
        double aval1 = scanner.nextDouble();
        System.out.println("Insira a nota da avaliacao 2:");
        double aval2 = scanner.nextDouble();
        double media = (aval1 +aval2) /2;
        if (media <6)  {
            System.out.println("Reprovado");
        }
        else {
            System.out.println("Aprovado");
        }
    }


    public static void ex19()   {
        // Ler dois valores e escreva o maior deles
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um valor:");
        double valor1 = scanner.nextDouble();
        System.out.println("Insira outro valor:");
        double valor2 = scanner.nextDouble();
        if (valor1 > valor2)    {
            System.out.println(valor1);
        }
        else {
            System.out.println(valor2);
        }
    }
}