package src;

import java.util.Scanner;

public class App{
  public static void main(String[] args) {
    menu(new Scanner(System.in));
  }

  public static void menu(Scanner input){
    int key;
      
    System.out.println("1 - FCFS");
    System.out.println("2 - SJF");
    System.out.println("3 - Prioridade");
    System.out.println("4 - Round Robin\n");
    System.out.println("5 - Sair\n");
    System.out.println("Escolha o algoritmo: ");

    key = input.nextInt();

    switch (key) {
      case 0:
        test();
        break;

      case 1:
        menuFCFS();
        break;

      case 2:
        menuSJF();
        break;

      case 9:
        System.out.println("Adeus...");
        break;
    }

    input.close();
  }

  public static void test(){
    // Teste
    Teste testando = new Teste();
    testando.addProcesso(new Processo(1, 2));
    testando.addProcesso(new Processo(777, 31));
    
    System.out.println(testando.getId(1)); // Output: 777
    System.out.println(testando.getQuantum(1) + "ms"); // Output: 31ms
    System.out.println(testando.getPrioridade(1)); // Output: 3
  }

  public static void menuFCFS(){
    FCFS fifo = new FCFS();

    fifo.prepare();
    fifo.execute();
  }

  public static void menuSJF(){
    SJF sjf = new SJF();

    sjf.prepare();
    sjf.execute();
  }

  public static void menuPrioridade(){}

  public static void menuRoundRobin(){}
}