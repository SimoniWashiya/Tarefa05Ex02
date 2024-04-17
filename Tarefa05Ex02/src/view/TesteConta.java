package view;

public class TesteConta {
    public static void main(String[] args) {
        // Criando uma nova instância da classe Conta
        Conta minhaConta = new Conta();

        // Definindo os valores dos atributos da conta
        minhaConta.setAgencia(1234);
        minhaConta.setCodigo(5678);
        minhaConta.setSaldo(1000);
        minhaConta.setLimite(500);

        // Realizando operações na conta
        System.out.println("Saldo inicial: " + minhaConta.getSaldo());
        minhaConta.deposita(500);
        System.out.println("Saldo após depósito: " + minhaConta.getSaldo());

        try {
            minhaConta.saca(2000);
            System.out.println("Saque realizado com sucesso.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao sacar: " + e.getMessage());
        }
    }
}
