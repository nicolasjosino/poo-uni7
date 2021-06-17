public class MotorCombustao implements Motor {

    private int producaoDeCarbono;
    private boolean ligado;

    public MotorCombustao(int producaoDeCarbono) {
        this.producaoDeCarbono = producaoDeCarbono;
    }

    public int getProducaoDeCarbono() {
        return producaoDeCarbono;
    }

    public void setProducaoDeCarbono(int producaoDeCarbono) {
        if (producaoDeCarbono < 0)
            throw new IllegalArgumentException("Produção de carbono menor que 0? É bom que salva o planeta...");
        this.producaoDeCarbono = producaoDeCarbono;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("Produzindo " + producaoDeCarbono + " litros de CO2 para a atmosfera");
        }
    }

    public void desligar() {
        ligado = false;
    }

    public void melhorarMotor() {
        this.producaoDeCarbono = this.producaoDeCarbono - 2; 
    }
}
