package src;

import java.util.ArrayList;
import java.util.Scanner;

public class RoundRobin extends Algoritmo{
	
    public int quantumAlgoritmo = 10;
    
	public void prepare() {
        Scanner scanner = new Scanner(System.in);

        this.msg("Deseja criar quantos processos?");
        int qt = scanner.nextInt();
        int quantum;
        for (int i = 0; i < qt; i++) {

            this.msg("Digite o Quantum do processo #" + (i + 1) + ": ");
            quantum = scanner.nextInt();

            this.addProcesso(new Processo(i, quantum,0));
        }

        scanner.close(); 
    }

	public void execute(){
        ArrayList<Processo> listaProcessos = this.getAllProcessos();
        int qtProcessos = listaProcessos.size();
        
        int aux = 0;
        int contador = 0; //Primeira posição da fila
        while(qtProcessos != 0){
            
        	aux = listaProcessos.get(contador).getQuantum();
        	aux = (aux - quantumAlgoritmo) <= 0 ? 0 : aux - quantumAlgoritmo;
            listaProcessos.get(contador).setQuantum(aux);
            
            if (listaProcessos.get(contador).getQuantum() > 0){
            	apresentaProcesso(listaProcessos,contador);
            	
                // cria um processo identico ao que foi testado no if
                Processo novoProcesso = listaProcessos.get(contador); 
                // remove o processo com quantum maior que 0
                listaProcessos.remove(contador);
                // adiciona o processo que foi clonado no final do processo
                listaProcessos.add(novoProcesso);
            } else {
            	apresentaProcesso(listaProcessos,contador);
            	
                qtProcessos--;
            }
    	
            // Se o processo tiver sido finalizado, altera o valor para true
            if(aux == 0) {
            	listaProcessos.get(contador).setFinalizado(true);
            }
            
            // Se o contador tiver rodado a lista toda seu valor é resetado
            if(contador + 1 == listaProcessos.size()) {
            	contador = 0;
            } else {
            	contador++;
            }
            
        }

        this.msg("Acabou o programa!");
    }

	private void apresentaProcesso(ArrayList<Processo> lista, int contador) {
		// Se o processo não tiver sido finalizado, mostra quanto tempo falta
        if(!lista.get(contador).isFinalizado()) {
        	System.out.print(String.format("\n O Processo %d vai para a fila ", contador+1));
            System.out.println(String.format("com %d segundos restantes.", lista.get(contador).getQuantum()));
        }
	}
}