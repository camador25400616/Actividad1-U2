public class Venta {
     //Definir las variables de instancia
    public int cantidad;
    public Vehiculo vehiculo;
    public Cliente cliente;
    //Definir el constructor
    public Venta(int cantidad, Vehiculo vehiculo, Cliente cliente){
        this.cantidad = cantidad;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
    }
    //Métodos estándar
    //Getter
    public int getCantidad(){
        return this.cantidad;
    }
    public Vehiculo getVehiculo(){
        return this.vehiculo;
    }
    public Cliente getCliente(){
        return this.cliente;
    }
    //Setter
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    public void setVehiculo(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
    }
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    @Override
    public String toString(){
        String cadena;
        cadena = "Cantidad: " + this.cantidad + "\n" +
                "Vehículo: " + this.vehiculo + "\n" +
                "Cliente: " + this.cliente + "\n";
        return cadena;
    }
}
