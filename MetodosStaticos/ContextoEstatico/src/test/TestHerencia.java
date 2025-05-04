package test;
//ahora vamos es crear otro paquete para hacer la prueba del paquete  domain 
// para hacer esto primero tenemos que importar el paquete domain de todos los archivos para hacer que compilen tus objetos
import domain.Cliente;
import domain.Empleado;
import domain.Persona;
import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 5000.0);
        System.out.println("empleado1 = " + empleado1);
        
        System.out.println(" ");
        
        Empleado empleado2 = new Empleado("Jose", 2050, 'B', 20, "12 de octubre");
        System.out.println("Empleado 2 =" + empleado2);
        
        
        System.out.println("");
        
        var fecha = new Date();
        Cliente cliente1 = new Cliente(fecha, true, "Karla", 'F', 28, "Mi cassa");
        System.out.println("cliente1 = " + cliente1);
        
        System.out.println(" ");
        
        Persona persona1 = new Persona("Rodolfo ", 'M' ,29, "MIcasa");
        System.out.println("persona1 = " + persona1);
    }
}
