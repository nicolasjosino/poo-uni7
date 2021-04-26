import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    ContaPoupanca poupanca = new ContaPoupanca();
    Scanner scanner = new Scanner(System.in);

    int opcao = 0;
    do {
      System.out.println("Digite a opção desejada:");
      System.out.println("1 - Sacar");
      System.out.println("2 - Depositar");
      System.out.println("0 - Sair do sistema");
      System.out.print("Sua opção: ");
      opcao = scanner.nextInt();

      try {
        if (opcao == 1) {
          System.out.print("Digite o valor a ser sacado: ");
          int valor = scanner.nextInt();
          poupanca.sacar(valor);
          System.out.println("Valor sacado com sucesso");
        }
        if (opcao == 2) {
          System.out.print("Digite o valor a ser depositado: ");
          int valor = scanner.nextInt();
          poupanca.depositar(valor);
          System.out.println("Valor depositado com sucesso");
        }
      } catch (Exception e) {
        System.out.println("Ocorreu um erro." + e.getMessage());
      }
    } while (opcao != 0);
    System.out.print("Saindo do sistema");
  }
}

/*
Ex aula passada:
1 - Implemente um método que recebe dois números inteiros, a e b, e executa o cálculo a / b. Seu método lança uma exceção caso o valor de b seja igual a 0. Implemente ainda um método main que execute seu método e capture possíveis exceções lançadas por ele.

2 - Crie uma classe ContaPoupanca que possua métodos para depositar e sacar uma determinada quantia de dinheiro. Implemente ainda suas próprias exceções para tratar possíveis erros que possam acontecer ao executar os métodos sacar e depositar. Implemente um método main que execute ambos os métodos e capture possíveis exceções.
*/
