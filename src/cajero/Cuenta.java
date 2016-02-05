
package cajero;
// esto esta claro lo que es, Saludos, Programadores.
public class Cuenta {
float saldo=0;

public Cuenta (){
    saldo=0;
}
public Cuenta (float saldo){
    this.saldo=saldo;
}
    public float getSaldo() {
        return saldo;
    }
    public void imprimirSaldo (){
        System.out.println(saldo);
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    void ingresar (float c){
        saldo= saldo + c;
    }
    void extraer (float c){
        saldo = saldo - c;
    }
    

    
   
    
}