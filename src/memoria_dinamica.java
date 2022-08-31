import java.util.ArrayList;
public class memoria_dinamica
{
    ArrayList<Double> temperaturas = new ArrayList<>();
    memoria_dinamica()
    {
    }
    public void ingresarDato(double dato)
    {
        temperaturas.add(dato);
    }
    public void buscarDato(double dato)
    {
        temperaturas.equals(dato);
    }
    public void borrarDato(double dato)
    {
        temperaturas.remove(dato);
    }
    public void mostrarDatos()
    {
        System.out.println(temperaturas);
    }

    public void obtenerPromedios()
    {
        double suma = 0;
        double promedio;
        for(int i = 0; i<temperaturas.size(); i++)
        {
            suma+=temperaturas.get(i);
        }
        promedio = suma/temperaturas.size();
        System.out.println("El promedio de las temperaturas es: " + promedio + " °C");
    }
}
