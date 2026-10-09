import java.util.Scanner;

public class Atividade_Vetor_4 {

    static Scanner entrada = new Scanner(System.in);

    static void questao1() {
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }
        System.out.println("Números primos e suas posições:");
        boolean achou = false;
        for (int i = 0; i < numeros.length; i++) {
            int n = numeros[i];
            boolean primo = n >= 2;
            for (int d = 2; d <= n / 2; d++) {
                if (n % d == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.println("Número " + n + " na posição " + i);
                achou = true;
            }
        }
        if (!achou) {
            System.out.println("Nenhum número primo foi encontrado.");
        }
    }

    static void questao2() {
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[20];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Vetor A - digite o número " + (i + 1) + ": ");
            a[i] = entrada.nextInt();
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print("Vetor B - digite o número " + (i + 1) + ": ");
            b[i] = entrada.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            c[2 * i] = a[i];
            c[2 * i + 1] = b[i];
        }
        System.out.println("Vetor intercalado:");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();
    }

    static void questao3() {
        int[] v = new int[10];
        double soma = 0;
        System.out.println("Vetor sorteado:");
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * 100) + 1;
            soma += v[i];
            System.out.print(v[i] + " ");
        }
        System.out.println();
        double media = soma / v.length;
        System.out.printf("Média dos elementos: %.2f%n", media);
    }

    static void questao4() {
        int[] v = new int[20];
        System.out.println("Vetor sorteado:");
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * 30) + 1;
            System.out.print(v[i] + " ");
        }
        System.out.println();
        boolean existe = false;
        for (int i = 0; i < v.length; i++) {
            if (v[i] == 25) {
                existe = true;
            }
        }
        if (existe) {
            System.out.println("O número 25 existe no vetor.");
        } else {
            System.out.println("O número 25 não existe no vetor.");
        }
    }

    static void questao5() {
        int[] v = new int[15];
        System.out.println("Vetor sorteado:");
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * 50) + 1;
            System.out.print(v[i] + " ");
        }
        System.out.println();
        int indice = -1;
        for (int i = 0; i < v.length; i++) {
            if (v[i] == 20) {
                indice = i;
                break;
            }
        }
        if (indice != -1) {
            System.out.println("O número 20 foi encontrado no índice " + indice);
        } else {
            System.out.println("O número 20 não existe no vetor.");
        }
    }

    static void questao6() {
        int[] v = new int[30];
        System.out.println("Vetor sorteado:");
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * 100) + 1;
            System.out.print(v[i] + " ");
        }
        System.out.println();
        System.out.print("Digite um valor para remover do vetor: ");
        int valor = entrada.nextInt();
        int restantes = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] != valor) {
                restantes++;
            }
        }
        if (restantes == v.length) {
            System.out.println("O valor " + valor + " não existe no vetor.");
        } else {
            int[] novo = new int[restantes];
            int posicao = 0;
            for (int i = 0; i < v.length; i++) {
                if (v[i] != valor) {
                    novo[posicao] = v[i];
                    posicao++;
                }
            }
            System.out.println("Valor removido " + (v.length - restantes) + " vez(es). Novo vetor:");
            for (int i = 0; i < novo.length; i++) {
                System.out.print(novo[i] + " ");
            }
            System.out.println();
        }
    }

    static void questao7() {
        double[] v = new double[5];
        for (int i = 0; i < v.length; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            v[i] = entrada.nextDouble();
        }
        double maior = v[0];
        double menor = v[0];
        for (int i = 1; i < v.length; i++) {
            if (v[i] > maior) {
                maior = v[i];
            }
            if (v[i] < menor) {
                menor = v[i];
            }
        }
        System.out.printf("Maior valor: %.2f%n", maior);
        System.out.printf("Menor valor: %.2f%n", menor);
    }

    static void questao8() {
        int[] a = new int[15];
        int[] b = new int[15];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100) + 1;
        }
        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length - 1 - i];
        }
        System.out.println("Vetor A:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Vetor B (A de trás para frente):");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
    }

    static void questao9() {
        System.out.print("Quantos recibos deseja imprimir? ");
        int quantidade = entrada.nextInt();
        int recibo = 1;
        while (recibo <= quantidade) {
            System.out.println("Recibo nº " + recibo);
            recibo++;
        }
    }

    static void questao10() {
        System.out.print("Digite o número da tabuada: ");
        int numero = entrada.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    static void questao11() {
        double soma = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite a temperatura " + i + ": ");
            soma += entrada.nextDouble();
        }
        double media = soma / 10;
        System.out.printf("Temperatura média: %.2f%n", media);
    }

    static void questao12() {
        System.out.println("Números pares de 1 a 50:");
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    static void questao13() {
        System.out.print("Digite um número inteiro N: ");
        int limite = entrada.nextInt();
        System.out.println("Números primos até " + limite + ":");
        for (int n = 2; n <= limite; n++) {
            boolean primo = true;
            for (int d = 2; d <= n / 2; d++) {
                if (n % d == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }

    static void questao14() {
        int etapas;
        do {
            System.out.print("Digite o número de etapas de produção (positivo): ");
            etapas = entrada.nextInt();
        } while (etapas <= 0);
        double total = 0;
        for (int i = 1; i <= etapas; i++) {
            System.out.print("Tempo da etapa " + i + " (em minutos): ");
            total += entrada.nextDouble();
        }
        System.out.printf("Tempo total de produção: %.2f minutos%n", total);
    }

    static void questao15() {
        int n;
        do {
            System.out.print("Digite quantos termos de Fibonacci deseja (positivo): ");
            n = entrada.nextInt();
        } while (n <= 0);
        long anterior = 0;
        long atual = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(anterior + " ");
            long proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
        System.out.println();
    }

    static void questao16() {
        int[] respostas = new int[5];
        for (int i = 0; i < respostas.length; i++) {
            System.out.print("Digite a resposta " + (i + 1) + ": ");
            respostas[i] = entrada.nextInt();
        }
        System.out.println("Respostas na ordem inversa:");
        for (int i = respostas.length - 1; i >= 0; i--) {
            System.out.print(respostas[i] + " ");
        }
        System.out.println();
    }

    static void questao17() {
        double soma = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite a nota do aluno " + i + ": ");
            soma += entrada.nextDouble();
        }
        double media = soma / 10;
        System.out.printf("Média das notas: %.2f%n", media);
    }

    static void questao18() {
        double[] temperaturas = new double[8];
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Digite a temperatura " + (i + 1) + ": ");
            temperaturas[i] = entrada.nextDouble();
        }
        double maior = temperaturas[0];
        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] > maior) {
                maior = temperaturas[i];
            }
        }
        System.out.printf("Maior temperatura registrada: %.2f%n", maior);
    }

    static void questao19() {
        int[] codigos = {101, 202, 303, 404, 505, 606, 707, 808, 909, 1010};
        System.out.println("Códigos cadastrados:");
        for (int i = 0; i < codigos.length; i++) {
            System.out.print(codigos[i] + " ");
        }
        System.out.println();
        System.out.print("Digite o código do produto: ");
        int codigo = entrada.nextInt();
        boolean presente = false;
        for (int i = 0; i < codigos.length; i++) {
            if (codigos[i] == codigo) {
                presente = true;
                break;
            }
        }
        if (presente) {
            System.out.println("O código " + codigo + " está presente no estoque.");
        } else {
            System.out.println("O código " + codigo + " não foi encontrado.");
        }
    }

    static void questao20() {
        double[] precos = new double[10];
        for (int i = 0; i < precos.length; i++) {
            System.out.print("Digite o preço do produto " + (i + 1) + ": ");
            precos[i] = entrada.nextDouble();
        }
        for (int i = 0; i < precos.length - 1; i++) {
            for (int j = 0; j < precos.length - 1 - i; j++) {
                if (precos[j] > precos[j + 1]) {
                    double auxiliar = precos[j];
                    precos[j] = precos[j + 1];
                    precos[j + 1] = auxiliar;
                }
            }
        }
        System.out.println("Preços em ordem crescente:");
        for (int i = 0; i < precos.length; i++) {
            System.out.printf("%.2f ", precos[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.print("\nEscolha a questão (1-20) ou 0 para sair: ");
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1 -> questao1();
                case 2 -> questao2();
                case 3 -> questao3();
                case 4 -> questao4();
                case 5 -> questao5();
                case 6 -> questao6();
                case 7 -> questao7();
                case 8 -> questao8();
                case 9 -> questao9();
                case 10 -> questao10();
                case 11 -> questao11();
                case 12 -> questao12();
                case 13 -> questao13();
                case 14 -> questao14();
                case 15 -> questao15();
                case 16 -> questao16();
                case 17 -> questao17();
                case 18 -> questao18();
                case 19 -> questao19();
                case 20 -> questao20();
                case 0 -> System.out.println("Código encerrado!");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}
