class Main {
  public static void main(String[] args) {
   
    Semaforo sem = new Semaforo(0);
    
    Thread th1 = new Thread1(sem);
    Thread th2 = new Thread2(sem);
    
    th1.start();
    th2.start();
  }
}
