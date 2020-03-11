package src;

public class App{
  public static void main(String[] args) {
    
    // Teste
    Teste testando = new Teste();
    testando.addProcesso(new Processo(1, 2));
    testando.addProcesso(new Processo(777, 31));
    
    System.out.println(testando.getId(1)); // Output: 777
    System.out.println(testando.getQuantum(1) + "ms"); // Output: 31ms
    System.out.println(testando.getPrioridade(1)); // Output: 3
  }
}