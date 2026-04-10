public class PagamentoCartao extends Pagamento{
    @Override
    public FormaPagamento criarFormaPagamento() 
    {
        return new Cartao();
    }
}
