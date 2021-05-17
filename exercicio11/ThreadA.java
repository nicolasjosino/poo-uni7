

public class ThreadA extends Thread {

  private String id;

  public ThreadA(String id) {
    this.id = id;
  }

  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println("executando thread 1 " + id);
      try {
        Thread.sleep(1000);
      } catch (Exception e) {}      
    }
  }

}

