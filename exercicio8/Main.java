import cidadao.CadastroPessoa;
import cidadao.Pessoa;

import java.util.Date;
import java.util.Random;

public class Main {

    private static final String[] NOMES = {"Mateus", "Camila", "Nícolas", "Cage"};
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        CadastroPessoa cadastro = new CadastroPessoa();

        for (int i = 0; i < 100; i++) {
            Pessoa pessoa = new Pessoa();
            pessoa.setNome(nomeAleatorio() + " " + nomeAleatorio());
            pessoa.setCpf(RANDOM.nextInt());
            pessoa.setNascimento(new Date());
            pessoa.setRendaMensal(RANDOM.nextInt(33_000));

            cadastro.registrar(pessoa);
        }

        System.out.println("Total de pessoas: " + cadastro.getPessoas().size());
        for (Pessoa pessoa : cadastro.getPessoas()) {
            System.out.println(pessoa);
        }
    }

    public static String nomeAleatorio() {
        return NOMES[RANDOM.nextInt(NOMES.length)];
    }
}
