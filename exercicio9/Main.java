public class Main {

  public static void main(String[] args) {
    ContaPoupanca poupanca = new ContaPoupanca();

    try {
      poupanca.depositar(100);
      poupanca.depositar(-10);
    } catch (Exception e) {
      System.out.println("deu erro no deposito");
    }

    try {
      poupanca.sacar(5);
      poupanca.sacar(500);
    } catch (SaldoInsuficienteException e) {
      System.out.println(e.getMessage());

    } catch (SaqueNegativoException e) {
      System.out.println("tá bebado? não dá pra sacar negativo!!!");
    } catch (Exception e) {
      System.out.println("deu um erro qualquer no saque");
    }

    System.out.println("Meu saldo final é: " + poupanca.getSaldo());
  }

}

/*
Ex aula passada:
1 - Implemente um método que recebe dois números inteiros, a e b, e executa o cálculo a / b. Seu método lança uma exceção caso o valor de b seja igual a 0. Implemente ainda um método main que execute seu método e capture possíveis exceções lançadas por ele.

2 - Crie uma classe ContaPoupanca que possua métodos para depositar e sacar uma determinada quantia de dinheiro. Implemente ainda suas próprias exceções para tratar possíveis erros que possam acontecer ao executar os métodos sacar e depositar. Implemente um método main que execute ambos os métodos e capture possíveis exceções.
*/
