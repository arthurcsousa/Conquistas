package exercicios_projeto_jedi.conquista02;

//Criar um código que verifica 3 vezes (IF) se o valor de uma variável é igual a um valor qualquer,
// não atendendo em nenhum momentos as 3 condições e finalizando o fluxo no ELSE

public class Exercicio03 {
    public static void main(String[] args) {
        int finalDeSemana = 2;
        if(finalDeSemana == 6){
            System.out.println("Sexta-feira");
        }else if( finalDeSemana == 7) {
            System.out.printf("Sábado");
        }else if(finalDeSemana == 1) {
            System.out.println("Domingo");
        }else {
            System.out.println("Não é final de semana");
        }
    }
}
