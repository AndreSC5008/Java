public class Contacto {
    private int edad;
    private String nombre, correo, telefono;

    public Contacto(int edad, String nombre, String correo, String telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }

    public void CalcularEdad(){
        edad= 2021-edad;
        setEdad(edad);
        System.out.println(edad);
    }

    public void Imprimir(){
        System.out.println(edad);
        System.out.println(nombre);
        System.out.println(correo);
        System.out.println(telefono);
    }

    //GETTERS AND SETTERS
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
