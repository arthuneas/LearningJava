package OrientaçaoObjeto.MetodosEspeciais;

public class ContaBanco {

    //atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    private float mensalidade;


    //constructor
    public ContaBanco(int numConta, String dono) {
        setDono(dono);
        setSaldo(0);
        setStatus(false);
        setnumConta(numConta);
    }


    //metodos especiais
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


    //metodos personalizados
    public void statusConta(){

        System.out.println("----------------------------------");
        System.out.println("Conta: " + getNumConta());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Dono: " + getDono());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Status: " + isStatus());
        System.out.println("----------------------------------");
    }


    public void abrirConta(String tipo) {

        if (!isStatus()) {

            setStatus(true);
            setTipo(tipo);

            if (tipo.equals("CC")) {
                setSaldo(50);

            } else if (tipo.equals("CP")) {
                setSaldo(150);

            }

            String type = tipo.equals("CC") ? "Corrente" : "Poupança" ;

            System.out.printf("\nParabens, %s!\n", getDono());
            System.out.printf("Conta %s Aberta com sucesso!\n", type);

        } else  {
            System.out.println("Conta Já Existente!");

        }

    }


    public void fecharConta() {

        if (getSaldo() > 0) {
            System.out.println("\nConta com Saldo!");
            System.out.println("Impossível Apagar Conta!");
            System.out.println("Saldo atual: " + getSaldo());

        } else if (getSaldo() < 0) {
            System.out.println("\nConta em Debito!");
            System.out.println("Impossível Apagar Conta!");
            System.out.println("Saldo atual: " + getSaldo());

        } else {
            System.out.printf("\nA Conta de %s Fechada!\n", getDono());
            setStatus(false);

        }
    }


    public void sacar(float valor){

        boolean blockStatus = !isStatus();
        boolean blockSaldo = getSaldo() < valor;

        boolean oblique = blockSaldo || blockStatus;

        if (oblique) {
            if (blockStatus) {
                System.out.println("\nConta Fechada!");
                System.out.println("Impossível Sacar!");

            } else {
                System.out.println("\nSaldo insuficiente!");
                System.out.println("Impossível Sacar!");

            }

        } else  {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque de [R$ %.2f] Realizado!");

        }
    }


    public void depositar(float valor) {
        if (!isStatus()) {
            System.out.println("\nConta Fechada!");
            System.out.println("Impossível Realizar Deposito!");

        } else {
            setSaldo(getSaldo() + valor);
            System.out.printf("\nDeposito [R$ %.2f] Realizado!\n", getSaldo());

        }

    }


    public void pagarMensal(){

        if (isStatus()) {

            if (getTipo().equals("CC")) {
                setMensalidade(12);

            } else if (getTipo().equals("CP")) {
                setMensalidade(20);

            }

            setSaldo(getSaldo() - getMensalidade());
            System.out.printf("\nMensalidade [R$ %.2f] Paga com Sucesso!\n",  getMensalidade());

        } else {
            System.out.println("\nConta Inexistente!");
            System.out.println("Impossivel Pagar Mensalidade!");

        }

    }
}
