public class Vehículo {
    //Definir las variables de instancia
    public String marca;
    public double precio;
    public String motor;
    //Definir el constructor
    public Vehículo(String marca, double precio, String motor){
        this.marca = marca;
        this.precio = precio;
        this.motor = motor;
    }
    //Métodos estándar
    //Getter
    public String getMarca(){
        return this.marca;
    }
    public double getPrecio(){
        return this.precio;
    }
    public String getMotor(){
        return this.motor;
    }
    //Setter
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public void setMotor(String motor){
        this.motor = motor;
    }
    @Override
    public String toString(){
        String cadena;
        cadena = "Razón Social: " + this.marca + "\n" +
                "RFC: " + this.precio + "\n" +
                "Email: " + this.motor + "\n";
        return cadena;
    }
}
