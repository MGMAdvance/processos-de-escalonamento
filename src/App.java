package src;

public class App{
  public static void main(String[] args) {
    Processo proc1 = new Processo(1, 3);

    System.out.println(proc1.getPrioridade() + "ms");


    // Teste
    Teste testando = new Teste();
    testando.addProcesso(1, 2);
    testando.addProcesso(777, 31);
    
    System.out.println(testando.getId(1)); // Output: 777
    System.out.println(testando.getQuantum(1) + "ms"); // Output: 31ms
    System.out.println(testando.getPrioridade(1)); // Output: 3
  }
}