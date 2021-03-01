public class Pneu {

  private int diametro;
  private int largura;

  public Pneu(int diametro, int largura) {
    this.diametro = diametro;
    this.largura = largura;
  }

  public void setDiametro(int diametro) {
    this.diametro = diametro;
  }

  public int getDiametro() {
    return this.diametro;
  }

  public void setLargura(int largura) {
    this.largura = largura;
  }

  public int getLargura() {
    return this.largura;
  }

}