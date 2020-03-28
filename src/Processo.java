package src;

import java.util.Comparator;

class Processo{
  private int idProcesso;
  private int quantum;
  private int prioridade;
  private boolean finalizado;

  public Processo(int idProcesso, int quantum, int prioridade) {
    super();
    this.idProcesso = idProcesso;
    this.quantum = quantum;
    this.prioridade = prioridade;
    this.setFinalizado(false);
  }

  public Processo(int idProcesso, int quantum){
    this.idProcesso = idProcesso;
    this.quantum = quantum;
    this.prioridade = 3;
    this.setFinalizado(false);
  }

  public int getIdProcesso(){
    return this.idProcesso;
  }

  public void setIdProcesso(int valor){
    this.idProcesso = valor;
  }
  
  public int getQuantum(){
    return this.quantum;
  }

  public void setQuantum(int valor){
    this.quantum = valor;
  }
  
  public int getPrioridade(){
    return this.prioridade;
  }

  public void setPrioridade(int valor){
    this.prioridade = valor;
  }

  public boolean isFinalizado() {
	return finalizado;
  }

  public void setFinalizado(boolean finalizado) {
	this.finalizado = finalizado;
  }

 /**
 * Retorna um Comparator para ordenar a lista de processos pelo campo quantum.
 * @return Comparador que será usado no método Collections.sort()
 */
  public static Comparator<Processo> compareByQuantum = new Comparator<Processo>() {
    public int compare(Processo o1, Processo o2) {
      return (o1.quantum - o2.quantum);
    }
  };
}