public class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(String numero, String titular) {
        super(numero, titular);
    }
    @Override
    public boolean sacar(double valor) {
        if (saldo >= valor && valor > 0) {
            saldo -= valor;
            System.out.println("R$" + valor + " sacado com sucesso!");
            return true;
        }
        System.out.println("Saldo insuficiente!");
        return false;
    }
    @Override
    public String toString() {
        return "Conta Poupança: " + super.toString();
    }
}
