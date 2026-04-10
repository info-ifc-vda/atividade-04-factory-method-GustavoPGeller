public class Boleto implements FormaPagamento {
    @Override
    public void pagar(double valor) {
         System.out.println("O pagamento está sendo feito via boleto com o valor: R$"+valor);
    }
}
