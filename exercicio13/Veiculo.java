public interface Veiculo {

  void dirigir();
  void parar();

}

public interface VeiculoComPortas extends Veiculo {
  void abrirPortas();
}

public interface VeiculoComTanque extends Veiculo {
  void abastecer();
}


