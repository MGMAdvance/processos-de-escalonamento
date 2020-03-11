package src;

import java.util.Scanner;

class FCFS extends Algoritmo {
    private int ms = 0;

    public int soma(int num) {
        return this.ms += num;
    }

    public void prepare() {
        Scanner scanner = new Scanner(System.in);

        this.msg("Deseja criar quantos processos?");
        int qt = scanner.nextInt();

        // int id
        int quantum;
        for (int i = 0; i < qt; i++) {
            // fifo.msg("Digite o ID do processo: ");
            // id = scanner.nextInt();

            this.msg("Digite o Quantum do processo #" + (i + 1) + ": ");
            quantum = scanner.nextInt();

            this.addProcesso(new Processo(i, quantum));
        }

        scanner.close();
    }

    public void processar() {
        int total = 0;
        for (int i = 0; i < getListaSize(); i++) {
            msg("Processo #" + (i + 1) + " processado em " + getQuantum(i) + "ms");
            soma(getQuantum(i));
            total++;
        }

        msg("\nAlgoritmo FCFS finalizado em " + this.ms + "ms com total de " + total + " processos...\n");
    }

    public void execute() {
        processar();
    }
}