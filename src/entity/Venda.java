package entity;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import java.util.Collection;



public class Venda implements Serializable {

    private long idVenda;

    private double valor;

    private String data;

    private LinkedList<ItemVenda> itemDeVenda;

    private Cliente cliente;

    private Funcionario funcionario;

    private Pagamento pagamento;

    public Venda() {
    }

    public Venda(Cliente cliente, Funcionario funcionario) {
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.itemDeVenda = new LinkedList();
    }

    public Venda(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public long getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(long idVenda) {
        this.idVenda = idVenda;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public LinkedList<ItemVenda> getItemVenda() {
        return itemDeVenda;
    }

    public void setItemVenda(LinkedList<ItemVenda> itemDeVenda) {
        this.itemDeVenda = itemDeVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void adicionarProdutoVenda(ItemVenda novo) {
        this.itemDeVenda.add(novo);
    }

    
}
