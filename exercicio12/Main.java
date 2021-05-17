import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) throws Exception {
    Poupanca p = new Poupanca();

    for (int i = 0; i < 2; i++) {
      Pessoa pessoa = new Pessoa(i, p);
      pessoa.start();
    }

  }
}