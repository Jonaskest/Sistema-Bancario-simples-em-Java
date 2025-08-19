Atividade da disciplina de Padrões de Projetos em Java com o intuito de revisar os conceitos principais de orientação a objetos.

Atividade de Consolidação – Orientação a Objetos

🎯 Objetivo:

Desenvolver uma aplicação de console que simule um sistema bancário simples, utilizando os princípios da orientação a objetos: 

- Abstração (classe abstrata)
- Encapsulamento - Herança
- Polimorfismo (com sobrescrita de métodos)
- Interface - Boas práticas de coesão e acoplamento
- Distribuição de responsabilidades
  
📦 Descrição do Sistema

Você deve criar um sistema com menu interativo que permita: 
- Criar contas bancárias (corrente ou poupança)
- Realizar depósitos - Realizar saques
- Consultar saldo
- Listar todas as contas criadas
  
🧱 Estrutura de Classes

🔹 1. OperacoesBancarias (Interface)

Responsabilidade: Contrato com operações básicas que uma conta bancária deve implementar. 

Métodos: 
- void depositar(double valor)
- boolean sacar(double valor)
- double consultarSaldo()
  
🔹 2. ContaBancaria (Classe Abstrata)

Responsabilidade: Definir atributos e comportamento comum às contas. 

Atributos: 
- String numero
- String titular -
-  double saldo
  
  Métodos:
  
- Construtor com número e titular
- getNumero()
- getTitular()
- consultarSaldo()
- depositar(double valor)
- sacar(double valor) (abstrato)
- toString() (para exibir dados da conta)
  
🔹 3. ContaCorrente (Classe concreta que herda de ContaBancaria)

Responsabilidade: Representar uma conta corrente com limite de crédito. 

Atributos adicionais: 
- double limite

Métodos:

- Construtor com número, titular e limite
- Implementação de sacar(double valor) permitindo saque até o valor do limite
- Sobrescrita de toString() para exibir tipo e limite
  
🔹 4. ContaPoupanca (Classe concreta que herda de ContaBancaria)

Responsabilidade: Representar uma conta poupança sem limite de crédito. 

Métodos: 
- Construtor com número e titular
- Implementação de sacar(double valor) permitindo saque apenas do saldo
- Sobrescrita de toString() para exibir tipo da conta
  
🔹 5. Banco (Classe utilitária para gerenciar contas)

Responsabilidade: Armazenar e gerenciar todas as contas.

Atributos: 
- Lista de ContaBancaria

Métodos: 

- void adicionarConta(ContaBancaria conta)
- ContaBancaria buscarConta(String numero)
- List<ContaBancaria> listarContas()
  
🔹 6. Main (Classe principal)

Responsabilidade: Exibir menu no console e permitir a interação com o usuário. 

Funcionalidades do menu: 

1. Criar conta (corrente ou poupança)
2. Depositar em uma conta
3. Sacar de uma conta
4. Listar todas as contas
5. Consultar saldo
6. Sair
   
📌 Regras de negócio

- O número da conta deve ser único.
- O depósito e o saque só devem ocorrer se o valor for positivo.
- A conta corrente permite saque com saldo negativo, até o limite.
- A conta poupança não permite saque se o saldo for insuficiente.
  
📚 Dicas
- Use ArrayList para armazenar as contas.
- Utilize Scanner para entrada de dados.
- Crie mensagens amigáveis para o usuário.
- Use toString() para imprimir os dados das contas.
