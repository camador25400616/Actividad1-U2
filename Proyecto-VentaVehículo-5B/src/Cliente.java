//Definir la clase
public class Cliente {
    //Definir las variables de instancia
    public String rs;
    public String rfc;
    public String email;
    //Definir el constructor
    public Cliente(String rs, String rfc, String email){
        this.rs = rs;
        this.rfc = rfc;
        this.email = email;
    }
    //Métodos estándar
    //Getter
    public String getRs(){
        return this.rs;
    }
    public String getRfc(){
        return this.rfc;
    }
    public String getEmail(){
        return this.email;
    }
    //Setter
    public void setRs(String rs){
        this.rs = rs;
    }
    public void setRfc(String rfc){
        this.rfc = rfc;
    }
    public void setEmail(String email){
        this.email = email;
    }
    @Override
    public String toString(){
        String cadena;
        cadena = "Razón Social: " + this.rs + "\n" +
                "RFC: " + this.rfc + "\n" +
                "Email: " + this.email + "\n";
        return cadena;
    }
}
