import cidadao.CadastroPessoa;
import cidadao.Pessoa;
import receita.*;

import java.util.Date;
import java.util.Random;
import java.util.List;

public class Main {

    private static final String[] NOMES = {"Mateus", "Camila", "Nícolas", "Cage"};
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        CadastroPessoa cadastro = new CadastroPessoa();
        CadastroDeclaracao cadastroDeclaracoes = new CadastroDeclaracao();

        for (int i = 0; i < 100; i++) {
            Pessoa pessoa = new Pessoa();
            pessoa.setNome(nomeAleatorio() + " " + nomeAleatorio());
            pessoa.setCpf(RANDOM.nextInt());
            pessoa.setNascimento(new Date());
            pessoa.setRendaMensal(10.0);

            cadastro.registrar(pessoa);

            DeclaracaoIR ir = new DeclaracaoIR(pessoa);
            ir.addEmprego(new Emprego("UNI7", 10.0));
            cadastroDeclaracoes.registrar(ir);
        }

        System.out.println("Total de pessoas: " + cadastro.getPessoas().size());
        for (Pessoa pessoa : cadastro.getPessoas()) {
            System.out.println(pessoa);
        }

        List<Pessoa> pessoasIn = cadastroDeclaracoes.verificarInconsistencias(cadastro.getPessoas());
        System.out.println(pessoasIn.size());
    }

    public static String nomeAleatorio() {
        return NOMES[RANDOM.nextInt(NOMES.length)];
    }
}


/*
 - Você foi contratado para desenvolver o Sistema Único de Cadastro de Brasileiros. Esse sistema é utilizado pela União para registrar todos os cidadãos brasileiros, junto de suas informações, como:
- Nome
- CPF
- Data de Nascimento
- Endereço
- Renda mensal

Para que o sistema possa armazenar as informações dos brasileiros, é necessário permitir que essas informações sejam armazenadas pelo sistema automaticamente em alguma estrutura de dados de sua escolha.

2 - O sistema deve ainda permitir integração com outros módulos da Receita Federal para que se permita a declaração do imposto de renda, que também poderá ser enviada pelo sistema. Uma declaração de IR possui as seguintes informações:
- Pessoa
- Lista de empregos, onde cada emprego contém o nome da empresa e o salário mensal.

3 - Finalmente, seu sistema deve permitir que seja verificado automaticamente se alguma pessoa declarou no IR uma renda incompatível com os dados informados no cadastro de cidadãos, retornando uma lista de pessoas que possuem tal inconsistencia.
*/