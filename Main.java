public class Main {
    public static void main(String[] args) {
        Pagamento p1 = new PagamentoPIX();
        p1.fazerPagamento(1250);

        Pagamento p2 = new PagamentoBoleto();
        p2.fazerPagamento(1250);

        Pagamento p3 = new PagamentoTransferencia();
        p3.fazerPagamento(1250);

        Pagamento p4 = new PagamentoCartao();
        p4.fazerPagamento(1250);
    }
}
