package exercicios_projeto_jedi.conquista01;

//Criar um código que compara valores iguais, maiores e menores para variáveis de tipos diferentes.
// Ex: int numero1 = 20; long numero2 = 20; numero1 == numero2. (utilizar: int, long, double, float e short)

public class Exercicio06 {
    public static void main(String[] args) {
     int num1 = 7;
     long num2= 19;
     float num3 = 50;
     double num4 = 30;
     short num5 = 7;
        System.out.println(num1 == num5);

        System.out.println(num3 > num4);

        System.out.println(num2 != num4);
    }
}

