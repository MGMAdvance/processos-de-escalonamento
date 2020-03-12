package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class SJF extends Algoritmo {

  public void prepare() {
    Scanner scanner = new Scanner(System.in);

    this.msg("Deseja criar quantos processos?");
    int qt = scanner.nextInt();

    int quantum;
    for (int i = 0; i < qt; i++) {

      this.msg("Digite o Quantum do processo #" + (i + 1) + ": ");
      quantum = scanner.nextInt();

      this.addProcesso(new Processo(i + 1, quantum));
    }

    scanner.close();
  }

  public void execute(){
    ArrayList<Processo> listaSJF = this.getAllProcessos();

    Collections.sort(listaSJF, Processo.compareByQuantum);

    for (Processo processo : listaSJF) {
      System.out.println(String.format("O processo #%x foi executado em %x ms", 
        processo.getIdProcesso(), processo.getQuantum()));
    }
    
  }
}