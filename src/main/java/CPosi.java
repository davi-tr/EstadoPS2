public class CPosi implements IConta{
    public String texto;

    public CPosi(){
        this.texto = "Positiva";
    }

    @Override public void sacar(double v,Contexto c){
        if(c.saldo >= -100){
            c.saldo -= v;
            System.out.println("Com o saque, se saldo passou a ser de: " + c.saldo);
        }
        else{
            c.meuEstado = new CNegativa();
            System.out.println("Sua conta esta negativa, voce não pode sacar");
        }
    }

    @Override public void depositar(double v, Contexto c){
        c.saldo += v;
        System.out.println("Com o deposito, seu saldo passou a ser: "+ c.saldo);
    }

}
