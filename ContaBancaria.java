public class ContaBancaria {
    private double saldo;
    private double limite;

    public ContaBancaria(double limite) {
        this.limite = limite;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) throws SaldoInsuficienteException, LimiteExcedidoException {
        if (valor > saldo - limite) {
            throw new SaldoInsuficienteException("Saldo insuficiente para o saque.");
        }
        if (valor > limite) {
            throw new LimiteExcedidoException("O valor do saque excede o limite.");
        }
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }
}