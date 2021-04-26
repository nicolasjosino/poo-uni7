import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Poupanca poupanca = new Poupanca();
    Scanner scanner = new Scanner(System.in);

    int opcao = 0;
    do {
      System.out.println("Digite a opção desejada:");
      System.out.println("1 - Sacar");
      System.out.println("2 - Depositar");
      System.out.println("0 - Sair do sistema");
      System.out.print("Sua opção: ");
      opcao = scanner.nextInt();

      if (opcao == 1) {
        int valor = scanner.nextInt();
        poupanca.sacar(valor);
      }
      if (opcao == 2) {
        int valor = scanner.nextInt();
        poupanca.depositar(valor);
      }
    } while (opcao != 0);
    System.out.print("Saindo do sistema");
  }
}


/*
1 - Reaproveite a classe ContaPoupanca feita no último exercicio e 

construa um menu, utilizando a classe Scanner, que permita o usuário 
- depositar e 
- sacar valores de sua conta. 

Sua implementação deve tratar possíveis exceções que podem acontecer durante a operação do sistema, considerando exceções verificadas e não verificadas.
*/