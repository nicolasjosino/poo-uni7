package banco.produtos;

public class ContaPoupanca extends Produto {

  private static double porcentagemSelic;

  public void calcularRendimento() {
    //Conta Poupança tem rendimento de 2% a.a. se a Selic for maior que 10% a.a., ou 10% da Selic caso contrário.

    double saldoAtual = getSaldo();  
    double rendimento;

    if (porcentagemSelic > 10) {
      rendimento = saldoAtual * (0.02/12);
    }
    else {
      rendimento = porcentagemSelic * 0.10;
    }

    setSaldo(saldoAtual + rendimento);


    ContaCorrente.soma(1, 2);
  }

  public String getTipo() {
    return "Conta Poupanca";
  }

  public static double getSelic() {
    return porcentagemSelic;
  }

  public static void setSelic(double selic) {
    porcentagemSelic = selic;
  }

  public String toString() {
    return "Poupanca " + getConta() + " Saldo: " + getSaldo() + " Senha: " + senha;
  }

  public boolean equals(Object obj) {
    if (obj instanceof ContaPoupanca) {
      ContaPoupanca outraPoupanca = (ContaPoupanca) obj;
      return this.getConta() == outraPoupanca.getConta();
    }
    else {
      return false;
    }
  }

}
