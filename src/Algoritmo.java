package src;

import java.util.ArrayList;

abstract class Algoritmo {
    
    private ArrayList<Processo> listaProcessos = new ArrayList<Processo>();

    /**
     * Adiciona um processo na ArrayList
     * @param id
     * @param quantum
     */
    public void addProcesso(int id, int quantum){
        this.listaProcessos.add(new Processo(id, quantum));
    }

    /**
     * Retorna o Objeto do processo na ArrayList
     * @param id
     * @return
     */
    public Processo getProcesso(int id) {
        return this.listaProcessos.get(id);
    }

    /**
     * Retorna a ArrayList completa
     * @return
     */
    public ArrayList<Processo> getAllProcessos(){
        return this.listaProcessos;
    }

    /**
     * Retorna o ID do processo referente ao Index procurado.
     * @param index
     * @return O ID do Processo <Integer>
     */
    public Integer getId(int index){
        return this.listaProcessos.get(index).getIdProcesso();
    } 

    /**
     * Retorna o Quantum do processo referente ao Index procurado.
     * @param index
     * @return O Quantum do Processo <Integer>
     */
    public Integer getQuantum(int index){
        return this.listaProcessos.get(index).getQuantum();
    }

    /**
     * Retorna a Prioridade do processo referente ao Index procurado.
     * @param index
     * @return A Prioridade do Processo <Integer>
     */
    public Integer getPrioridade(int index){
        return this.listaProcessos.get(index).getPrioridade();
    }

    /**
     * Retorna uma Array referente ao Processo escolhido
     * @param id
     * @return
     */
    public ArrayList<Integer> getProcessoArrayInfo(int id){
        ArrayList<Integer> Processo = new ArrayList<Integer>();

        Processo.add(this.getProcesso(id).getIdProcesso());
        Processo.add(this.getProcesso(id).getQuantum());
        Processo.add(this.getProcesso(id).getPrioridade());

        return Processo;
    }
}