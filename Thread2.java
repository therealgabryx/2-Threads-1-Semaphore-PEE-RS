public class Thread2 extends Thread {
    Semaforo sem;
    public Thread2(Semaforo s) {
      sem = s;
    }
    @Override
    public void run() { 
      sem.P(); 
      System.out.println("R");
      System.out.println("S");
      sem.V();
    } 
}
