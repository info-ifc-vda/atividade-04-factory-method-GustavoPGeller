public class PagamentoPIX extends Pagamento {

    @Override
    public FormaPagamento criarFormaPagamento()
    {
        return new PIX();
    }
}