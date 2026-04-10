public class Cartao implements FormaPagamento {
    @Override
    public void pagar(double valor) {
         System.out.println("O pagamento está sendo feito via cartão com o valor: R$"+valor);
    }
}
