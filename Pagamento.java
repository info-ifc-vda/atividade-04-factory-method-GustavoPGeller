public abstract class Pagamento {
    //private double valor;

    public void fazerPagamento(double valor)
    {
        System.out.println("Iniciando o processo de pagamento");
        FormaPagamento formaPagar = criarFormaPagamento();
        formaPagar.pagar(valor);
    }

    public abstract FormaPagamento criarFormaPagamento();
}
