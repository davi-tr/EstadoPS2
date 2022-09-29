public class CNegativa implements IConta{
    public String texto;

    public CNegativa(){
        this.texto = "Negativa";
    }

    public void sacar(double v,Contexto c){
        c.meuEstado = new CBlock();
        System.out.println("Voce nao pode sacar.Sua conta acabou de ser bloqueada");
    }

    public void depositar(double v, Contexto c){
        c.saldo += v;
        if(c.saldo >= 0){
            c.meuEstado = new CPosi();
            System.out.println("Sua conta foi desbloqueada! E seu saldo atual é de: "+ c.saldo);
        }
        else
            System.out.println("Seu saldo é: "+ c.saldo + ". No entanto, sua conta continua bloqueada!");
    }

}
