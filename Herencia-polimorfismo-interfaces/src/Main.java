public class Main {
    public static void main(String[] args) {


        //Datos cliente
        Cliente cliente = new Cliente();
        cliente.setEdad(27);
        cliente.setCredito(10000);
        cliente.setTelefono("665574833");
        cliente.setNombre("Daniel");


            System.out.println("Nuevos datos de CLIENTE");
            System.out.println("El nombre del cliente es " + cliente.getNombre());
            System.out.println("La edad del cliente es " + cliente.getEdad());
            System.out.println("El credito del cliente es " + cliente.getCredito());
            System.out.println("El telefono del cliente es " + cliente.getTelefono());



        //Datos trabajador
        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(33);
        trabajador.setTelefono("667830133");
        trabajador.setNombre("Fernando");
        trabajador.setSalario(1200);

            System.out.println("Nuevos datos de TRABAJADOR");
            System.out.println("El nombre del trabajador es " + trabajador.getNombre());
            System.out.println("La edad del trabajador es " + trabajador.getEdad());
            System.out.println("El telefono del trabajador es " + trabajador.getTelefono());
            System.out.println("El salario del trabajador es " + trabajador.getSalario());


    }
}

class Persona{
    private int edad;
    private String nombre;
    private String telefono;

        public void setEdad(int edad){
                this.edad = edad;

            }
            public int getEdad(){
                return this.edad;
    }

    public void setNombre(String nombre){
            this.nombre = nombre;
    }

    public String getNombre(){
            return this.nombre;
    }


    public void setTelefono(String telefono){
            this.telefono = telefono;
    }

    public String getTelefono(){
            return this.telefono;
    }


}

class Cliente extends Persona{

    int credito;

    public void setCredito(int credito){
        this.credito = credito;
    }

    public int getCredito(){
        return this.credito;
    }


}

class Trabajador extends Persona{

   int salario;


   public void setSalario(int salario){
       this.salario = salario;
   }

   public int getSalario(){
       return this.salario;
   }

}