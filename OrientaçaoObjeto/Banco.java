package OrientaçaoObjeto;

public class Banco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    private float mensalidade;


    public Banco(int numConta,  String tipo, String dono) {
        abrirConta(tipo, dono);
        setnumConta(numConta);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setnumConta(int numConta) {
        this.numConta = numConta;
    }


    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }


    public String getDono(){
        return dono;
    }

    public void setDono(String dono){
        this.dono = dono;
    }

    public float getSaldo(){
        return saldo;
    }

    public void setSaldo(float saldo){
        this.saldo = saldo;
    }


    public boolean isStatus(){
        return status;
    }

    public void setStatus(boolean status){
        this.status = status;
    }


    public float getMensalidade(){
        return mensalidade;
    }

    public void setMensalidade(float mensalidade){
        this.mensalidade = mensalidade;
    }


    public void abrirConta(String tipo, String dono) {
        setStatus(true);

        if (tipo.equals("CC")) {
            setSaldo(50);
        } else if (tipo.equals("CP")) {
            setSaldo(150);
        }

        setTipo(tipo);
        setDono(dono);

    }

    public void fecharConta() {

        if (getSaldo() > 0) {
            System.out.println("\nRetire o Saldo da Sua Conta!");
            System.out.println("Impossível Apagar Conta!");
            System.out.println("Saldo atual: " + getSaldo());

        } else if (getSaldo() < 0) {
            System.out.println("\nVocê Está em Debito!");
            System.out.println("Impossível Apagar Conta!");
            System.out.println("Saldo atual: " + getSaldo());

        } else if (!isStatus()) {
            System.out.println("\nConta Já Apagada!");
            System.out.println("Impossível Apagar Conta!");

        } else {
            setStatus(false);
            setTipo(null);
            setDono(null);
            setnumConta(0);
        }

    }


    public void sacar(float valor){

        boolean blockStatus = !isStatus();
        boolean blockSaldo = getSaldo() < valor;

        boolean bloqueio = blockSaldo || blockStatus;

        if (bloqueio) {
            if (blockStatus) {
                System.out.println("\nConta Inexistente!");
                System.out.println("Impossível Sacar!");

            } else {
                System.out.println("\nSaldo insuficiente!");
                System.out.println("Impossível Sacar!");

            }

        } else  {
            setSaldo(getSaldo() - valor);

        }
    }


    public void depositar(float valor) {
        if (!isStatus()) {
            System.out.println("\nConta Não Existente!");
            System.out.println("Impossível Realizar Deposito!");

        } else {
            setSaldo(getSaldo() + valor);

        }
    }


    public void pagarMensal(){

        if (isStatus()) {

            if (getTipo().equals("CC")) {
                setMensalidade(12);

            } else if (getTipo().equals("CP")) {
                setMensalidade(10);

            }
            setSaldo(getSaldo() - getMensalidade());
            System.out.printf("\nMensalidade [R$ %.2f]Paga com Sucesso!\n",  getMensalidade());

        } else {
            System.out.println("\nConta Inexistente!");
            System.out.println("Impossivel Pagar Mensalidade!");

        }

    }
}
