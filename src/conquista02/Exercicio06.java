package conquista02;

//Criar um código com uma estrutura SWITCH que verifica se o valor de uma variável é igual ao case (a, b, c e default).
// O código deve executar apenas o default com a mensagem: “O valor não é compatível”.

public class Exercicio06 {
        public static void main(String[] args) {
            String letra = "V";
            switch (letra) {
                case "A":
                    System.out.println("Letra A");
                    break;
                case "B":
                    System.out.println("Letra B");
                    break;
                case "C":
                    System.out.println("Letra C");
                    break;
                default:
                    System.out.println("O valor não é compativel");
            }
        }
    }
