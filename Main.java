public class Main {
    public static void main(String[] args) {
        try {
            ContaBancaria minhaConta = new ContaBancaria(1000);
            minhaConta.depositar(1000);
            minhaConta.sacar(1000);
            double saldoAtual = minhaConta.getSaldo();
            System.out.println("Saldo atual: R$" + saldoAtual);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (LimiteExcedidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}