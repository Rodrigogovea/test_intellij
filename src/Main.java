import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        //System.out.println("Hello world!");
        Scanner lector = new Scanner(System.in);
        memoria_dinamica temperaturas = new memoria_dinamica();
        int opc= 0;
        double elDato = 0;
        do{
            System.out.println("Menu " +
                    "\n 1.- Ingresar temperatura" +
                    "\n 2.- Ver registro de temperaturas" +
                    "\n 3.- Eliminar un registro" +
                    "\n 4.- Modificar un registro" +
                    "\n 5.- Salir");
            opc = lector.nextInt();
            switch(opc)
            {
                case 1:
                    System.out.println("Teclea una temperatura");
                    elDato = lector.nextDouble();
                    temperaturas.ingresarDato(elDato);
                    break;
            }
        }while(opc!=5);


/*
        temperaturas.ingresarDato(30.5);
        temperaturas.ingresarDato(22);
        temperaturas.ingresarDato(25.1);
        temperaturas.ingresarDato(33.3);
        temperaturas.ingresarDato(37.2);

        temperaturas.ingresarDato(40.2);

        temperaturas.mostrarDatos();

        temperaturas.obtenerPromedios();*/
    }
}