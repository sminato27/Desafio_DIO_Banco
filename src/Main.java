public class Main {
    public static void main(String[] args) {
        Cliente guilherme = new Cliente();
        guilherme.setNome("Guiherme");

        Conta cc = new contaCorrente(guilherme);
        cc.depositar(300);
        Conta cp = new contaPoupanca(guilherme);
        cc.transferir(150, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
