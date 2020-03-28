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
        int qtProcessos = 0;
        qtProcessos = listaProcessos.size();
        
        // O processo #1 executou com 10 segundos, faltam 5 segundos para finalizar
        int a = 0;
        int contador = 0; //Primeira posição da fila
        while(qtProcessos != 0){
            

            a = listaProcessos.get(contador).getQuantum();
            a = (a-quantumAlgoritmo) < 0 ? 0 : a-quantumAlgoritmo;
            listaProcessos.get(contador).setQuantum(a);
            
            if (listaProcessos.get(contador).getQuantum() > 0){
                //cria um processo identico ao que foi testado no if
                Processo novoProcesso = listaProcessos.get(contador); 
                // remove o processo com quantum maior que 0
                listaProcessos.remove(contador);
                // adiciona o processo que foi clonado no final do processo
                listaProcessos.add(novoProcesso);
            } else {
                qtProcessos--;
            }

            System.out.print(String.format("\n O Processo %d vai para a fila ", contador+1));
            this.msg(String.format("com ate %d segundos", listaProcessos.get(contador).getQuantum()));
            if (contador + 1 == listaProcessos.size()) {
            	contador = 0;
            }else {
            	contador++;
            }
            
        }

        this.msg("Acabou o programa!");
    }
}
