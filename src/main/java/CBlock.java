public class CBlock implements IConta{
    public String texto;

    public CBlock(){
        this.texto = "Bloqueada";

    }

    public void sacar(double v, Contexto c){
        System.out.println("Voce nao pode sacar, a conta esta bloqueada!");
    }

    public void depositar(double v, Contexto c){
        c.saldo += v;

        if(c.saldo >= 0){
            c.meuEstado = new CPosi();
            System.out.println("Sua conta foi desbloqueada, seu saldo passou a ser de: "+ c.saldo);
        }
        else{
            System.out.println("Sua conta ainda esta bloqueada, mas seu saldo é de: "+ c.saldo);
        }
    }

}
