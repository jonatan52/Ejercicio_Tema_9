public class Main {
   public static void main(String[] args){
        Cliente cliente = new Cliente();
        //Trabajador trabajador = new Trabajador();
        cliente.nombre = "Jonatan";
        cliente.edad = 35;
        cliente.telefono = 32158752;
        cliente.credito = 5000000;
       System.out.println("----------- Cliente-----------");
        System.out.println("Nombre:" + cliente.nombre + "\n" +
                           "Edad: "  + cliente.edad + "\n" +
                           "Telefono: " + cliente.telefono + "\n" +
                           "Credito aprobador de $: " + cliente.credito );

       System.out.println("----------- Trabajador-----------");
        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Bryan";
        trabajador.edad = 22;
        trabajador.telefono = 321582678;
        trabajador.salario = 1500000;
        System.out.println("Nombre:" + trabajador.nombre + "\n" +
                "Edad: "  + trabajador.edad + "\n" +
                "Telefono: " + trabajador.telefono + "\n" +
                "Salario: " + trabajador.salario + " Pesos");

    }
}
class Persona{
    String nombre;
    int edad;
    int  telefono;
}

class Cliente extends Persona{
    double credito;
}

class Trabajador extends Persona{
    double salario;
}