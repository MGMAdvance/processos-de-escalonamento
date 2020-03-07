package processos;

public class Main{
  public static void main(String args[]){
    FCFS fifo = new FCFS();

    fifo.addProcesso(8);
    fifo.addProcesso(300);
    fifo.addProcesso(23);

    fifo.getProcesso(1);
  }
}