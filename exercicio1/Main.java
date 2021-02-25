
class Main {

  public static void main(String[] args) {
    Cachorro c1 = new Cachorro(Raca.PE_DURO, "Rex");
    c1.setIdade(10);
    c1.latir();
    c1.andar(1);

    Cachorro c2 = new Cachorro(Raca.PINSHER, "Babau", 10, 10, 3);
    c2.latir();

    for (int i = 0; i<10; i++) {
      c1.latir();
      if (i % 2 == 0)
        c2.latir();
    }
  }

}

