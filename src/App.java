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
    System.out.println("3 - ...");
    System.out.println("4 - ...\n");
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
    Scanner scanner = new Scanner(System.in);
    
    fifo.msg("Deseja criar quantos processos?");
    int qt = scanner.nextInt();

    // int id
    int quantum;
    for(int i = 0; i < qt ; i++){
      // fifo.msg("Digite o ID do processo: ");
      // id = scanner.nextInt();

      fifo.msg("Digite o Quantum do processo #"+ (i+1) +": ");
      quantum = scanner.nextInt();

      fifo.addProcesso(new Processo(i, quantum));
    }

    fifo.execute();
    scanner.close();
  }

  public static void menuSJF(){}

  public static void menuPrioridade(){}

  public static void menuRoundRobin(){}
}