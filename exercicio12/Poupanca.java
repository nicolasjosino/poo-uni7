public class Poupanca {

  private int saldo;

  public void depositar(int valor) {
    if (valor > 0)
      saldo += valor;
  }

  public synchronized void sacar(int valor) {
    if (saldo >= valor)
      saldo -= valor;
  }

  public int getSaldo() {
    return saldo;
  }

}


//Thread 1  - 500 - 100 = 400
//Thread 2  - 500 - 200 = 300?