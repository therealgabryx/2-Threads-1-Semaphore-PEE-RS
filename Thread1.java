public class Thread1 extends Thread {
  Semaforo sem;

  public Thread1(Semaforo s) {
    sem = s;
  }

  @Override
  public void run() {
    System.out.println("P");
    System.out.println("E");
    sem.V();
    sem.P();
    System.out.println("E");
  }
}
