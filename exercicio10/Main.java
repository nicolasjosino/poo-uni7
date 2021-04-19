import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
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
        opcao1();
      }
      if (opcao == 2) {
        
      }
    } while (opcao != 0);
  }

  public static void opcao1() {
    System.out.println("OP 1");
  }
}
