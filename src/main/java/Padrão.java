public class Padrão {
    public static void main(String[] args) {
        Contexto c1 = new Contexto();
        c1.depositar(200);
        c1.sacar(250);
        c1.sacar(400);
        c1.sacar(100);
        System.out.println(c1.saldo);

        c1.depositar(1000);
        System.out.println(c1.saldo);
    }

}
