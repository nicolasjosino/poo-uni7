

public class ThreadB implements Runnable {

  private int x;

  public ThreadB(int x) {
    this.x = x;
  }

  public void run() {
    for (int i = 0; i < x; i++) {
      System.out.println("Executando thread B");
      try {
        Thread.sleep(1000);
      } catch (Exception e) {}      
    }
  }

}
