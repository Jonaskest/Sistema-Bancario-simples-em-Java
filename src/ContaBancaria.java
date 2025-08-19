public abstract class ContaBancaria implements OperacoesBancarias{
    private String numero;
    private String titular;
    protected double saldo;

    public ContaBancaria(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
//        this.saldo = 0.0;
    }
    public String getNumero() {
        return numero;
    }
    public String getTitular() {
        return titular;
    }
    @Override
    public double consultarSaldo() {
        return saldo;
    }
    @Override
    public void depositar(double valor) {
        if (valor >= 0) {
            saldo += valor;
            System.out.println("R$"+ valor + " depositado com sucesso!");
        } else {
            System.out.println("Valor não pode ser menor ou igual a zero. Por favor tente novamente.");
        }

    }
    @Override
    public abstract boolean sacar(double valor);

    @Override
    public String toString() {
        return "Número da Conta: " + numero +
                "\nTitular da Conta: " + titular +
                "\nSaldo: R$" + saldo;
    }
}
