public class Transferencia implements FormaPagamento {
    @Override
    public void pagar(double valor) {
         System.out.println("O pagamento está sendo feito via transferência com o valor: R$"+valor);
    }
}
