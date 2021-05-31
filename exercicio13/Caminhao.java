public class Caminhao extends Veiculo {

  public int getValor() {
    return 10000;
  }

  public static void main(String[] args) {

    Veiculo c = new Onibus();
    c.dirigir();
    c.estacionar();
  }
  
}