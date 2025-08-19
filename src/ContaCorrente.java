public class ContaCorrente extends ContaBancaria {
    private double limite;

    public ContaCorrente(String numero, String titular, double limite) {
        super(numero, titular);
        this.limite = limite;
    }
    @Override
    public boolean sacar(double valor) {
        if (saldo + limite >= valor && valor > 0) {
            saldo -= valor;
            System.out.println("R$"+ valor + " sacado com sucesso!");
            return true;
        }
        System.out.println("Saque não pode ser maior que o valor do limite. Por favor tente novamente!");
        return false;
    }
    @Override
    public String toString() {
        return "Conta Corrente " + super.toString() +
                "\nLimite: R$" +  limite;
    }
}
