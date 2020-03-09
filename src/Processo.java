package src;

class Processo{
  private int idProcesso;
  private int quantum;
  private int prioridade;

  public Processo(int idProcesso, int quantum){
    this.idProcesso = idProcesso;
    this.quantum = quantum;
    this.prioridade = 3;
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
}