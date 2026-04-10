public class PagamentoTransferencia extends Pagamento {
    @Override
    public FormaPagamento criarFormaPagamento()
    {
        return new Transferencia();
    }
}
