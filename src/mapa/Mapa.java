
package mapa;


public class Mapa {

    public static void main(String[] args) {
        
        Moto m1 = new Moto() ;
        Carro c1 = new Carro();       
        Caminhao cc1 = new Caminhao();
        m1.ligarmotor();
        c1.ligarmotor();
        cc1.ligarmotor();
        m1.acelerar();
        m1.acelerar();
        c1.acelerar();
        c1.acelerar();
        cc1.acelerar();
        cc1.acelerar();
        cc1.trocarpneus();
        m1.exibeestado();
        c1.exibeestado();
        cc1.exibeestado();
     }
}
