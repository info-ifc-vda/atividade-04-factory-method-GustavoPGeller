public class PagamentoBoleto extends Pagamento {
    @Override
    public FormaPagamento criarFormaPagamento()
    {
        return new Boleto();
    }
}
