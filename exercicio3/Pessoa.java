public class Pessoa {
  
  private int alturaEmCm;
   
  public void setAltura(int alturaEmCm) {
    this.alturaEmCm = alturaEmCm;
  }

  public int setAltura(double alturaEmMetros) {
    this.alturaEmCm = (int) alturaEmMetros * 100;
    return this.alturaEmCm;
  }

  public int getAlturaEmCm() {
    return alturaEmCm;
  }

  public double getAlturaEmMetros() {
    return alturaEmCm / 100d;
  }

}
