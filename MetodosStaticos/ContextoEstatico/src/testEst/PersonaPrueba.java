package testEst;

import domainEst.Persona;

public class PersonaPrueba {
    private int contador;
    
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan");
        Persona persona2 = new Persona("Karla");
       
        
        //Cuando utilizamos el metodo imprimir simepre tiene que tener el metodo static ya que el metodo main tambien es static  y si el
        //el metodo imprimir no fuera static nos lanzaria un error por que  pasa esto? por que el metodo imprimir se asocia
        
        //no podemos mandar a llamar metodos no static desde un metodo que si es static
        imprimir(persona1);
        imprimir(persona2);
        
        //this.contador = 10;
    }
    
    public static void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }
    
    public int getContador(){
        imprimir(new Persona("Carlos"));
        return this.contador;
    }
}
