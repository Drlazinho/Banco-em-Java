public class Main {

    public static void main(String[] args) {
        Cliente lazaro = new Cliente();
        lazaro.setNome("Lázaro");

        Conta cc = new ContaCorrente(lazaro);
        Conta poupanca = new ContaPoupanca(lazaro);

        cc.depositar(3500);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
