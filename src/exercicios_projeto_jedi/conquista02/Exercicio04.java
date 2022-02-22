package exercicios_projeto_jedi.conquista02;

//Criar um código que verifica 3 vezes (IF) se o valor de uma variável é igual a um valor qualquer,
// sendo atendida na segunda condição, não executando a terceira e nem um ELSE

public class Exercicio04 {
    public static void main(String[] args) {
        int idade = 14;
        if (idade <= 10) {
            System.out.println(" participara da categoria Infantil");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println(" participara da categoria Juvenil");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println("participara da categoria Pre-adulto");
        } else {
            System.out.println("participara da categoria Adulto");
        }
    }
}