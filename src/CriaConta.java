public class CriaConta {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta(321,456);
        primeiraConta.deposita(200);
        System.out.println(primeiraConta.getSaldo());

        primeiraConta.deposita(100);
        System.out.println(primeiraConta.getSaldo());

        Conta segundaConta = new Conta(123,456);
        segundaConta.deposita(50);
        
        Conta terceiraConta = new Conta(15478,785413);
        
        System.out.println("primeira conta tem " + primeiraConta.getSaldo());
        System.out.println("segunda conta tem " + segundaConta.getSaldo());
        System.out.println("terceira conta tem " + terceiraConta.getSaldo());

        System.out.println("referenciar: " + primeiraConta);
        System.out.println("Total de contas é: " + Conta.getTotal());
    }

}