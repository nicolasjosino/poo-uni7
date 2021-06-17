import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        MotorCombustao motor = new MotorCombustao(150);
        Veiculo veiculo = new Veiculo(TipoDeVeiculo.CARRO, motor);
        Motorista seuZe = new Motorista("Seu zé", LocalDate.of(2020, 12, 31));

        try {
            seuZe.dirigir(veiculo);
        } catch (InfracaoException e) {
            System.out.println(e.getMessage());
            seuZe.renovarCNH();
        }

        seuZe.dirigir(veiculo);
        seuZe.melhorarMotor();
        seuZe.estacionar();

        Motorista joao = new Motorista("Joao", LocalDate.of(2022, 10, 18));
        joao.dirigir(veiculo);
        joao.estacionar();
    }
}

/*
 * No código encontra-se uma violação do princípio de Inversão de Independência
 * com a classe Motor, pois a classe Carro (alto nível) depende do mesmo (baixo
 * nível), porém de forma muito específica. A solução foi tornar Motor uma
 * interface, com os métodos ligar(), desligar() e melhorarMotor(), e o conteúdo
 * original foi levado a uma nova classe MotorCombustao. Agora é possível, por
 * exemplo, criar uma classe MotorEletrico que implemente a interface Motor(), e
 * assim instanciar carros com motor elétrico.
 */