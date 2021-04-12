package banco.produtos;

public class ContaCorrente extends Produto {

  public void calcularRendimento() {
    double saldoAtual = getSaldo();
    double rendimento = saldoAtual * 0.01;
    setSaldo(saldoAtual + rendimento);
  }

  public void transferir(double valor, ContaCorrente contaDestino) throws Exception {
    if (valor <= getSaldo()) {
      this.setSaldo(this.getSaldo() - valor);
      contaDestino.setSaldo(contaDestino.getSaldo() + valor);
    } else {
      throw new Exception();
    }
  }

  public String getTipo() {
    return "Conta Corrente";
  }

  static int soma(int a, int b) {
    return a + b;
  }

  public static void main(String[] args) {
    ContaCorrente cc1 = new ContaCorrente();
    ContaCorrente cc2 = new ContaCorrente();

    try {
      cc1.transferir(10.0, cc2);
      cc2.pagarConta(5, cc3);
      cc2.pagarConta(50, cc3);
    } catch (Exception e) {
      throw new Exception();
    }
  }

  // main -> B -> C -> D -> E -> F
  

}
