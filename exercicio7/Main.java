import java.util.*;
import banco.Produto;
import banco.produtos.*;

public class Main {

  public static void main(String[] args) {
    ContaPoupanca.setSelic(10);

    ContaCorrente.soma(1, 2);

    ContaPoupanca cp1 = new ContaPoupanca();
    cp1.setConta(1);
    cp1.setSaldo(1000);
    ContaPoupanca cp2 = new ContaPoupanca();
    cp2.setConta(2);
    cp2.setSaldo(298721231);

    ContaCorrente cc1 = new ContaCorrente();
    cc1.setConta(3);
    cc1.setSaldo(90);

    TituloCapitalizacao tc1 = new TituloCapitalizacao();
    tc1.setConta(4);
    tc1.setSaldo(3813);
    TituloCapitalizacao tc2 = new TituloCapitalizacao();
    tc2.setConta(5);
    tc2.setSaldo(1239871);

    List<TituloCapitalizacao> titulos = new ArrayList<>();
    titulos.add(tc1);
    titulos.add(tc2);

    Random random = new Random();
    int vencedor = random.nextInt(titulos.size());
    TituloCapitalizacao tituloVencedor =titulos.get(vencedor);
    tituloVencedor.receberPremio(10_000);

    List<Produto> produtos = new ArrayList<>();
    produtos.add(cp1);
    produtos.add(cp2);
    produtos.add(cc1);
    produtos.add(tc1);
    produtos.add(tc2);

    for (Produto produto : produtos) {
      produto.calcularRendimento();
      System.out.println(produto.getConta() + " - " + produto.getSaldo());
    }

    
    
  }

}

/*
Modele um sistema que será utilizado por um banco. O sistema deve permitir que sejam controlados os rendimentos de certos produtos oferecidos pelo banco, como Conta Corrente, Conta Poupança e Títulos de Capitalização. Todos os produtos oferecidos pelo banco possuem dados dos titulares, como nome e CPF, além de serem identificados por um número de conta, agência e tipo de produto. O sistema deve calcular automaticamente todos os rendimentos de acordo com regras específicas de cada produto:

- Conta Corrente tem rendimento fixo de 1% do saldo ao mês.

- Conta Poupança tem rendimento de 2% a.a. se a Selic o saldo for maior que 10% a.a., ou 10% da Selic caso contrário.

- Título de Capitalização tem rendimento fixo de 0.5% do saldo ao mês e sorteios mensais de 10.000 reais onde todos os clientes concorrem.
*/