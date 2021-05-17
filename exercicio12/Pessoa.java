import java.util.Random;

public class Pessoa extends Thread {

  private int id;
  private Poupanca poupanca;

  public Pessoa(int id, Poupanca poupanca) {
    this.id = id;
    this.poupanca = poupanca;
  }

  public void run() {
    Random randGen = new Random();
    for (int i = 0; i < 10; i++) {
      int valor = randGen.nextInt(1000);

      if (randGen.nextBoolean()) {
        System.out.println(id + " sacando " + valor);
        poupanca.sacar(valor);
      } else {
        System.out.println(id + " depositando " + valor);
        poupanca.depositar(valor);
      }

      System.out.println(id + " saldo final = " + poupanca.getSaldo());
    }
  }


}