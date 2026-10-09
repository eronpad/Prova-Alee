public class exercicio7 {
    
    public static class ContaBancaria {
        private String titular;
        private int numeroConta;
        private double saldo;

        public String getTitular() {
            return titular;
        }

        public void setTitular(String titular) {
            this.titular = titular;
        }

        public int getNumeroConta() {
            return numeroConta;
        }

        public void setNumeroConta(int numeroConta) {
            this.numeroConta = numeroConta;
        }

        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }
        public void depositar(double valor){
            if(valor > 0){
                saldo += valor;
            }
        }
        public void sacar(double valor){
            if (valor > 0 && valor <= saldo) {
                saldo -= valor;
            }
        }
}
public static void main(String[] args) {
    ContaBancaria conta = new ContaBancaria();

    conta.setTitular("Luis Inacio");
    conta.setNumeroConta(13);
    conta.depositar(1000);
    conta.sacar(500);
    System.out.println("Conta \n " + conta.getTitular() + "\n" + conta.getNumeroConta() + "\n" + conta.getSaldo());
}
}
