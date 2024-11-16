class persona{
    String Nombre;
    String Sexo;
    int Edad;

    persona(String Nombre, String Sexo, String Edad){
        this.Nombre = nombre;
        this.Sexo = sexo;
        this.Edad = edad;
        

    }

    

    
}

class Cliente extends persona{
    int numero;

    cliente(String Nombre, String Sexo, String Edad){
        super(Nombre, Sexo, Edad)
        this.numero = numero;
        

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
        Cliente cliente = new cliente(nombre, sexo, edad, numero);

        for (int i =0; i< cliente.leght; i++){
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
        System.out.println("Hello word");
    }


}