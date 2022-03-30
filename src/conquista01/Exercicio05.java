package conquista01;

import java.util.Scanner;

//Criar um código que realiza todas as funções aritméticas usando os operadores

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
           int num1;
           int num2;
        System.out.println("Digite o primeiro número: ");
        num1 = entrada.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = entrada.nextInt();

        System.out.println("Soma: "+(num1+num2));
        System.out.println("Subtração: "+(num1-num2));
        System.out.println("Multiplicação: "+(num1*num2));
        System.out.println("Divisão: "+(num1/num2));
        System.out.println("Resto: "+(num1%num2));
    }
}