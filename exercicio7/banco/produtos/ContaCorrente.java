package banco.produtos;

public class ContaCorrente extends Produto {

  public void calcularRendimento() {
    double saldoAtual = getSaldo();
    double rendimento = saldoAtual * 0.01;
    setSaldo(saldoAtual + rendimento);
  }

  public String getTipo() {
    return "Conta Corrente";
  }

  static int soma(int a, int b) {
    return a + b;
  }

}
