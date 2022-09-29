public class Contexto {
    public double saldo;
    public IConta meuEstado;

    public Contexto(){
        this.saldo = 0;
        this.meuEstado = new CPosi();
        System.out.println("Parabens, sua conta foi criada! Seu saldo é de: " + this.saldo);
    }

    public Contexto(double v){
        this.saldo = v;
        this.meuEstado = new CPosi();
    }

    public void sacar(double v){
        this.meuEstado.sacar(v,this);
    }

    public void depositar(double v){
        this.meuEstado.depositar(v,this);
    }

}
