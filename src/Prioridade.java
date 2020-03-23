package src;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Prioridade extends Algoritmo {
	public void prepare(){
		Scanner scanner = new Scanner(System.in);

        this.msg("Deseja criar quantos processos?");
        int qt = scanner.nextInt();

        // int id
        int quantum, prd;
        for (int i = 0; i < qt; i++) {
            // fifo.msg("Digite o ID do processo: ");
            // id = scanner.nextInt();

            this.msg("Digite o Quantum do processo #" + (i + 1) + ": ");
            quantum = scanner.nextInt();

            this.msg("Digite a Prioridade do processo #" + (i + 1) + ": ");
            prd = scanner.nextInt();
            
            this.addProcesso(new Processo(i, quantum,prd));
            
        }

        scanner.close();
	}
	
	public void processar() {
		
        this.getAllProcessos().forEach(teste -> {
            System.out.println("PROCESSO: " + teste.getIdProcesso() + " --- " + teste.getPrioridade());
        });

        List<Processo> testes = this.getAllProcessos().stream()
            .sorted(Comparator.comparing(Processo::getPrioridade).reversed()).collect(Collectors.toList());
        System.out.println("--------------------------------------------------------------");

        testes.forEach(teste -> {
        	System.out.println("PROCESSO: " + teste.getIdProcesso() + " --- " + teste.getPrioridade());
        });
	}
}



