package model;

/*
6.
Gestao de vendas:
todas as vendas realizadas na loja sao cadastradas com um conjunto de produtos que foram vendidos 
(em um maximo de 20 produtos), 
a data da venda,
o vendedor que realizou a venda e
a forma de pagamento (dinheiro, debito ou credito).
O pagamento das vendas pode ser realizado a vista ou a prazo.
Vendas a prazo tem associado a elas o numero de parcelas, 
bem como um acrescimo de 2% no valor ﬁnal da compra.
 */
import java.util.ArrayList;
import java.util.Date;

public class GestaoVenda {

    private String dataVenda;
    private Vendedor vendedor;
    private GestaoCliente cliente;
    private ArrayList<GestaoEstoque> estoque;
    /*
    1 = dinheiro
    2 = debito
    3 = credito
     */
    private int formaPagamento;
    private int idVenda;

    public GestaoVenda(String dataVenda, Vendedor vendedor, GestaoCliente cliente, ArrayList<GestaoEstoque> estoque, int formaPagamento, int idVenda) {
        this.dataVenda = dataVenda;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.formaPagamento = formaPagamento;
        this.idVenda = idVenda;
        this.estoque = estoque;
    }

    public GestaoVenda(String dataVenda, Vendedor vendedor, GestaoCliente cliente, ArrayList<GestaoEstoque> estoque, int formaPagamento) {
        this.dataVenda = dataVenda;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.estoque = estoque;
        this.formaPagamento = formaPagamento;
    }

    //pagamento sem parcelas
    public void cadastrarBDConjuntoProdutosVendido(GestaoProduto carrinho[], Vendedor vendedor, Date dataVenda, int formaPagamento) {

    }

    // pagamento com parcelas 
    public void cadastrarBDConjuntoProdutosVendido(GestaoProduto carrinho[], Vendedor vendedor, Date dataVenda, int formaPagamento, int nParcelas) {

    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public int getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(int formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public GestaoCliente getCliente() {
        return cliente;
    }

    public void setCliente(GestaoCliente cliente) {
        this.cliente = cliente;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public ArrayList<GestaoEstoque> getEstoque() {
        return estoque;
    }

    public void setEstoque(ArrayList<GestaoEstoque> estoque) {
        this.estoque = estoque;
    }

}
