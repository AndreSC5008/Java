import java.util.Scanner;

public class Main {
    public static void main(String[] args)   {
        int edad,dec;
        String nombre, correo, telefono, nvNombre;
        Scanner sc= new Scanner(System.in);
        System.out.println("Hola cliente");
        System.out.println("Nombre del contacto");
        nombre= sc.nextLine();
        System.out.println("Correo");
        correo= sc.nextLine();
        System.out.println("Telefono");
        telefono= sc.nextLine();
        System.out.println("Edad");
        edad= sc.nextInt();

        Contacto C1= new Contacto(edad, nombre, correo,telefono);
        do {
            System.out.println("Acciones a realizar");
             System.out.println("1 Calcular fecha de nacimiento");
            System.out.println("2 Cambiar nombre");
            System.out.println("3 Imprimir Datos");
            System.out.println("4 Salir");
            dec = sc.nextInt();

            switch (dec) {
                case 1:
                    C1.CalcularEdad();
                    break;
                case 2:
                    System.out.println("Nuevo nombre");
                    nvNombre = sc.next();
                    C1.setNombre(nvNombre);
                    break;

                case 3:
                    C1.Imprimir();
                    break;

                default:
                    break;
            }
        } while(dec!=4);

    }
}

