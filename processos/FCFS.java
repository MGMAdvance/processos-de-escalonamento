package processos;

import java.util.ArrayList;

public class FCFS{
  private ArrayList<Integer> listaProcessos = new ArrayList<Integer>();
  
  public void addProcesso(int quantum){
    this.listaProcessos.add(quantum);
  }

  public Integer getProcesso(int idProcesso){
    return this.listaProcessos.get(idProcesso);
  }
}