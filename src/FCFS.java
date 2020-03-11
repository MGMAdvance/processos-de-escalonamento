package src;

class FCFS extends Algoritmo{
    private int ms = 0;

    public int soma(int num){
        return this.ms += num;
    }

    public void processar(){
        int total = 0;
        for(int i = 0; i < getListaSize(); i++){
            msg("Processo #"+(i+1)+" processado em "+getQuantum(i)+"ms");
            soma(getQuantum(i));
            total++;
        }

        msg("\nAlgoritmo FCFS finalizado em "+this.ms+"ms com total de "+total+" processos...\n");
    }
    
    public void execute(){
        processar();
    }
}