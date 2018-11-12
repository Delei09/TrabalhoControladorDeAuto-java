
package mapa;
public class Automovel {
    public String motor;
    public int portas;
    private float velocidadeatual;
    public int numerorodas;
    public String farol;
    public String janela;
    public String nome;
    public float valor;

    public Automovel() {
        this.motor = "Desligado";
        this.velocidadeatual = 0;
        this.farol = "Desligado";
    }
    public String getMotor() {
        return motor;
    }
    public void setMotor(String motor) {
        this.motor = motor;
    }
    public int getPortas() {
        return portas;
    }
    public void setPortas(int portas) {
        this.portas = portas;
    }
    public float getVelocidadeatual() {
        return velocidadeatual;
    }
    public void setVelocidadeatual(float velocidadeatual) {
        this.velocidadeatual = velocidadeatual;
    }
    public int getNumerorodas() {
        return numerorodas;
    }
    public void setNumerorodas(int numerorodas) {
        this.numerorodas = numerorodas;
    }
    public String getFarol() {
        return farol;
    }
    public void setFarol(String farol) {
        this.farol = farol;
    }
    public String getJanela() {
        return janela;
    }
    public void setJanela(String janela) {
        this.janela = janela;
    }
        public String getnome() {
        return nome;
    }
    public void setnome(String nome) {
        this.nome = nome;
    }
     
    public void ligarmotor(){
        if (this.motor == "Desligado"){
        this.motor = "Ligado";
        }
        else if (this.motor == "Ligado"){
            System.out.println (" O motor já esta ligado: " +this.nome);
        }
        
    }
    public void desligarmotor(){
        if (this.motor == "Ligado"){
            this.motor = "Desligado";
        }
        else if (this.motor == "Desligado"){
            System.out.println ("O motor já esta desligado: " + this.nome);
        }
        
    }
    public void acelerar(){
        if (null != this.nome)switch (this.nome) {
            case "Moto":
                this.velocidadeatual = this.velocidadeatual+ 20;
                if (this.velocidadeatual >= 110){
                    System.out.println("Aviso de Velocidade: " + this.nome);
                }
                break;
            case "Carro":
                this.velocidadeatual = this.velocidadeatual + 10;
                if (this.velocidadeatual >= 110){
                    System.out.println("Aviso de Velocidade: "  + this.nome);
                }
                break;
            case "Caminhão":
                this.velocidadeatual = this.velocidadeatual + 5;
                if (this.velocidadeatual >= 80){
                    System.out.println("Aviso de Velocidade: " + this.nome);
                } 
                break;
            default:
                break;
        }
       
        
    }
    public void diminuir(){
        if ((this.nome == "Moto") && (this.velocidadeatual > 0)) {
            this.velocidadeatual = this.velocidadeatual - 20;    
        }
        if  ((this.nome == "Carro") && (this.velocidadeatual > 0)) {
            this.velocidadeatual = this.velocidadeatual - 10;  
        }
        if ((this.nome == "Caminhão") && (this.velocidadeatual > 0)) {
            this.velocidadeatual = this.velocidadeatual - 5;  
        }
        if (this.velocidadeatual == 0){
            System.out.println("________________________________________");
            System.out.println(" O automovel já esta parado " +this.nome);
            System.out.println("________________________________________");
        }
        
    }
    public void trocarpneus( ){
        valor = this.numerorodas * 150;
        System.out.println(" O valor da troca dos pneus do " +this.nome + " é: R$" + this.valor);       
    } 
    public void ligarfarol(){
        if (this.farol == "Desligado"){
            this.farol = "Ligado";
        }
        else if (this.farol == "Ligado"){
            System.out.println(" O farol já esta ligado: " + this.nome);
        }
        
    }
    public void desligarfarol(){
        if (this.farol == "Ligado"){
            this.farol = "Desligado";
        }
        else if (this.farol == "Desligado"){
            System.out.println(" O farol já esta desligado: " +this.nome);
        }
    }
    public void janelaabrir(){
        if (this.janela == "Fechada"){
            this.janela = "Aberta";
        }
        else if (this.janela == "Aberta"){
            System.out.println(" A janela já esta aberta" +this.nome);
        }
        
    }
    public void janelafechar(){
        if (this.janela == "Aberta"){
            this.janela = "Fechada";
        }
        else if(this.janela == "Fechada"){
            System.out.println("A jánela já esta fechada" + this.nome);
        }
        
        
    }  
   public void exibeestado(){
       System.out.println("_________________________________");
       System.out.println(this.nome);
       System.out.println ("Motor: "+ this.motor);
       System.out.println ("velocidade: " + this.velocidadeatual);
       System.out.println ("Número de portas: " + this.portas);
       System.out.println ("Números de rodas: " + this.numerorodas);
       System.out.println("Farol: " + this.farol);
       System.out.println("Janela: " + this.janela);
       System.out.println("_________________________________");
       
   } 
    
    
    
    
}
