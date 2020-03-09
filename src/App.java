package src;

public class App{
  public static void main(String[] args) {
    Processo proc1 = new Processo(1, 3);

    System.out.println(proc1.getPrioridade() + "ms");
  }
}