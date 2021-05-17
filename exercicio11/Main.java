import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) throws Exception {
    List<Thread> threads = new ArrayList<>();
    
    for (int i = 0; i < 10; i++) {
      Thread a = new ThreadA("ID="+i);
      a.start();
      threads.add(a);
    }

    for (Thread a : threads) {
      a.join();
    }

    Thread b = new Thread(new ThreadB(10));
    b.start();
    b.join();

    System.out.println("Main: print 1");
    System.out.println("Main: print 2");
    System.out.println("Main: print 3");

  }
}
