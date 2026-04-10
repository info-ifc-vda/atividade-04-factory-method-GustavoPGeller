public class PIX implements FormaPagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("O pagamento está sendo feito via PIX com o valor: R$"+valor);
    }
}
