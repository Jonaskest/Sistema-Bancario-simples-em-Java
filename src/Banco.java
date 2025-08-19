import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<ContaBancaria> contas;

    public Banco() {
        contas = new ArrayList<>();
    }
    public void adicionarConta(ContaBancaria conta) {
        if (buscarConta(conta.getNumero()) == null) {
            contas.add(conta);
            System.out.println("Conta criada com sucesso!");
        } else {
            System.out.println("Já existe uma conta no banco de dados com esse número!");
        }
    }
    public ContaBancaria buscarConta(String numero) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumero().equals(numero)) {
                return conta;
            }
        }
        return null;
    }
    public List<ContaBancaria> listarContas() {
        return contas;
    }
}
