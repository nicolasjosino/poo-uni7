package receita;

public class Emprego {

  private String empresa;
  private double salario;

  public Emprego() {
  }

  public Emprego(String empresa, double salario) {
    this.empresa = empresa;
    this.salario = salario;
  }

  /**
   * @return the empresa
   */
  public String getEmpresa() {
    return empresa;
  }

  /**
   * @return the salario
   */
  public double getSalario() {
    return salario;
  }

  /**
   * @param empresa the empresa to set
   */
  public void setEmpresa(String empresa) {
    this.empresa = empresa;
  }

  /**
   * @param salario the salario to set
   */
  public void setSalario(double salario) {
    this.salario = salario;
  }

}