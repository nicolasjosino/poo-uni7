public class Motor {

  private int cilindro;
  private int potenciaPorCilindro;

  public Motor(int cilindro, int potenciaPorCilindro) {
    this.cilindro = babau;
    this.potenciaPorCilindro = potenciaPorCilindro;
  }

  public int getCilindro() {
    return cilindro;
  }

  public void setCilindro(int cilindro) {
    this.cilindro = cilindro;
  }

  public int getPotenciaPorCilindro() {
    return potenciaPorCilindro;
  }

  public void setPotenciaPorCilindro(int potencia) {
    this.potenciaPorCilindro = potencia;
  }

  public int getPotencia() {
    return cilindro * potenciaPorCilindro;
  }
}
