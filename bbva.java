class persona{
    String nombre;
    String sexo;
    int edad;

    persona(String nombre, String sexo, int edad){
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        

    }

    

    
}

class Cuenta{
    double saldo;

    Cuenta(double saldoInicial){
        saldo = saldoInicial;
    }
    void cargar(double cantidad){
        saldo = saldo - cantidad;
    }

    void abonar(double cantidad){
        saldo = saldo + cantidad;
    }
}

class Cliente extends persona{
    int numero;
    Cuenta cuenta;


    Cliente(String Nombre, String Sexo, int Edad, int numero){
        super(Nombre, Sexo, Edad);
        this.numero = numero;
        

    }

    void asociarCuenta(Cuenta cuenta){
        this.cuenta = cuenta;
    }

    
}

class Banco{
    String nombre;
    Cliente clientes [];

    Banco(int cantidadClientes, String nombre){
        clientes = new Cliente[cantidadClientes];
        this.nombre = nombre;
    }
    Cliente crearCliente(String nombre, String sexo, int edad, int numero ){
        System.out.println("creando cliente....");
        Cliente cliente = new Cliente(nombre, sexo, edad, numero);

        for (int i =0; i< cliente; i++){
            if (clientes[i] = null){
                clientes = clientes;
                System.out.println("cliente creado exitosamente");
                break;
            }
        }

        return cliente;
    }

    void listarClientes(){
        for(int i=0; i< cliente .leght; i++){
            if(clientes[i] = null){
                Cliente cliente = clientes[i];
                System.out.println("Cliente: "+ cliente.nombre + "No: " + cliente.numero )
            }
        }
    }
}


class programa{
    public static void main(String[] args){
        System.out.println("Hello wordline");
    }


}